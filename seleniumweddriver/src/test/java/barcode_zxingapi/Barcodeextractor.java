package barcode_zxingapi;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

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

public class Barcodeextractor {
	//we need two dependent jars for this 1.com.google.zxing/javase/3.3.3  //2.com.google.zxing/core/3.3.3

	public static void main(String[] args) throws NotFoundException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://myseledrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
	
		String barcodeURL1=	driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]")).getAttribute("src");
		
		
		Result mybarcode=	Barcodeextractor.barcodeext(barcodeURL1);
		
	System.out.println("mybarcode: "+mybarcode.getText());
	
	String barcodeURL2=	driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[2]")).getAttribute("src");
	Result mybarcode2=barcodeext(barcodeURL2);
	System.out.println("my second barcode result:"+mybarcode2.getText());
	driver.quit();
	
	}

	public static Result barcodeext(String barcodeURL) throws NotFoundException, IOException {
		
		URL url= new URL(barcodeURL);
		
		BufferedImage bufferimage=ImageIO.read(url);
		LuminanceSource luminamnceSource=new BufferedImageLuminanceSource(bufferimage);
			BinaryBitmap binaryBitMap=new BinaryBitmap(new HybridBinarizer(luminamnceSource));
			Result result=new MultiFormatReader().decode(binaryBitMap);
            return result;
	}
	
}
