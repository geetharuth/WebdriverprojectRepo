package Practice_Webdriver;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Paug28_clickmouse {

	public static void main(String[] args) throws Throwable {
		//create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://www.gmail.com/");
				//suspend tool from execution
				Thread.sleep(5000);
				//create object for actions class 
				Actions ac=new Actions(driver);
				//take mouse to create account
				ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']")));
				ac.click().perform();
				ac.pause(2000);
				//press up arrow in keyboard for three times
				ac.sendKeys(Keys.ARROW_UP).perform();
				ac.pause(2000);
				ac.sendKeys(Keys.ARROW_UP).perform();
				ac.pause(2000);
				ac.sendKeys(Keys.ARROW_UP).perform();
				ac.pause(2000);
				//press enter button
				ac.sendKeys(Keys.ENTER).perform();
				//create account fname and lname
				(driver.findElement(By.xpath("//input[@id='firstName']"))).sendKeys("i want to get job");
				(driver.findElement(By.xpath("//input[@id='lastName']"))).sendKeys("iam jesus kid");
				//click next button
				ac.moveToElement(driver.findElement(By.xpath("//div[@id='collectNameNext']//div[3]")));
				ac.click().perform();
				Thread.sleep(2000);
				//select month list box
				Select month=new Select(driver.findElement(By.id("month")));
				//get no of items in month list
				List<WebElement> monthlist=month.getOptions();
				System.out.println("no of items::"+monthlist.size());
				ac.pause(5000);
				//get text of all items
				for(WebElement each :monthlist)
				{
					//get text of all items in each
					System.out.println(each.getText());
				}
				
				driver.quit();
				
				
				
				
	}

}
