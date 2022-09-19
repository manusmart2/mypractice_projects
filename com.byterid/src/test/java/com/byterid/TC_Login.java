package com.byterid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//manuimport io.github.bonigarcia.wdm.WebDriverManager;


public class TC_Login {

@Test
public void login_Test() throws InterruptedException {
	//WebDriverManager.chromedriver().setup();
	//ChromeDriver driver=new ChromeDriver();
	
	
	System.setProperty("webdriver.chrome.driver", "C://myseledrivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(2000);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	 
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	driver.close();
	
}

}
