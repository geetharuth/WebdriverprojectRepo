package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug20_text_attribute {

	public static void main(String[] args) throws Throwable {
		// create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://www.google.com/");
				//suspend tool from execution
				Thread.sleep(2000);
				//get gmail text from google page using gettext method
				String gmailtext=driver.findElement(By.linkText("Gmail")).getText();
				System.out.println(gmailtext);
				//get gmail link url using getattribute
				String gmaillkurl=driver.findElement(By.linkText("Gmail")).getAttribute("href");
				System.out.println(gmaillkurl);
				driver.quit();

	}

}
