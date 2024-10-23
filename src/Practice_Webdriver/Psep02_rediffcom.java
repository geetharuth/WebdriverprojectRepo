package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Psep02_rediffcom {

	public static void main(String[] args) throws Throwable {
		//create instance object
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				//suspend tool from execution
				Thread.sleep(2000);
				//verify checkbox is checked or unchecked 
				WebElement checkbox = driver.findElement(By.id("remember"));
				boolean value=checkbox.isSelected();
				System.out.println(value);
				//uncheck from check box
				checkbox.click();
				//close browser
				driver.quit();
				 
				
				
				
				
				
				
	}

}
