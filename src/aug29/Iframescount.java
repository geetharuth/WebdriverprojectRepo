package aug29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframescount {

	public static void main(String[] args) throws Throwable {
		////create instance for object 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.rediff.com/");
		//suspend tool from execution
		Thread.sleep(5000);
		//count of iframes 
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		Thread.sleep(5000);
	       driver.quit();
		

	}

}
