package headless_driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// for chrome browser
public class Headlessdriver {

	public static void main(String[] args) {
		
		WebDriver driver;
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);// option 1
		
		options.addArguments("--headless");  //option 2
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");
System.out.println("Title of the page : "+driver.getTitle());	
	
	}

}
