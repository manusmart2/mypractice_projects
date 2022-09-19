package ggg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pobmodel.Loginpage;

public class Testjava {
	 public String baseURL = "https://demo.guru99.com/v4/";
		public String username = "mngr392218";
		public String password = "rYvyjAn";
		public static WebDriver driver;
		public static Logger logger;
		@BeforeClass
		public void setup() {
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
			driver = new ChromeDriver();  
			
			logger =Logger.getLogger("comproject");
			PropertyConfigurator.configure("log4j.properties");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			driver.get(baseURL);
		}
		@Test
		public void loginTest() throws IOException {
			
		logger.info("********url is opened************");
			Loginpage lp = new Loginpage(driver);
			logger.info("********url is opened1************");
			lp.setUserName(username);
			logger.info("**********ENTERED USER NAME************");
			lp.setPassword(password);
			logger.info("*********entered password *******");
			lp.clickSubmit();
			if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
				Assert.assertTrue(true);
				logger.info("************login test passed*******");

			} else {
				
				Assert.assertTrue(false);
	logger.info("**************logging test failed***********");
			}
		}

	
		
		
		
		@AfterClass
		public void tearDown() {

			driver.quit();
		}
		


}
