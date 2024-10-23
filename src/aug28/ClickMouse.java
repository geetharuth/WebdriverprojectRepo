package aug28;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClickMouse {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(5000);
		//create object for Actions class
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		//take mouse to create account
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']")));
		ac.click().perform();
		ac.pause(5000);
		//press up arrow in keybord for three times
		ac.sendKeys(Keys.ARROW_UP).perform();
		ac.pause(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		ac.pause(5000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		ac.pause(5000);
		//press enter keys
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Iam so lazy");
		driver.findElement(By.name("lastName")).sendKeys("but iwant job");
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Next']"))).click().perform();
		Thread.sleep(2000);
		Select monthlist = new Select(driver.findElement(By.id("month")));
		List<WebElement> all_Items =monthlist.getOptions();
		System.out.println("No of items are::"+all_Items.size());
		Thread.sleep(4000);
		for (WebElement each : all_Items) {
			System.out.println(each.getText());
		}
		driver.quit();
	}
}
	
		

		
