package Practice_Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug23_Webelements_alllinks {

	public static void main(String[] args) throws Throwable {
		// create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://www.rediff.com/");
				//suspend tool from execution
				Thread.sleep(2000);
				//get collection of links in a webpage which are stored into html tag a
				List<WebElement> all_links=driver.findElements(By.tagName("a"));
				System.out.println("collection of all links::"+ all_links.size());
				for(WebElement each: all_links)
				{
					//print each link name
					System.out.println(each.getText());
					//print each link url
					System.out.println(each.getAttribute("href"));
				}
driver.quit();
	}

}
