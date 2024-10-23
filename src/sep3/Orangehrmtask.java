package sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmtask {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		//suspend tool from execution
		Thread.sleep(2000);
		//login to orange hrm
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		//click on pim
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		Thread.sleep(2000);
		//store table into webelement
				WebElement webtable = driver.findElement(By.xpath("//table[@id='resultTable']"));
				List<WebElement> rows,cols;
				//get rows collection from table
				rows=webtable.findElements(By.tagName("tr"));
				int row =rows.size()-1;
				System.out.println("No of rows are::"+row);
				//iterate all rows
				for (WebElement eachrow : rows) 
				{
					//get cell collection from each row
					cols =eachrow.findElements(By.tagName("td"));
					//iterate all cells
					for (WebElement eachcell : cols) {
						System.out.println(eachcell.getText());
					}
					System.out.println("=================================================================");
				}
				driver.quit();
		
		
		
	}

}
