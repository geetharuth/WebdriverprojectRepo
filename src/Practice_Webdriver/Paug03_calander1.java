package Practice_Webdriver;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Paug03_calander1 {

	public static void main(String[] args) throws Throwable {
		String dob="2020-Dec-20";
		String str[]=dob.split("-");
		String year=str[0];
		String month=str[1];
		String date=str[2];
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
		//click on leave
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		//click on calander button
		driver.findElement(By.xpath("//li[1]//img[1]")).click();
		//select year from calender
		Select yearlist =new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
		yearlist.selectByVisibleText(year);
		//select month from calender
		Select monthlist=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
		monthlist.selectByVisibleText(month);
		//store table into webelement
		WebElement table=driver.findElement(By.className("ui-datepicker-calendar"));
		//get list of rows and cols
		List<WebElement> rows,cols;
		rows=table.findElements(By.tagName("tr"));
		//iterate all rows
	for(WebElement eachrow : rows)
	{
		cols=eachrow.findElements(By.tagName("td"));
		for(WebElement eachcell : cols)
		{
	if(eachcell.getText().equals(date))
	{
		Thread.sleep(3000);
		eachcell.click();
		}
		
	}
	
	}
	Thread.sleep(3000);
	driver.quit();
	}
}
