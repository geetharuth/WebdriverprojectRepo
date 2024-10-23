package Practice_Webdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paug21_googlesearch {

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
				driver.findElement(By.id("APjFqb")).sendKeys("Selenium openings");
				//create actions class
				Actions ac=new Actions(driver);
				//press down arrow in keyboard for 3 times
				ac.sendKeys(Keys.ARROW_DOWN).perform();
				ac.pause(2000);
				ac.sendKeys(Keys.ARROW_DOWN).perform();
				ac.pause(2000);
				ac.sendKeys(Keys.ARROW_DOWN).perform();
				ac.pause(2000);
				//press enter 
				ac.sendKeys(Keys.ENTER).perform();
				Thread.sleep(5000);
				//close browser
				driver.quit();

	}

}
