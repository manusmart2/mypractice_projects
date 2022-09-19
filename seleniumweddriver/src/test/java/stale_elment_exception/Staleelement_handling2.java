package stale_elment_exception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//this will navigate from website free crm and refress after entering password  to pavantesting tools
public class Staleelement_handling2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement username=	driver.findElement(By.name("username"));
	username.sendKeys("pavanoltraining");
	WebElement paswd=driver.findElement(By.name("password"));
	paswd.sendKeys("xyz@123");
	driver.navigate().refresh();
	username.sendKeys("pavanoltraining");
	
	try {
		
		username.sendKeys("pavanoltraining");// this is causing exception to handle this we have to refind the element and repeat the click action
	} catch (StaleElementReferenceException e) {
		 username=	driver.findElement(By.name("username"));
		username.sendKeys("pavanoltraining");
	}
	
	
	}

}
