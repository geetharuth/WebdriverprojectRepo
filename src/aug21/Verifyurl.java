package aug21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyurl {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//create object for instance
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url 
		driver.get("https://www.google.com/");
		//suspend tool from execution 
		Thread.sleep(5000);
		//store variables into string
		String Expected = "https://";
		String Actual= driver.getCurrentUrl();
		//get current url
		if(Actual.startsWith(Expected)) 
		{
			System.out.println("this is matched"+Actual+"  "+Expected);
		}
		else 
		{
			System.out.println("this is not matched"+Actual+"  "+Expected);
		}	
		driver.quit();
	}


}
