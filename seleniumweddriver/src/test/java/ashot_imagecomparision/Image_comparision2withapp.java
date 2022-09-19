package ashot_imagecomparision;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Image_comparision2withapp {
	// for this we need 3 jars 1 is ashot 1.5.3 and 2nd is Gson 2.8.5 3rd is
	// Hamcreast-all 1.3
	//this will compare the saved image from falder to website image 
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://myseledrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		BufferedImage expectedImage = ImageIO.read(new File("C://myselepics//Screenshots/OrangeHRMlogo.png"));
		WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);
		BufferedImage actualimage = logoImageScreenshot.getImage();
		ImageDiffer imagediff = new ImageDiffer();
		ImageDiff diff = imagediff.makeDiff(expectedImage, actualimage);

		if (diff.hasDiff() == true)// this will compare the 2  images 
		{
			System.out.println("Images are NOT same");
		} 
		else 
		{
			System.out.println("Images are Same");
		}

		driver.quit();
	}

}
