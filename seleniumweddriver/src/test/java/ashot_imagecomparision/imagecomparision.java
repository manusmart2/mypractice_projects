package ashot_imagecomparision;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class imagecomparision {
	// for this we need 3 jars 1 is ashot 1.5.3 and 2nd is Gson 2.8.5 3rd is
	// Hamcreast-all 1.3
	// this will capture the logo from site and saves in folder
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://myseledrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);
		ImageIO.write(logoImageScreenshot.getImage(), "png", new File("C://myselepics//Screenshots/OrangeHRMlogo.png"));

		File f = new File("C://myselepics//Screenshots/OrangeHRMlogo.png");
		if (f.exists()) {
			System.out.println("Image File Captured");
		} else {
			System.out.println("Image File Not exist");

		}

		driver.quit();
	}

}
