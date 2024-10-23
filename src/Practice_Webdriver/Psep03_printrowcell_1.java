package Practice_Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Psep03_printrowcell_1 {

	public static void main(String[] args) {
		//create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.navigate().to("https://money.rediff.com/losers");
				//suspend tool from execution
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//print specific row cell data
				String table1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]")).getText();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String table12=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[3]")).getText();
				String table13=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[1]")).getText();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String table14=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[2]")).getText();
				String table17=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[7]/td[3]")).getText();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String table18=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[4]")).getText();
				System.out.println(table1);
				System.out.println(table12);
				System.out.println(table13);
				System.out.println(table14);
				System.out.println(table17);
				System.out.println(table18);
				driver.quit();
				
	}

}
