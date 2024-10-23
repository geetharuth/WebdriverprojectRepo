package aug22;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightandWeight {

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
				WebElement username =driver.findElement(By.name("txtUsername"));
				//get height and weight of the username box
				Dimension dim =username.getSize();
				System.out.println(dim.height+"   "+dim.width);
				
				//store element into instance object for login button
				WebElement  login =driver.findElement(By.name("Submit"));
				//get height and weight of the loginbutn
				Dimension dim1 =login.getSize();
				System.out.println(dim1.height+"   "+dim1.width);
				driver.quit();
				
				

	}

}
