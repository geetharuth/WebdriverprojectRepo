package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Psep03_collection {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://money.rediff.com/mutual-funds");
		//suspend tool from execution
		Thread.sleep(2000);
		//store table into webelement 
		WebElement table=driver.findElement(By.className("dataTable"));
		//get rows collection from table
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		System.out.println("no of rows::"+row);
		//iterate all rows in table
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			
			System.out.println("row no."+i+"  "+"colum size."+cols.size());
		}
driver.quit();
	}

}
