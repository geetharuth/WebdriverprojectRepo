package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug26_alerts {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool from execution
		Thread.sleep(2000);
		//enter valid login details
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		//click branches button
		driver.findElement(By.xpath("(//img[contains(@width,'132')])[1]")).click();
		Thread.sleep(2000);
		//click delete button
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		//capture alert text
		String branchtext=driver.switchTo().alert().getText();
		System.out.println(branchtext);
		Thread.sleep(2000);
		//click cancel button
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		//click delete button
		driver.findElement(By.xpath("//tbody/tr[3]/td[8]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		//click ok button
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//capture alert text
		String branchconftext=driver.switchTo().alert().getText();
		System.out.println(branchconftext);
		Thread.sleep(2000);
		//click ok button
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//close browser
		driver.quit();








	}

}
