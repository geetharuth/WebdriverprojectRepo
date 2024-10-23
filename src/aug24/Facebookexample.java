package aug24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookexample {

	public static void main(String[] args) throws Throwable {
		String Expected_Item="Nov";
		//String Expected_Item="Hyderabad";
		boolean Item_Exist =false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		Select listbox = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		Thread.sleep(2000);
		listbox.selectByVisibleText("Oct");
		List<WebElement> All_Items = listbox.getOptions();
		System.out.println("No of items are::"+All_Items.size());
		Thread.sleep(2000);
		for (WebElement each : All_Items) {
			String Actual_Items =each.getText();
			Thread.sleep(1000);
			System.out.println(Actual_Items);
			if(Actual_Items.equalsIgnoreCase(Expected_Item))
			{
				Item_Exist=true;
				break;
				
			}
		}
		if(Item_Exist)
		{
			System.out.println(Expected_Item+"   "+"Item Exist In Listbox");
		}
		else
		{
			System.out.println(Expected_Item+"   "+"Item Does Not Exist In Listbox");
		}
		Thread.sleep(5000);
		driver.quit();
		
	}
}
	

