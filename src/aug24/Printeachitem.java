package aug24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printeachitem {

	public static void main(String[] args) throws Throwable {
		//create object for instance
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("file:///C:/Users/Anjali/Downloads/MultiListboxHtmlpage_lyst1724505954570.html");
		Thread.sleep(5000);
		//store element into object
		Select listbox =new Select(driver.findElement(By.name("multiSelection")));
		
		//select 0-8 items in dropdown
		for(int i=0;i<=8;i++)
		{
			Thread.sleep(2000);
			listbox.selectByIndex(i);
		}
//get collection of all items which are selected
		List<WebElement> alliteams= listbox.getAllSelectedOptions();
		System.out.println("no of itams selected:::"+alliteams.size());
		Thread.sleep(2000);
		//print the name of the item which are selected
		for(WebElement each:alliteams)
		{
			System.out.println(each.getText());
		}
			Thread.sleep(5000);
			driver.quit();
		}
	}


