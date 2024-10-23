package aug30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framecollection {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://jqueryui.com/droppable/");
		//suspend tool from execution
		Thread.sleep(2000);
		//create actions class
		Actions ac =new Actions(driver);
		//get collection of frames
	List<WebElement> allframes= driver.findElements(By.tagName("a"));
	System.out.println(allframes.size());
	//switch to frames
	driver.switchTo().frame(0);
	//drag and drop
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	ac.clickAndHold(source).moveToElement(target).release().perform();
	if(target.getText().equals("Dropped!"))
	{
		System.out.println("drag and drop sucess");
	}
	Thread.sleep(2000);
	//switch back to main html page
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	ac.moveToElement(driver.findElement(By.linkText("Tabs"))).click().perform();
	Thread.sleep(5000);
	driver.quit();
	}

}
