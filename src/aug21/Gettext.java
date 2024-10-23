package aug21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//create object for instance
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url 
				driver.get("https://www.google.com/");
				//suspend tool from execution 
				Thread.sleep(5000);
				//get gmail element text
				String elename=driver.findElement(By.linkText("Gmail")).getText();
				System.out.print(elename);
				//get gmailurl 
				String eleurl=driver.findElement(By.linkText("Gmail")).getAttribute("href");
				System.out.print(eleurl);
				driver.quit();
	}

}
