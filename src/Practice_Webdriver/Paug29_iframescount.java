package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug29_iframescount {

	public static void main(String[] args) throws Throwable {
		//create instance for object 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.rediff.com/");
		//suspend tool from execution
		Thread.sleep(5000);
		//get collection of iframes in a page
		List<WebElement> frameslist=driver.findElements(By.tagName("iframe"));
		System.out.println(frameslist.size());
		Thread.sleep(5000);
		driver.quit();

	}

}
