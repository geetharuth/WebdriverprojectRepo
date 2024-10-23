package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug26_invalidloginalert {

	public static void main(String[] args) throws Throwable {
		// create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("http://primusbank.qedgetech.com/");
				//suspend tool from execution
				Thread.sleep(2000);
				//enter invalid login details
				driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("admin");
				driver.findElement(By.name("txtPword")).sendKeys("admi");
				driver.findElement(By.xpath("//input[@id='login']")).click();
				//capture alert text
				String error_messaz=driver.switchTo().alert().getText();
				System.out.println(error_messaz);
				Thread.sleep(2000);
				//click ok button
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				//close browser
				driver.quit();
				
				
				
	}

}
