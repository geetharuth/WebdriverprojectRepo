package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Paug24_Verifyitems {

	public static void main(String[] args) throws Throwable {
		String expected="baby";
		boolean item_exits=false;
		// create object for instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.amazon.in/");
		//suspend tool from execution
		Thread.sleep(2000);
		Select all_items=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		//get collection of all items in listbox
		List<WebElement> itemslist=all_items.getOptions();
		System.out.println("no of items::"+itemslist.size());
		//iterate through allitems in the dropdown
		for(WebElement each : itemslist)
		{
			String actual =each.getText();
			Thread.sleep(2000);
			System.out.println(actual);
			//check if actaul iteam matches the expected item (casesenstivie)
if(actual.equalsIgnoreCase(expected))
{
	 item_exits=true;
	 break;
}
		}
//check the results and print appropriate messaz
{
if( item_exits)
{
	System.out.println(expected+"    "+"item exists in listbox");
}
else
{
	System.out.println(expected+"    "+"item doesnot exists in listbox");
}
}
Thread.sleep(2000);
driver.quit();
		}
	}





