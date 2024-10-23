package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paug29_Flipcart {

	public static void main(String[] args) throws Throwable {
		//create instance for object 
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://www.flipkart.com/");
				//suspend tool from execution
				Thread.sleep(5000);
				//create object for actions class
				Actions ac=new Actions(driver);
				//move hover to electronics
				ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().perform();
				Thread.sleep(2000);
				//move hover to electronics
				ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).click().perform();
				Thread.sleep(2000);
				//mouse hover to vivo's and click action
				ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Vivo']"))).click().perform();
				Thread.sleep(2000);
				//mouse hover to baby and kids 
				ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).click().perform();
				Thread.sleep(2000);
				//mouse hover to puzzles and click actions
				ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Puzzles']"))).click().perform();
				Thread.sleep(2000);
				//close browser
				driver.quit();

	}

}
