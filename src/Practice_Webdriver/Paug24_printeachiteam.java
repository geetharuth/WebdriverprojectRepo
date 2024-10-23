package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Paug24_printeachiteam {

	public static void main(String[] args) throws Throwable {
		//create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("file:///C:/Users/Anjali/Downloads/MultiListboxHtmlpage_lyst1724505954570.html");
				//suspend tool from execution
				Thread.sleep(2000);
				Select element=new Select(driver.findElement(By.name("multiSelection")));
				//select 0-8 items in dropdown
				for(int i=0;i<=8;i++)
				{
					element.selectByIndex(i);
				}
				Thread.sleep(2000);
				//get collection of items which are selected
				List<WebElement> all_items=element.getAllSelectedOptions();
				System.out.println("no of items::"+all_items.size());
				//print each iteam name which are selected
				for(WebElement each :all_items )
				{
					System.out.println(each.getText());
				}
				Thread.sleep(2000);
driver.quit();
	}

}
