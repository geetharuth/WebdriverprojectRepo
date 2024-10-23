package aug23;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonnishu {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.amazon.in/");
		//suspend tool from execution
		
		//click on link boatlink
		driver.findElement(By.xpath("//img[@alt='boAt']")).click();
		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-square-aspect']//img[@alt='boAt Bassheads 100 in Ear Wired Earphones with Mic(Furious Red)']")).click();
		Thread.sleep(5000);
		
		
		
				

	}

}
