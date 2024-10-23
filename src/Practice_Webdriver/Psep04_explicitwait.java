package Practice_Webdriver;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Psep04_explicitwait {

	public static void main(String[] args) {
		// create object for instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		//create object for wait 
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait until element is clickable
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account"))).click();
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("Testing");
		driver.quit();

	}

}
