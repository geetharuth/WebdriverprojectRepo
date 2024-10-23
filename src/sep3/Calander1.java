package sep3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calander1 {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		String dob="2024-Nov-18";
		String str []=dob.split("-");
		String year =str[0];
		String month=str[1];
		String day=str[2];
		
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
				//click on leave
				driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
				Thread.sleep(2000);
				//click on from calander
				driver.findElement(By.xpath("//li[1]//img[1]")).click();
				Thread.sleep(2000);
				//select year
				Select yearlist =new Select(driver.findElement(By.className("ui-datepicker-year")));
				yearlist.selectByVisibleText(year);
				//select month
				Select Monthlist =new Select(driver.findElement(By.className("ui-datepicker-month")));
				Monthlist.selectByVisibleText(month);
				Thread.sleep(2000);
				//store table into webelement
				WebElement datatable=driver.findElement(By.className("ui-datepicker-calendar"));
				List<WebElement> rows,cols;
				//list of rows
				rows=datatable.findElements(By.tagName("tr"));
				for(WebElement eachrow : rows)
				{
					cols=eachrow.findElements(By.tagName("td"));
					for(WebElement eachcell : cols) {
						if(eachcell.getText().equals(day)) {
							Thread.sleep(2000);
							eachcell.click();
						}
					}
				}
					Thread.sleep(2000);
					driver.quit();	
	}

}
