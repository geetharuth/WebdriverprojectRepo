package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug22_Webelements_errormesaz {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://orangehrm.qedgetech.com/");
		//suspend tool from execution
		Thread.sleep(2000);
		//store username textbox into webelement
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//clear text in username
		username.clear();
		//enter username
		username.sendKeys("admin");
		//capture username
		String usernametext=username.getText();
		//store password textbox into webelement
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		//clear text in password
		password.clear();
		//enter password
		password.sendKeys("qedge");
		//capture password
		String passwordtext=password.getText();
		Thread.sleep(2000);
		//click login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		String actual=driver.getTitle();
		String expected="dashboard";
		//verify title
		if(actual.contains(expected))
		{
			System.out.println("login sucess::"+actual+"   "+expected);
		}
		else
		{
			System.out.println("login not sucess::"+actual+"   "+expected);
		}
		Thread.sleep(2000);
		//capture error mesaz using gettext
		String error_messaz=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		System.out.println(error_messaz);
		driver.quit();	
	}


}
