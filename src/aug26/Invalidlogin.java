package aug26;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidlogin {

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
				driver.findElement(By.id("txtPword")).sendKeys("Admin1");
				driver.findElement(By.name("login")).click();
				//suspend tool from execution
				Thread.sleep(5000);
				//accepet
				String alert =driver.switchTo().alert().getText(); 
				System.out.println(alert);
				driver.switchTo().alert().accept();
				driver.quit();
		

	}

}