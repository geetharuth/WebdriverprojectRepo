package sep2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checksboxfb {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.facebook.com/");
		//suspend tool from execution
		Thread.sleep(5000);
		//to check is enabled or disabled
		WebElement emailtextbox=driver.findElement(By.xpath("//input[@id='email']"));
		boolean is_Enabled=emailtextbox.isEnabled();
		System.out.println(is_Enabled);
		//verify it is displayed or not
		WebElement passbox = driver.findElement(By.xpath("//input[@id='pass']"));
		boolean is_displayed= passbox.isDisplayed();
		System.out.println(is_displayed);
		driver.quit();
	}

}
