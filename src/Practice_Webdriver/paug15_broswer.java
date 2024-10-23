package Practice_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paug15_broswer {
	public static void main(String[] args) throws Throwable {
		//create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.google.com/");
		//suspend tool from execution
		Thread.sleep(2000);
	}

	
}
