package Practice_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug20_Verifyurl {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.google.com/");
		//suspend tool from execution
		Thread.sleep(2000);
		String actual=driver.getCurrentUrl();
		String expected="https:";
		//verify url
		if(actual.contains(expected))
		{
			System.out.println("url is secured::"+actual+"     "+expected);
		}
		else
		{
			System.out.println("url is not secured::"+actual+"     "+expected);
		}
		driver.quit();

	}

}
