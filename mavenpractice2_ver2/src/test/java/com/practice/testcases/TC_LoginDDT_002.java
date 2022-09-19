package com.practice.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.practice.pom.Loginpage;
import com.practice.utils.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider = "LoginData")
	public void loginDDTTest(String user, String pwd) throws InterruptedException, IOException {
		Loginpage lp = new Loginpage(driver);
		logger.info("********url is opened************");
		lp.setUserName(user);
		logger.info("**********ENTERED USER NAME************");
		lp.setPassword(pwd);
		logger.info("*********entered password *******");
		lp.clickSubmit();
		Thread.sleep(3000);

		if (isAlertPresent() == true) {
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			captureScreen(driver, "loginDDTTest");
			logger.warn("login failure");
			Assert.assertTrue(false);
		} else {
			
			logger.info("login passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
		}
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

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/practice/testdata/testdata.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i -1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}

		}
		return logindata;
	}

}