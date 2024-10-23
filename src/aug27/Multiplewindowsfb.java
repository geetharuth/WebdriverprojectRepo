package aug27;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiplewindowsfb {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//click three links to open in new tab
		driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
		driver.findElement(By.xpath("(//a[starts-with(text(),'Privacy Policy')])[2]")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();
		//get collection of all window ids
		Set<String> all_wins = driver.getWindowHandles();
		//iterate all windows
		Iterator<String> brw=all_wins.iterator();
				while (brw.hasNext()) {
				String child = (String) brw.next();
				if(!parent.equals(child))
				{
					driver.switchTo().window(child);
					System.out.println(driver.getTitle());
					Thread.sleep(4000);
					driver.close();
					
				}
				
			
		}
				driver.switchTo().window(parent);
				System.out.println(driver.getTitle());
				Thread.sleep(4000);
				Select yearList = new Select(driver.findElement(By.id("year")));
				List<WebElement> all_Items = yearList.getOptions();
				System.out.println("No of items are::"+all_Items.size());
				for (WebElement each : all_Items) {
					System.out.println(each.getText());
				}
				Thread.sleep(5000);
				driver.quit();
	}
}

		


