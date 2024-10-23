package aug30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://jqueryui.com/droppable/");
		//suspend tool from execution
		Thread.sleep(5000);
		//switch to iframes
		driver.switchTo().frame(0);
		//find element id 
		Actions ac = new Actions(driver);
		WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement traget=driver.findElement(By.xpath("//div[@id='droppable']"));
		ac.dragAndDrop(source, traget).perform();
		driver.quit();

	}

}
