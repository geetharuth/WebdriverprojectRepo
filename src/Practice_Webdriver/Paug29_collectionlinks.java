package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Paug29_collectionlinks {

	public static void main(String[] args) throws Throwable {
		//create instance for object 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.flipkart.com/");
		//suspend tool from execution
		Thread.sleep(3000);
		//create object for actions class
		Actions ac=new Actions(driver);
		//in keyboard press escape
		ac.sendKeys(Keys.ESCAPE).perform();
		//mouse hover to electronics
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().perform();
		ac.pause(2000);
		//mouse hover to electronics
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).click().perform();
		ac.pause(2000);
		//get collection of all links
		List<WebElement> all_links=driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println( all_links.size());
		//get text of all links
		for(WebElement each :all_links )
		{
			System.out.println(each.getText());
		}
		driver.quit();
	}

}
