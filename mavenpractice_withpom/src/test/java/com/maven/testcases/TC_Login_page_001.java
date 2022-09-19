package com.maven.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.pom.Loginpage;

public class TC_Login_page_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {
		
	logger.info("********url is opened************");
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		logger.info("**********ENTERED USER NAME************");
		lp.setPassword(password);
		logger.info("*********entered password *******");
		lp.clickSubmit();
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("************login test passed*******");

		} else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
logger.info("**************logging test failed***********");
		}
	}

}
