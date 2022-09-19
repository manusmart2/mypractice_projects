package com.practice.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.pom.AddCustomerPage;
import com.practice.pom.Loginpage;





public class TC_AddNewCustomer_003 extends BaseClass{
@Test
	public void AddNewCustomer() throws InterruptedException, IOException {
		Loginpage lp=new Loginpage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		logger.info("adding new customer is started");
		addcust.custName("manohar");
		addcust.custgender("male");
		addcust.custdob("10", "15","1986");
		logger.info("dob is provided");
		Thread.sleep(2000);
		addcust.custaddress("INDIA");
		addcust.custcity("HYD");
		addcust.custstate("AP");
		addcust.custpinno("567868");
		addcust.custtelephoneno("975985787");
		logger.info("phonenumber is provided");
		 
		String email=randomeString()+"@gmail.com";
		addcust.custemailid(email);
		logger.info("email is provided");
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		logger.info("cutomer submiting");
		Thread.sleep(3000);
		logger.info("customer creation  test validation started ");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			logger.info("customer creation  test passed");
			Assert.assertTrue(true);
		}
		else {
			logger.info("customer creation  test failed");
			captureScreen(driver, "AddNewCustomer");
			Assert.assertTrue(false);
		}
	}


}
