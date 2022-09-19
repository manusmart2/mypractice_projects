package barcode_zxingapi;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Qrcode_example {
	//we need two dependent jars for this 1.com.google.zxing/javase/3.3.3  //2.com.google.zxing/core/3.3.3

	public static void main(String[] args) throws IOException, NotFoundException {

		System.setProperty("webdriver.chrome.driver", "C://myseledrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String qrCodeURL = driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");
		URL url = new URL(qrCodeURL);
		BufferedImage bufferedimage = ImageIO.read(url);
		LuminanceSource luminanaceSource = new BufferedImageLuminanceSource(bufferedimage);

		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanaceSource));

		Result result = new MultiFormatReader().decode(binaryBitmap);
		System.out.println(result.getText());
		driver.quit();
	}

}
