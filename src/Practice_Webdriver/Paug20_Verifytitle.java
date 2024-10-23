package Practice_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug20_Verifytitle {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.google.com/");
		//suspend tool from execution
		Thread.sleep(2000);
		String actual= driver.getTitle();
		String expected="google";
		//verify title
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("title is matching::"+actual+"           "+expected);
		}
		else
		{
			System.out.println("title is not matching::"+actual+"           "+expected);
		}
driver.quit();
	}

}
