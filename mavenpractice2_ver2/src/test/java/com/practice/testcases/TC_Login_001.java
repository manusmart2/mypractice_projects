package com.practice.testcases;

import org.testng.annotations.Test;
import com.practice.pom.Loginpage;
import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;

public class TC_Login_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException {

		logger.info("********url is opened************");
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		logger.info("**********ENTERED USER NAME************");
		lp.setPassword(password);
		logger.info("*********entered password *******");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if (isAlertPresent() == true) {
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
			logger.warn("login failure");
			captureScreen(driver, "login");
			Assert.assertTrue(false);
			
		} else {
			
			logger.info("login passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
		}

		/*if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("************login test passed*******");

		} else if(isAlertPresent() == true) {
			logger.info("**************logging test failed***********");
			captureScreen(driver, "login");
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.info("**************logging test failed1***********");
		}
		else {
			logger.info("**************logging test supended***********");
		}*/
		
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			return false;

		}

	}

}
