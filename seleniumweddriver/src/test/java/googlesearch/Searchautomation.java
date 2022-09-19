package googlesearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		//name="q"
		driver.findElement(By.name("q")).sendKeys("java");
	Thread.sleep(1000);
List<WebElement> searchlist=	driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li/descendant::div[@class='pcTkSc']"));
	System.out.println("all serch iters :"+searchlist.size());
	
	for(int i=0;i<searchlist.size();i++) {
		String searchitem= searchlist.get(i).getText();
		System.out.println(searchitem);
	if(searchitem.contains("java tutorial")) {
		searchlist.get(i).click();
		break;
	}
	
	}
	driver.quit();
	}

}
