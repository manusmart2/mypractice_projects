package locators_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowdom_withownmethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.polymer-project.org/");
		// public String baseURL = "http://automationpractice.com/index.php";
		// public String baseURL = "https://books-pwakit.appspot.com/";
		// public String baseURL = "https://shop.polymer-project.org/";
		
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

}
