package aug27;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) throws Throwable {
		// create object for instance
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https:/gmail.com");
				//suspend tool from execution 
				Thread.sleep(3000);
				//getparent handel
				String parent = driver.getWindowHandle();
				System.out.println(parent);
				//click on links
				driver.findElement(By.linkText("Help")).click();
				driver.findElement(By.linkText("Privacy")).click();
				driver.findElement(By.linkText("Terms")).click();
				//getcollection all windows
				Set<String> allwindows=driver.getWindowHandles();
				System.out.println(allwindows);
				for(String each:allwindows) {
					//if parent id is not equal then switch to child window
					if(!parent.equals(each)) {
						driver.switchTo().window(each);
						System.out.println(driver.getTitle());
						Thread.sleep(5000);
						driver.close();
					}
				}
				//switch to parent 
				driver.switchTo().window(parent);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
				driver.findElement(By.name("identifier")).sendKeys("ruthgeetha");
				Thread.sleep(5000);
				driver.quit();
				
	}

}
