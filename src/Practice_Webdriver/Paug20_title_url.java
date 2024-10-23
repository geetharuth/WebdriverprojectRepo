package Practice_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paug20_title_url {

	public static void main(String[] args) throws Throwable {
		// create object for instance
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				//launch url
				driver.get("https://www.amazon.in/");
				//suspend tool from execution
				Thread.sleep(2000);
				//print title and length of title
				String pagetitle=driver.getTitle();
				System.out.println(pagetitle);
				System.out.println(pagetitle.length());
				//print url and length of url
				String pageurl=driver.getCurrentUrl();
				System.out.println(pageurl);
				System.out.println(pageurl.length());
				//close browser
				driver.quit();

	}

}
