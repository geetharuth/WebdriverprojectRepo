package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paug30_framecollection {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://jqueryui.com/droppable/");
		//suspend tool from execution
		Thread.sleep(3000);
		//create object for action
		Actions ac=new Actions(driver);
		//get collection i frames
		List<WebElement> frames=driver.findElements(By.tagName("a"));
		System.out.println("collection of frames::"+frames.size());
		//switch to first frames
		driver.switchTo().frame(0);
		//perfom click and hold and realse action for drag and drop 
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		ac.clickAndHold(source).moveToElement(target).release().perform();
		
//verify if drag and drop is sucess
if(target.equals("dropped!"))
{
	System.out.println("drag and drop is sucess");
}
//switch to main html
driver.switchTo().defaultContent();
Thread.sleep(3000);
//click on tabs button
ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Tabs']"))).click().perform();
Thread.sleep(2000);
//quit driver
driver.quit();

	}

}
