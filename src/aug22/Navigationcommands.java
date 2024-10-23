package aug22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {

	public static void main(String[] args) throws Throwable {
	//create object for instance
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url 
		driver.navigate().to("https://www.google.com/");
		System.out.println("title1:: "+driver.getTitle());
		//suspend tool from execution 
		Thread.sleep(5000);
		//gettitle  and click gmail link
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("title2:: "+driver.getTitle());
		Thread.sleep(5000);
		//navigate to google by using back button
		driver.navigate().back();
		System.out.println("title3:: " +driver.getTitle());
		Thread.sleep(5000);
		//navigate to google by using forward button
		driver.navigate().forward();
		System.out.println("title4:: " +driver.getTitle());
		Thread.sleep(5000);
		//navigate to refresh 
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();






	}

}
