package com.maven.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.maven.utils.ReadConfig;


public class BaseClass {
	
	
	//for without propertie file 
	/*  public String baseURL = "https://demo.guru99.com/v4/";
	public String username = "mngr392218";
	public String password = "rYvyjAn";
	public static WebDriver driver;
	public static Logger logger;  */
	
	// with propertie file 
	ReadConfig readconfig=new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger; 
	
	
	//@Parameters("browser")
	@BeforeClass
	public void setup() {
		/*
	}
	public void setup(String br) {
		
		
		//without properties file 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");   
		*/
		//with properties file one browser
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		driver = new ChromeDriver();  
		
		logger =Logger.getLogger("comproject");
		PropertyConfigurator.configure("log4j.properties");
		
		// with multiple browsers from xml parameters add parameter annotation
		/*if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie")){
			System.setProperty("webdriver.ie.driver",readconfig.getIEpath());
			driver = new InternetExplorerDriver();
		}*/
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get(baseURL);
	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}
	
	public void captureScreen(WebDriver driver,String tname)throws IOException{


		TakesScreenshot ts =(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source,target);
		System.out.println("screenshot taken");
		}
}
