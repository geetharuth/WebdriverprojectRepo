package aug23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcollectionjava {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool from execution 
		Thread.sleep(3000);
		//store into webelement and size of links 
		List<WebElement> all_links=driver.findElements(By.tagName("a"));
		System.out.println("number of links::  "+all_links.size());
		Thread.sleep(3000);
		for(WebElement each:all_links) 
		{
			//get links names
			System.out.println(each.getText());
			//get links urls
			System.out.println(each.getAttribute("href"));
		}
		driver.quit();

	}

}
