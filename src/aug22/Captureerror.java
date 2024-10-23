package aug22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captureerror {

	public static void main(String[] args) throws Throwable {
		//create object for instance
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url 
		driver.get("http://orangehrm.qedgetech.com/");
		//suspend tool from execution 
		Thread.sleep(5000);

		//store element into instance object for username
		WebElement elementusername=driver.findElement(By.xpath("//input[@id='txtUsername']"));

		//clear text in user name field
		elementusername.clear();
		//enterusername
		elementusername.sendKeys("Admin");
		//getname of the username
		String username= elementusername.getAttribute("value");
		Thread.sleep(5000);

		//store element into instance object for password
		WebElement elementpassword=driver.findElement(By.xpath("//input[@id='txtPassword']"));


		//clear text in password field
		elementpassword.clear();
		//enterpassword
		elementpassword.sendKeys("Qedge123!@");
		//getpassword of the Password
		String texpasswordname=elementpassword.getAttribute("value");;
		Thread.sleep(5000);
		
		//print name of the username and password in console output
		System.out.println(username+"   "+texpasswordname);

		//click on submit button 
		driver.findElement(By.name("Submit")).click();
		
		//store variables into string 
		String Actual= driver.getCurrentUrl();
		String expected= "dashboard";
		//compare actual with expected using if 
		if(Actual.contains(expected))
		{
			System.out.println("Login Success::"+Actual+"   "+expected);
		}
		else
		{
			//capture error message using getText
			String error_message =driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+"   "+Actual+"   "+expected);
		}
driver.quit();
	}

}
