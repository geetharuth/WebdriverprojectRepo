package sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablecollections {

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
//collections of rows and cells
				List<WebElement> rows,cols;
				//rows count
				rows=tabledata.findElements(By.tagName("tr"));
				int row=rows.size()-1;
				System.out.println("no of rows are::"+row);
				//iterate all rows
				for(WebElement eachrow : rows)
				{
					//get collection of each row 
					cols=eachrow.findElements(By.tagName("td"));
					//iterate all cells
				for(WebElement eachcell : cols)
				{
					System.out.println(eachcell.getText());
				}
				System.out.println("==============");
				
	}
				driver.quit();
	}
}
