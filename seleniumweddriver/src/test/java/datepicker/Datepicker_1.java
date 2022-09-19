package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//type 1 clalender 
//additional calender comment
//jgjgfffff test comment
public class Datepicker_1 {

	public static void main(String[] args) throws InterruptedException {
		String expectedmonth="March 2023";
		String day="20";
		System.setProperty("webdriver.chrome.driver", "C://myseledrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.phptravels.net/");
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		
		//*[@id=\"dpd1\"]/div/input
		Thread.sleep(2000);
		
		while(true) {
			String actualmonth=	driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/tbody/tr[5]/td[1]")).getText();
			//*[@id="fadein"]/div[3]/div[1]/table/tbody/tr[5]/td[1]
			//html/body/div[9]/div[1]/table/thead/tr[1]/th[2]
			if(actualmonth.equals(expectedmonth)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]")).click();
				//*[@id="fadein"]/div[3]/div[1]/table/thead/tr[1]/th[3]/i
				//html/body/div[9]/div[1]/table/thead/tr[1]/th[3]
			
			}
		}
		//driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody[1]//tr//td[contains(text(),'5')]")).click();
		driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody[1]//tr//td[contains(text(),"+ day+")]")).click();
		
	}

}
