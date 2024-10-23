package aug30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Draganddropby {

	public static void main(String[] args) {
		//create object for instance
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://jqueryui.com/droppable/");
		//create actions object
		Actions ac= new Actions(driver);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));
        //get targets of x and coordinators
		int x= target.getLocation().getX();
		int y=target.getLocation().getY();
		System.out.println(x+"    "+y);
		ac.dragAndDropBy(source, x, y).perform();
		driver.quit();
	}

}
