package com.maven.testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinkschecks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");   
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();

//dynamic waits
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.freecrm.com");
driver.findElement(By.name("username")).sendKeys("naveen");
driver.findElement(By.name("password")).sendKeys("test@123");

driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.switchTo().frame("mainpanel");
List<WebElement> linklist =  driver.findElements(By.tagName("a"));
linklist.addAll(driver.findElements(By.tagName("img")));	
System.out.println("size of all links and images"+linklist.size());
List<WebElement> activelinks =new ArrayList<WebElement>();
for(int i=0;i<linklist.size();i++) {
	if(linklist.get(i).getAttribute("href")!=null && (! linklist.get(i).getAttribute("href").contains("javascript"))) {
		activelinks.add(linklist.get(i));
	}
}
	System.out.println("size of all links active are: "+activelinks.size());
	for(int j=0;j<activelinks.size();j++) {
	HttpURLConnection connection =	(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
connection.connect();
	String response=connection.getResponseMessage();
	connection.disconnect();
	System.out.println(activelinks.get(j).getAttribute("href")+"---->"+response);
	}
	
	}

}
