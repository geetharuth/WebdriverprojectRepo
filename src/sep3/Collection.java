package sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection {

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
		WebElement tabledata=driver.findElement(By.className("dataTable"));
		//collection of rows
		List<WebElement> rows=tabledata.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		System.out.println("no of rows::"+row);
		//iterate all cells in a table
		for(int i=1;i<rows.size();i++)
		{
			//get collection of cells in each row
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			System.out.println("row number"+i+"  "+"column size::"+cols.size());
			
		}
		driver.quit();
		

	}

}
