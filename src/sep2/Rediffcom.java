package sep2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffcom {

	public static void main(String[] args) throws Throwable {
		// create object for instance
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				//suspend tool from execution
				Thread.sleep(5000);
				//webelement is checked or uncheked
				WebElement raiodbtn=driver.findElement(By.xpath("//input[@id='remember']"));
				boolean value=raiodbtn.isSelected();
				System.out.println(value);
				//uncheck from checkbox
				raiodbtn.click();
				Thread.sleep(5000);
				driver.quit();

	}

}
