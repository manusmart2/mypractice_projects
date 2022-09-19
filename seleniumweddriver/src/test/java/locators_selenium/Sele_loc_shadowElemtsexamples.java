package locators_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_loc_shadowElemtsexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		// public String baseURL = "http://automationpractice.com/index.php";
		// public String baseURL = "https://books-pwakit.appspot.com/";
		// public String baseURL = "https://shop.polymer-project.org/";
		
		
		// dom(Document object Model) is a tree representaion of html nodes
		// Shadow DOM is subset of DOM
		// Shadow Host is the regular node that the shadow dom is attached
		// to locate shadow dom eleemnnts we go with css selector because x path,and
		// normal cocators cant access
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

		
		// ***********multi shadow doms examples  wit methode started*************************
		
		WebElement root1 = driver.findElement(By.tagName("shop-app"));// root node/ shadow host
		WebElement shadowdom3 = getShadowDom(root1, driver);
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

}
