package Practice_Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug27_handelmultiplewind {

	public static void main(String[] args) throws Throwable {
		// create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://www.gmail.com/");
				//suspend tool from execution
				Thread.sleep(2000);
				//get parent window id
				String parent=driver.getWindowHandle();
				System.out.println(parent);
//click on three link to open in new tabs
				driver.findElement(By.linkText("Help")).click();
				driver.findElement(By.linkText("Privacy")).click();
				driver.findElement(By.linkText("Terms")).click();
				//get collection of all windows
				Set<String> all_wins=driver.getWindowHandles();
				System.out.println(all_wins);
				Thread.sleep(2000);
				//iterate all windows
				for(String each : all_wins)
				{
					Thread.sleep(2000);
					//if parent id not equal to each then switch to child window
					if(!parent.equals(each))
					{
						driver.switchTo().window(each);
						System.out.println(driver.getTitle());
						Thread.sleep(2000);
					}
				}
				//switch to parent 
				driver.switchTo().window(parent);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				driver.quit();
				
				
				
				
				
				
	}

}
