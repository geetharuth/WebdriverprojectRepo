package aug24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countinglistbox {

	public static void main(String[] args) throws Throwable {
		//create object for instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url 
		driver.get("https://amazon.in");
		//suspend tool from execution
		Thread.sleep(5000);
		//store class into select 
				Select list = new Select(driver.findElement(By.id("searchDropdownBox")));
		//is single or multiple
		boolean value =list.isMultiple();
		System.out.println(value);
		//get all the items in a list box 
		List<WebElement> itemsnames =list.getOptions();
		System.out.println("number of links::  "+itemsnames.size());
		for(WebElement each: itemsnames) 
		{
			//items names
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
