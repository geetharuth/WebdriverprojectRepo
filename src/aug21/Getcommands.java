package aug21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) throws Throwable {
		//create object for instance
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url 
		driver.get("https://www.google.com/");
		//suspend tool from execution 
		Thread.sleep(5000);
		//print title of the page
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		Thread.sleep(2000);
		//print title length 
		System.out.println(pagetitle.length());
		//getcurrent url of the page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		//print the length url
		System.out.println(url.length());
		driver.quit();



	}

}
