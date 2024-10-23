package aug24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws Throwable {
		//create object for instance
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("file:///C:/Users/Anjali/Downloads/MultiListboxHtmlpage_lyst1724505954570.html");
		Thread.sleep(5000);
		Select element = new Select(driver.findElement(By.name("multiSelection")));
//single or multi selection
		boolean value= element.isMultiple();
		System.out.println(value);
		//select 0-9 items
		for(int i=0;i<=9;i++)
		{
			Thread.sleep(5000);
			//select one by one itam in dropdown
			element.selectByIndex(i);
			
			}
		
		//deselect iteam from selection
		element.deselectByVisibleText("black");
		//deselect iteam from selection indexno
		element.deselectByIndex(6);
		//deselect all
		element.deselectAll();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
