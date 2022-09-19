package oldprojectmanu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
// for firfox browser
public class Headlessdriver2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://myseledrivers/geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);// option 1
		
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");
System.out.println("Title of the page : "+driver.getTitle());	
	
	}

}
