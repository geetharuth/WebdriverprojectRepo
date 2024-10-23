package sep3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printrowcell {

	public static void main(String[] args) throws Throwable {
		// create object for instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://money.rediff.com/mutual-funds");
		//suspend tool from execution
		Thread.sleep(5000);
		//print specific row cell data
	String text1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[1]")).getText();
	String text2=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[2]")).getText();
	String text3=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[3]")).getText();
	System.out.println(text1);
	System.out.println(text2);
	System.out.println(text3);
	driver.quit();
	}

}
