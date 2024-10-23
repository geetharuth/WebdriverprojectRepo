package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Psep02_checksboxesfb {

	public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.facebook.com/");
		//suspend tool from execution
		Thread.sleep(2000);
		//verify email text box is enabled or disabled
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		boolean value=email.isEnabled();
		System.out.println(value);
		//verify the password textbox is displayed or not
		WebElement textbox=driver.findElement(By.xpath("//input[@id='pass']"));
		boolean password=textbox.isDisplayed();
		System.out.println(password);
		//close browser
		driver.quit();
		

	}

}
