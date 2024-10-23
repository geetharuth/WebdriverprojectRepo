package aug15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws Throwable {
		// Create object for instance
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url 
		driver.get("https://www.google.com/");
		//suspend tool from execution
		Thread.sleep(5000);
		driver.quit();
		

	}

}
