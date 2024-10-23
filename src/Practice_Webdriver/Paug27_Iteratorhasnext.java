package Practice_Webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug27_Iteratorhasnext {

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
		Iterator<String> brw= all_wins.iterator();
		while(brw.hasNext())
		{
			String child=(String)brw.next();
			//if parent id not equals to all then switch to child window
			if(!brw.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
			}
			
		}
		//switch to parent
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		//close browser
		driver.quit();

	}

}
