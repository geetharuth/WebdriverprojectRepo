package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug20_adminlogin {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool from execution
		Thread.sleep(2000);
		//login to admin
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		//close broswer
		driver.quit();
	}

}
