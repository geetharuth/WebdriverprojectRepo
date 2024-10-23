package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Paug23_Fb_listbox {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.facebook.com/");
		//suspend tool from execution
		Thread.sleep(2000);
		//click on Create new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		//store day,month and year listboxes into select class
        Select daylist=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        Select monthlist=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select yearlist=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        //select items in above the listbox
        daylist.selectByVisibleText("20");
        Thread.sleep(2000);
        monthlist.selectByVisibleText("Nov");
        Thread.sleep(2000);
        yearlist.selectByIndex(25);
        Thread.sleep(2000);
        System.out.println(yearlist.getFirstSelectedOption().getText());
        daylist.selectByIndex(18);
        Thread.sleep(2000);
        System.out.println(daylist.getFirstSelectedOption().getText());
        monthlist.selectByIndex(8);
        Thread.sleep(2000);
        System.out.println(monthlist.getFirstSelectedOption().getText());
        yearlist.selectByVisibleText("2022");
        Thread.sleep(2000);
        driver.quit();
        
		
		
		
		
		
		
		
		
	}

}
