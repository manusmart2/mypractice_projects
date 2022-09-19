package extendreportandheadless;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SeleniumExtenrReportv4example {
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setExtent() {
		// look and feel by ExtentHtmlReport class
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report");// title of the report
		htmlReporter.config().setReportName("Functional Report"); // name of the report
		htmlReporter.config().setTheme(Theme.DARK);

		// creating entries in the report/information to report by Extent Report class
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Local Host");
		extent.setSystemInfo("OS", "Windows7");
		extent.setSystemInfo("Tester Name", "Manohar");
		extent.setSystemInfo("Browser", "Chrome");

	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://myseledrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void noCommecrceTitleTest() {
		test = extent.createTest("nopCommecrceTitleTest");

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerce demo store");
		//Assert.assertEquals(title, "noCommerce demo store");

	}

	@Test
	public void noCommerceLogoTest() {

		test = extent.createTest("noCommerceLogoTest");
		Boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertTrue(status);

	}

	@Test
	public void noCommeceLoginTest() {
		test = extent.createTest("noCommeceLoginTest");
		test.createNode("Login with valid input");
		Assert.assertTrue(true);
		
		test.createNode("Login with Invalid Input");
		Assert.assertTrue(false);
		//Assert.assertTrue(true);

	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test case failed is" + result.getName());
			test.log(Status.FAIL, "Testcase failed error is " + result.getThrowable());
			String screenshotPath = SeleniumExtenrReportv4example.getScreenshot(driver, result.getName());
			test.addScreenCaptureFromPath(screenshotPath);

		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Testcase skipped is" + result.getName());

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "test case passed is" + result.getName());

		}
		driver.quit();
	}

	public static String getScreenshot(WebDriver driver, String screenshotname) throws IOException {

		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// after execution ,you could see a folder "Failed Testascreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotname + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

}
