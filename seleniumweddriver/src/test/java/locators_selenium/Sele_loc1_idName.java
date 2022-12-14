package locators_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_loc1_idName {
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "D://Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	
	// id and name locators 
	WebElement searchbox=driver.findElement(By.id("search_query_top"));
	searchbox.sendKeys("t-shirts");
	//by name locator 
	driver.findElement(By.name("submit-search")).click();
	
	// link text locator 
	driver.findElement(By.linkText("Print Chiffon Dress")).click();
	
	//partial linktext
	driver.findElement(By.partialLinkText("Print Chiffon")).click();
	
	//css selectors statrted ********************************************
	
	// class name fining all sliders count
			int sliders=driver.findElements(By.className("homeslider-container")).size();
			System.out.println(sliders);
			// tagname finding all links 
	    int links=	driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		// css selector "Tag and Id combination "
		// Tagname#ID
		//#ID
	driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail");	

	//Tagname#ID

	driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");

	//Tagname and class name combination   after space in class name no need to consider
	//TagName.Classvalue 
	//.classvalue

	driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc@gmail.com");

	//TagName.Classvalue

	driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com");

	//tag and attribute combination 
	//Tagname[attribute=value]
	//[attribute=value]
	 driver.findElement(By.cssSelector("[name=email]")).sendKeys("abc@gmail.com");

	//Tagname[attribute=value]
	driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abc@gmail.com");

	// tag,class attribute combination when we have same tag name and class name to differentiate them we use attibute as additional paramaeter
	//TagName.Classvalue[attibute=value]

	driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("abc@gmail.com");//email
	driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("abc");//password
	
	
	//css selectors ended ***********************************************************************************************
	
	
	// xpath relative 
		// syntax: //TagName[@attribute="value"]
		//example:  //Input[@name="txtUsername"]
		
		//Absolue xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/form[1]/input[4]")).sendKeys("T-set");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/form[1]/button[4]")).click();
		
		//relative xpath
		//injava inside "" double quotation double quotation is not allowed if you want then "//input [@id=\"manan\"]"
		//or else inside double quote put single qotes like this "//input[@id='serach_query_top']"
		driver.findElement(By.xpath("//input[@id='serach_query_top']")).sendKeys("T-shirt");
	   driver.findElement(By.xpath("//button[@name='submit_search']")).click();

	   /*xpath options
	    * or
	    * and
	    * contains()
	    * starts-with()
	    * text()
	    * chained xpath
	    * 
	    * or
	    *"//input[@id='search_query_top' or @name='search_query']
	    *
	    *and
	    * "//input[@id='search_query_top' and @name='search_query']
	    * 
	    *  contains()
	    * "//tagname[contains(@attribute,'any portion of value')]
	    * "actual xpath  -->   //input[@id='firstname']  --> basic xpath
	    * " with contains metod xpath -->  //input[contains(@id,'first')]  --> using contains()
	    * 
	    * " one button which changing its id dynamically 
	    * "//input[@id='start']   --> for starting
	    * "//input[@id='stop']    --> for stoping 
	    * " for this we use common id characters in contains method
	    * "//input[contains(@id,'st')]   --> dynamic xpath 
	    * 
	    * starts-with() -->this will find only if you give starting characters 
	    * "//tagname[starts-with(@attribute,'starting portion of value')]
	    * "//input[starts-with(@id,'st')]  -->dynamic xpath startwith function
	    * 
	    * text()
	    *"//tagname[text()='tag text value']
	    *"//a[text()='Women']
	    * 
	    *  chained xpath
	    * one after another xpath side by side for identifying child elements from parent element
	    *"//tagname[@attribute='value']//tagname2[@attribute2='value2']
	    * 
	    * "//form[@id='searchbox']//input[4]
	    * "//form[@id='searchbox']//input[@id='search_query_top']
	    * "//form[@id='searchbox']//button
	    * "//form[@id='searchbox']//button[@name='submit_search']
	    * 
	    */
	   
	   
	   // x path with  or operator 
	   driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("T-shirts");
	   driver.findElement(By.xpath("//button[@name='submit_serach' or @class='btn btn-default button-search']")).click();
	   // x path with  and  operator 
	   driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("T-shirts");
	   driver.findElement(By.xpath("//button[@name='submit_serach' and @class='btn btn-default button-search']")).click();
	   
	   //xpath with contains()
	   driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T-shirt");//id=serach_query_top
	   driver.findElement(By.xpath("//button[contains(@name,'search')]")).click();//name=submit_search
	   
	   
	   //xpath with starts-with ()
	   
	   driver.findElement(By.xpath("//input[starts-with(@id,'serach_query')]")).sendKeys("T-shirt");
	   driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();
	   
	   //xpath with text () function
	   driver.findElement(By.xpath("//a[text()='Women']")).click();  //women tab
	   
	   
	   //chained xpaths 
	    driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirts");
	    driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
	    	
driver.quit();
}
}