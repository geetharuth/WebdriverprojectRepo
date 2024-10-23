package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flipcart {

	public static void main(String[] args) throws Throwable {
		//create instance for object 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.flipkart.com/");
		//suspend tool from execution
		Thread.sleep(5000);
		//store element into listbox
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//div)[71]"))).click().perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).click().perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Vivo']"))).click().perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Baby & Kids']"))).click().perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Puzzles']"))).click().perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
