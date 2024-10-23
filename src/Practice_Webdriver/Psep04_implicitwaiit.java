package Practice_Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Psep04_implicitwaiit {

	public static void main(String[] args) {
		// create object for instance
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://facebook.com");
				//wait for 10secs
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.findElement(By.linkText("Create new account")).click();
				driver.findElement(By.name("firstname")).sendKeys("Testing");
				driver.quit();

	}

}
