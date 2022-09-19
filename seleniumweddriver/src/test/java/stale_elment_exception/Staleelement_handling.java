package stale_elment_exception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//this will navigate from website pavanonlinetrainings to pavantesting tools
public class Staleelement_handling {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.pavantestingtools.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement link=	driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[12]/a"));
	link.click();
	driver.navigate().back();
	Thread.sleep(5000);
	

	
	try {
		link.click(); // this is causing exception to handle this we have to refind the element and repeat the click action
	} catch (StaleElementReferenceException e) {
		 link=	driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[12]/a"));
		link.click();
	}
	
	}

}
