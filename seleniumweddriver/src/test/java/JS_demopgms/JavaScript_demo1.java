package JS_demopgms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.twoplugs.com/");
		
		// Flashing
		
		WebElement joinfree=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		
		JavaScriptUtils.flash(joinfree, driver);
		
		//Drawing border around element
		
		JavaScriptUtils.drawBorder(joinfree, driver);
		
		//Drawing border around element and taking screenshots 
		
		JavaScriptUtils.drawBorder(joinfree, driver);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg=new File("D://Screenshot/twoplug.png");
		FileUtils.copyFile(src, trg);
		
		//capture the title of the page 
		
		//System.out.println(driver.getTitle());//default methode 
		
		String title=JavaScriptUtils.getTitleByJS(driver);
		System.out.println(title);
		
		// click on eleemnt 
		
		WebElement loginBtn=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		
		loginBtn.click();//normal methode we use but some times may not work 
		
		JavaScriptUtils.clickelementbyjs(loginBtn, driver);//by java script we can click on element
		
		// generating alert 
		
		JavaScriptUtils.generatealertbyjs(driver, "You click on login button");
		
		
		// refreshing browser
		
		driver.navigate().refresh();//nrmal by default methode we use
		
		JavaScriptUtils.refresBrowserByJS(driver);
		
		//scroll down the page  till we  found element 
	WebElement scrollelement=	driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		JavaScriptUtils.scrollIntoView(scrollelement, driver);
		
		// scroll down the page till end of the page 
		
		JavaScriptUtils.scrollPage(driver);
		
		
	}

}
