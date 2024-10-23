package aug26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelmultiplewindows {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool from execution 
		Thread.sleep(3000);
		//login to primus bank 
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//click on branches button
		driver.findElement(By.xpath("(//img)[5]")).click();
		//click on delete
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(3000);
		//get text 
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(alertmsg);
		//click on cancle
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		//click on delete
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(3000);
		//click on ok
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//alert text
	   String textname = driver.switchTo().alert().getText();
	   System.out.println(textname);
	   Thread.sleep(3000);
	 //click on ok
	 		driver.switchTo().alert().accept();
	 		Thread.sleep(3000);
	   
		
		
		
	}
	
	
	
	
	

}
