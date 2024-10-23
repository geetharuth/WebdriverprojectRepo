package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Psep02_collectioncheckboxes {

	public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.myntra.com/");
		//suspend tool from execution
		Thread.sleep(2000);
		//create object for instance class
		Actions ac=new Actions(driver);
		//click on men
		ac.moveToElement(driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"))).perform();
		//click on t-shirts
		ac.moveToElement(driver.findElement(By.linkText("T-Shirts"))).click().perform();
		Thread.sleep(2000);
		//get collection of checks boxes
		List<WebElement> allboxes=driver.findElements(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']"));
		System.out.println("no of checkboxes::"+allboxes.size());
	   //get text
		for(WebElement each : allboxes)
		{
			System.out.println(each.getText());
		}
driver.quit();
	}

}
