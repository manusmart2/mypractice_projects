package dropdowns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//to solve sorting problem of original list we use this methode
public class Dropdown_example2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.id("animals"));
		Select se = new Select(element);
		List originalList = new ArrayList();
		List tempList = new ArrayList();
		
		List<WebElement> options = se.getOptions();
		for (WebElement e : options)
		{
			originalList.add(e.getText());
			tempList.add(e.getText());

		}
			//tempList = originalList;// using this original list also sorted to stop sort of original list we go another methode 
			

			System.out.println("Before sorting temp list" + tempList);
			System.out.println("Before sorting original list" + originalList);
			
			Collections.sort(tempList);
			
			System.out.println("after sorting temp list" + tempList);
			System.out.println("after sorting original list" + originalList);

			if (tempList == originalList) {
				System.out.println("drop down sorted list");

			} else {
				System.out.println("drop down list not sorted");
			}
			
			driver.close();
		

	}

}
