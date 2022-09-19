package authentication_withwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentwebdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://myseledrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		//http://username:password@test.com
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text=driver.findElement(By.cssSelector("p")).getText();
		System.out.println("value:"+text);
		driver.quit();
	}

}
