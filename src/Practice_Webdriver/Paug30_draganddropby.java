package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.OffsetMapping.Target;

public class Paug30_draganddropby {

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
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		//get target x and y coordinates
		int x=target.getLocation().getX();
		int y=target.getLocation().getY();
		System.out.println(x+"   "+y);
		ac.dragAndDropBy(source, x, y).perform();
		driver.quit();

	}

}
