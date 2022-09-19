package robotAPIexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RoboDemo1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/site/file/yearly_calender_workbook");
		driver.findElement(By.xpath("/html/body/div/section/div/div[1]/ul/li[3]/a")).click();
		Robot robot=new Robot();
		
		/*Down arrow 
			3 times tab 
			enter   
		 */

		robot.keyPress(KeyEvent.VK_DOWN);//press down arrow in keyboard 
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);//enter key 
		Thread.sleep(2000);
		
	}

}
