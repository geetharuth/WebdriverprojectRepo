package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Paug24_deselect {

	public static void main(String[] args) throws Throwable {
		//create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("file:///C:/Users/Anjali/Downloads/MultiListboxHtmlpage_lyst1724505954570.html");
		//suspend tool from execution
		Thread.sleep(2000);
		//verify listbox is multiselection or single selection
		Select element=new Select(driver.findElement(By.name("multiSelection")));
		boolean value=element.isMultiple();
		System.out.println(value);
		//select 0-9 items in dropdown
		for(int i=0;i<=9;i++)
		{
			element.selectByIndex(i);
		}
		Thread.sleep(2000);
		//deselect item from selection
		element.deselectByVisibleText("black");
		Thread.sleep(2000);
		element.deselectByIndex(3);
		Thread.sleep(2000);
		element.deselectAll();
		Thread.sleep(2000);
		driver.quit();
	}

}
