package aug29;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Collectionlinks {

	public static void main(String[] args) throws Throwable {
		
		//create instance for object 
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://www.flipkart.com/");
				Actions ac= new Actions(driver);
				ac.sendKeys(Keys.ESCAPE).perform();
				//suspend tool from execution
				Thread.sleep(5000);
				//collection of iframes in google page filpcart
				ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().perform();
				ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
				ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();
				//collection  count
				List<WebElement> alllinks=driver.findElements(By.tagName("a"));
				System.out.println("number of links::" +alllinks.size());
				//collection text
				for(WebElement each :alllinks)
				{
					System.out.println(each.getText());
				}
				Thread.sleep(5000);
				driver.quit();
				

	}

}
