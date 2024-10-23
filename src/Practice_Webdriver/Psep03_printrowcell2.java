package Practice_Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Psep03_printrowcell2 {

	public static void main(String[] args) {
		//create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.navigate().to("https://money.rediff.com/sectors");
				//suspend tool from execution
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//print specific row cell data
				String text1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[2]")).getText();
				String text12=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[4]")).getText();
				System.out.println(text1);
				System.out.println(text12);
driver.quit();
	}

}
