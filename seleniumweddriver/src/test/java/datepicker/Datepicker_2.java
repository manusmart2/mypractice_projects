package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//type 2 clalender 
public class Datepicker_2 {

	public static void main(String[] args) throws InterruptedException {
		String expectedmonth="Mar 2019";
		String expdate="15";
		System.setProperty("webdriver.chrome.driver", "C://myseledrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.expedia.ca/");
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		//*[@id="d1-btn"]
		//input[@id='hotel-checkin-hp-hotel']
		Thread.sleep(1000);
		
		while(true) {
			String actualmonth=	driver.findElement(By.xpath("//*[@id=\"app-layer-datepicker-check-in-out-start\"]/div[2]/div/div/div[1]/section/section/button[1]/span")).getText();
			//caption
			if(actualmonth.equals(expectedmonth))// actual month will gives the format : Mar 2019
			{
				break;
			}
			else {
				driver.findElement(By.xpath("//div[@class='datapicker-cal']//button[2]")).click();
			
			}
		}
	List<WebElement> allDates=	driver.findElements(By.xpath("//div[@class='datepicker-cal']//div[2]//table[1]//tbody[1]//tr//td//button[1]"));
		for(WebElement ele:allDates) {
		String date_text=	ele.getText();// element gives the format : March  15, march in 1st line and  15 in 2 nd line 
		String date[]=date_text.split("\n");
		if(date[1].equals(expdate)) {
			ele.click();
			break;
		}
		
		}
	}

}
