package encode_password;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase001encodingpsw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.nopcommerce.com/login");
		driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("pavanoltraining@gmail.com");
//driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test123");	
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(decodedStringmtd("dGVzdDEyMw=="));	


driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	
	
	}
	
	static String  decodedStringmtd(String password) {
		byte[]decodedString=Base64.decodeBase64(password);
	return (new String(decodedString));
	}
	

}
