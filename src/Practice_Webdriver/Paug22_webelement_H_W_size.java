package Practice_Webdriver;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug22_webelement_H_W_size {

	public static void main(String[] args) throws Throwable {
		// create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("http://orangehrm.qedgetech.com/");
				//suspend tool from execution
				Thread.sleep(2000);
				//store username into webelement
				WebElement username = driver.findElement(By.name("txtUsername"));
				//create object for dimension class to get methods
				org.openqa.selenium.Dimension dim =username.getSize();
				System.out.println(dim.height+"  "+dim.width);
				//store login btn into webelement
				WebElement loginbtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
				//create object for dimension class to get methods
				org.openqa.selenium.Dimension dim1=loginbtn.getSize();
				System.out.println(dim1.height+"  "+dim1.width);
				//close browser
				driver.quit();

	}

}
