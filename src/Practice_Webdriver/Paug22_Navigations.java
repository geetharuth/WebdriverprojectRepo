package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug22_Navigations {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.navigate().to("https://www.google.com/");
		System.out.println("page title[1]::"+driver.getTitle());
		//suspend tool from execution
		Thread.sleep(2000);
		//click on gmail link gettitle
		driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).click();
		System.out.println("page title[2]::"+driver.getTitle());
		Thread.sleep(2000);
		//click backbutton in browser gettitle
		driver.navigate().back();
		System.out.println("page title[3]::"+driver.getTitle());
		Thread.sleep(2000);
		//click forwardbutton in browser gettitle
		driver.navigate().forward();
		System.out.println("page title[4]::"+driver.getTitle());
		Thread.sleep(2000);
		//reload page
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();

	}

}
