package sele_locators;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Shadowdomelementsexamples {

	public String baseURL = "https://demo.guru99.com/v4/";
	// public String baseURL = "http://automationpractice.com/index.php";
	// public String baseURL = "https://books-pwakit.appspot.com/";
	// public String baseURL = "https://shop.polymer-project.org/";
	public String username = "mngr392218";
	public String password = "rYvyjAn";
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();

		logger = Logger.getLogger("comproject");
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test
	public void shadowDomexaample() {

		// dom(Document object Model) is a tree representaion of html nodes
		// Shadow DOM is subset of DOM
		// Shadow Host is the regular node that the shadow dom is attached
		// to locate shadow dom eleemnnts we go with css selector because x path,and
		// normal locators cant access
		// test_url"https://books-pwakit.appspot.com/"

		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("testing");// no such element exception

		driver.findElement(By.cssSelector("input#input")).sendKeys("testing");// NoSuchElement Exception

		// identifying root node of shadow dom
		WebElement root = driver.findElement(By.tagName("book-app"));// Shadow host/root element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowDom1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", root);// retuns the
																										// shadow dom
		WebElement appheader = shadowDom1.findElement(By.tagName("app-header"));// app heder eleemnt
		WebElement apptoolbar = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));// apptoolbar
		WebElement bookinputdecorator = apptoolbar.findElement(By.tagName("book-input-decorator"));
		bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing");

	}

	@Test
	public void multishadowdomexample() {

		WebElement root = driver.findElement(By.tagName("shop-app"));// root node/ shadow host
		WebElement shadowdom3 = getShadowDom(root, driver);
		WebElement ironpages = shadowdom3.findElement(By.tagName("iron-pages"));
		WebElement root2 = ironpages.findElement(By.tagName("shop-home"));
		WebElement shadowdom4 = getShadowDom(root2, driver);
		shadowdom4.findElement(By.cssSelector("div:nth-child(2) > shop-botton >a")).click();
	}

	static WebElement getShadowDom(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadowDom2 = (WebElement) js.executeScript("return arguments[0].shadowRoot", element);
		return shadowDom2;
	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

}
