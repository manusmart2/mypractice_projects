package screen_recorder_monteAPI;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class monte_screen_recorder {
 WebDriver driver;

 @BeforeClass
 void setup() {
  System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
  driver = new ChromeDriver();

  driver.get("http://demo.nopcommerce.com");
  
  driver.manage().window().maximize();
 }

 @Test
 void verifyLinks() throws Exception {
  ScreenRecorderUtil.startRecord("CheckingLinks");
  driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click(); // Books
  
  System.out.println(driver.getTitle());
  driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
  System.out.println(driver.getTitle());
  
  
  driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")).click();
  System.out.println(driver.getTitle());
  
  // /html/body/div[6]/div[2]/ul[1]/li[5]/a
  driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
  System.out.println(driver.getTitle());
  
  
  // Computers
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/a")).click();
  System.out.println(driver.getTitle());
  
  // Electronics
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
  System.out.println(driver.getTitle());
  
  // Apparel
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
  System.out.println(driver.getTitle());
  
  // Digital Downloads
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[4]/a")).click();
  System.out.println(driver.getTitle());
  
  // Jewelary
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[6]/a")).click();
  System.out.println(driver.getTitle());
  
  // Giftcards
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[7]/a")).click();
  System.out.println(driver.getTitle());
  
  ScreenRecorderUtil.stopRecord();
 }
 
 @AfterClass
 void tearDown()
 {
  driver.close();
 }

}