package aug29;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotmultiples {

	public static void main(String[] args) throws Throwable {
		//create object for instance 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url 
		driver.get("https://www.google.com/");
		//suspend tool from execution
		Thread.sleep(3000);
       //click on gamail
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Gmail']")));
		ac.contextClick().perform();
		Thread.sleep(3000);
		//create obejct for robot class
		Robot r = new Robot();
		//press down arrow in keyboard
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		//click enter key
		r.keyPress(KeyEvent.VK_ENTER);
		//store all windows into arraylist
		ArrayList<String>allwins=new ArrayList<String>(driver.getWindowHandles());
		//switch to gmail window
		driver.switchTo().window(allwins.get(1));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Sign in']"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		//switch parent window
		driver.switchTo().window(allwins.get(0));
		System.out.println(driver.getTitle());
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
