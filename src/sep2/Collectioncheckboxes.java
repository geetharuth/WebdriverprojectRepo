package sep2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Collectioncheckboxes {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.myntra.com/");
	Thread.sleep(4000);
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"))).perform();
	Thread.sleep(4000);
	ac.moveToElement(driver.findElement(By.linkText("T-Shirts"))).click().perform();
	Thread.sleep(4000);
	//get collection of checkboxes
	List<WebElement>all_checkbox = driver.findElements(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']"));
	System.out.println(all_checkbox.size());
	for (WebElement each : all_checkbox) {
		System.out.println(each.getText());
	}
	 driver.quit();

}
}