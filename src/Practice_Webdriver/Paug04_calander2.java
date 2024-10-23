package Practice_Webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Paug04_calander2 {

	public static void main(String[] args) throws Throwable {
		String dob="20/December/2020";
		String str[]=dob.split("/");
		String date=str[0];
		String month=str[1];
		String year=str[2];
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.navigate().to("https://jqueryui.com/datepicker/");
		//suspend tool from execution
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to frame
		driver.switchTo().frame(0);
		//click on date
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		//capture year from calender  
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			while(!calyear.equals(year))
			{
				//click previous button
				driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();
				calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			}
			//capture month from calender
			String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			while(!calmonth.equalsIgnoreCase(month))
			{
				//click previous button
				driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();
				calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//store cal into one webelement
	WebElement webtable= driver.findElement(By.id("ui-datepicker-div"));
	//store rows and cols into list
	List<WebElement> rows,cols;
	rows=webtable.findElements(By.tagName("tr"));
	
	for(WebElement eachrow : rows)
	{
		cols=eachrow.findElements(By.tagName("td"));
for(WebElement eachcell : cols)
{
	if(eachcell.getText().equals(date)) 
	{
		Thread.sleep(2000);
		eachcell.click();
	}
}
	}
Thread.sleep(2000);
driver.quit();
	
	}
}
