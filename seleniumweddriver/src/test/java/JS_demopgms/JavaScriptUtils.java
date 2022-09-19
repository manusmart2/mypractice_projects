package JS_demopgms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {
	public static void flash(WebElement element, WebDriver driver) {
		// JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");// green
		for (int i = 0; i < 500; i++) {
			changeColour("#000000", element, driver);// 1
			changeColour(bgcolor, element, driver);// 2

		}
	}

	public static void changeColour(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor=' " + color + " ' ", element);
		try {
			Thread.sleep(20);
		} catch (Exception e) {

		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red ' ", element);

	}

	// get tilte methode
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	// get tilte methode
	public static void clickelementbyjs(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}
	
	// generating alert methode
	public static void generatealertbyjs( WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert(' " + message + " ')");

	}
	
	// refresh methode
		public static void refresBrowserByJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			 js.executeScript("history.go(0)");
			
		}
		
		// scroll utill eleemnt found 
		
		public static void scrollIntoView(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);

		}
		
		
		// scrolling down till end of the page methode 
		
		public static void scrollPage(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		}
	
}
