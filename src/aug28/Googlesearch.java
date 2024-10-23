package aug28;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googlesearch {
public static void main(String[] args) throws Throwable {
		//create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.google.com/");
		//suspend tool from execution
		Thread.sleep(5000);
		//search on google textbox
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium openings ");
		//create actions class
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.pause(2000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.pause(2000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.pause(2000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
