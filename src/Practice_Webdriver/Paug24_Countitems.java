package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Paug24_Countitems {

	public static void main(String[] args) throws Throwable {
		// create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://www.amazon.in/");
				//suspend tool from execution
				Thread.sleep(2000);
//verify listbox is single or multiselection
			Select element=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
			boolean value=element.isMultiple();
			System.out.println(value);
			//get collection of items in listbox
			List<WebElement> all_lists=element.getOptions();
			System.out.println("no of items are::"+all_lists.size());
			//store into each variable
			for(WebElement each :  all_lists)
			{
				System.out.println(each.getText());
			}
			driver.quit();
				
				
				
				
				
				
				
				
				
				
	}

}
