package Practice_Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Psep03_Printrowcell {

	public static void main(String[] args) {
		//create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.navigate().to("https://money.rediff.com/mutual-funds");
		//suspend tool from execution
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//print specific row cell data
		String text1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[1]")).getText();
		String text11=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[2]")).getText();
		String text101=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[3]")).getText();
		System.out.println(text1);
		System.out.println(text11);
		System.out.println(text101);
		driver.quit();
	}

}
