package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxes {

	public static void main(String[] args) throws Throwable {
		//create object for instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url 
		driver.get("https://facebook.com");
//suspend tool from execution
		Thread.sleep(5000);
		//click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//select all date,month,year
		Select daylist= new Select(driver.findElement(By.id("day")));
		Select Monthlist= new Select(driver.findElement(By.id("month")));
		Select yearlist= new Select(driver.findElement(By.id("year")));
		//enter day month year
		daylist.selectByVisibleText("20");
		Thread.sleep(5000);
		Monthlist.selectByVisibleText("Dec");
		Thread.sleep(5000);
		yearlist.selectByVisibleText("2022");
		Thread.sleep(5000);
		//enter day month year by index numbers
		daylist.selectByIndex(20);
		System.out.println(daylist.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		Monthlist.selectByIndex(3);
		System.out.println(Monthlist.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		yearlist.selectByIndex(20);
		System.out.println(yearlist.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		
		
		driver.quit();
	}

}
