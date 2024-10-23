package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paug30_draganddrop {

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
				//swith to frame
				driver.switchTo().frame(0);
				//perform drag and drop
				WebElement source =driver.findElement(By.xpath("//div[@id='draggable']"));
				WebElement target =driver.findElement(By.xpath("//div[@id='droppable']"));
		ac.dragAndDrop(source, target).perform();
		//close browser
		driver.quit();

	}

}
