package sep4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander2 {

	public static void main(String[] args) throws Throwable {
		// store all date month year into string
		String dob = "20/December/2022";
		String str[]=dob.split("/");
		String date=str [0];
		String month=str[1];
		String year=str[2];
		//create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://jqueryui.com/datepicker/");
		//suspend tool from execution
		Thread.sleep(2000);
		//switch to parent main frame
		driver.switchTo().frame(0);
		//click on date box
		driver.findElement(By.id("datepicker")).click();
		//capture on year 
		String yearlist=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!yearlist.equals(year))
		{
			//click on previous button
			driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();
			yearlist=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		//capture on month 
		String monthlist=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!monthlist.equalsIgnoreCase(month))
		{
			//click on previous button
			driver.findElement(By.xpath("//span[normalize-space()='Prev']")).click();
			monthlist=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//store cal elements in webelement
		WebElement allcal=driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> rows,cols;
		rows=allcal.findElements(By.tagName("tr"));
		for(WebElement eachrows : rows)
		{
			cols=eachrows.findElements(By.tagName("td"));
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
