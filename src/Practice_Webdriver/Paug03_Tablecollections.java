package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug03_Tablecollections {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://money.rediff.com/mutual-funds");
		//suspend tool from execution
		Thread.sleep(2000);
		//store table into one webelement 
		WebElement table=driver.findElement(By.className("dataTable"));
		List<WebElement>rows,cols;
		//get rows collection from table
		rows=table.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		System.out.println("no of rows::"+row);
		//iterate all rows
		for(WebElement each : rows)
		{
			System.out.println(each.getText());
		//get cell collection from each row
		cols=driver.findElements(By.tagName("td"));
		//iterate all cells
		for(WebElement eachcell : cols)
		{
			System.out.println(eachcell.getText());
			
		}
		System.out.println("==================");
	}
		driver.quit();				

	}
}

