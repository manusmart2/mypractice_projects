package sele_locators;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Sele_locators2xpathaxes {
	 public String baseURL = "https://demo.guru99.com/v4/";
//	 public String baseURL = "http://automationpractice.com/index.php";

	 public String username = "mngr392218";
		public String password = "rYvyjAn";
		public static WebDriver driver;
		public static Logger logger;
		@BeforeClass
		public void setup() {
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
			driver = new ChromeDriver();  
			
			logger =Logger.getLogger("comproject");
			PropertyConfigurator.configure("log4j.properties");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			driver.get(baseURL);
		}
	

@Test
public void xpathaxes() {
	/*xpath axes is used to serch for multiple nodes in xml document from current node context
	 * these methods used when web element is not identified by Id,name,class name,link text,css selector
	 *
	 * Self
	 * Parent  (above the self)
	 * Child   (below the self)
	 * Ancestor  (above the parent of self)
	 * Descendant  (below the child of self)
	 * Following (after parent/front one of parent) left to right direction
	 * Following-sibling (after self/front one of self)  left to right direction
	 * Preceding  (before parent/back one of parent) left to right direction
	 * Preceding-sibling (before self/back one of self) left to right direction
	 * 
	 * 
	 * 
	 * Self
	 * 
	 * child : traverse all child elements of current html tag
	 * " //*[attribute='value']/child::tagname
	 * 
	 * parent : traverse parent element of current html tag
	 * " //*[attribute='value']/parent::tagname
	 * 
	 * following : traverse all  elements that comes after  current html tag
	 * " //*[attribute='value']/following::tagname
	 * 
	 * preceding : traverse all nodes that comes before the current html tag
	 * " //*[attribute='value']/preceding::tagname
	 * 
	 * following-siblings : traverse all current html tag to next sibling html tag
	 * " //current html tag[attribute='value']/following-sibling::sibling tag[@attribute='value']
	 * 
	 * preceding-siblings : traverse all current html tag to previous sibling html tag
	 * " //current html tag[attribute='value']/preceding-sibling::previous tag[@attribute='value']
	 * 
	 * 
	 * Ancestor : traverse all ancestor elements(grand parents,parent,etc) of current html tag
	 * " //*[attribute='value']/ancestor::tagname
	 * 
	 * Descendant : traverse all decendent elements(child nodes,grand chils nodes,etc) of current html tag
	 * " //*[attribute='value']/descendant::tagname
	 */
	
	//xpath axes
	
	
	//self :- select current node
	//"//tagname[contains(text(),'textvalue')]/self::tagname
	
String text=	driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/self::a")).getText();
	System.out.println(text);
	
	//Parent  :- selects the parent of the  current node(always one)
	//"//tagname[contains(text(),'textvalue')]/parent::parent_tagname
	
String text1=	driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/parent::td")).getText();
	System.out.println(text1); 
	
	//Child  :- selects all childrens of the  current node(one or many)
		//"//tagname[contains(text(),'textvalue')]/ancestor::ancesstor_tagname/child::child_tagname
		
	List<WebElement> childs=	driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/child::td"));
		System.out.println(childs.size()); 
	
		//Ancestor  :- selects all ancesters (parent,grand parent ,etc)
		//"//tagname[contains(text(),'textvalue')]/ancestor::ancestor_tagname
		
	String ansesotrtext=	driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr")).getText();
		System.out.println(ansesotrtext); 
		
		//Descendant  :- selects all descendants (chidren,grandchildren,etc) of current node
				//"//tagname[contains(text(),'textvalue')]/ancestor::ancesstor_tagname/descendant::descendant_tagname
				
			List<WebElement> descendentvars=	driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/descendant::*"));
				System.out.println(descendentvars.size()); 
		
				//Following  :- selects everything in the document after the closing tag  of current node
				//"//tagname[contains(text(),'textvalue')]/ancestor::ancesstor_tagname/following::fallowing_tagname
				
				List<WebElement> fallwingstahs=	driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/following::tr"));
					System.out.println(fallwingstahs.size()); 
			
					//Following-sibling  :- selects all siblings after the current node
					//"//tagname[contains(text(),'textvalue')]/ancestor::ancesstor_tagname/following-sibling::fallowing_tagname
					
					List<WebElement> fallwingsiblingstahs=	driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/following-sibling::tr"));
						System.out.println(fallwingsiblingstahs.size()); 
						
						//Preceding  :- selects all nodes that appear before the current node in the document
						//"//tagname[contains(text(),'textvalue')]/ancestor::ancesstor_tagname/precedinging::precedinging_tagname
						
						List<WebElement> precedingstahs=	driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/preceding::tr"));
							System.out.println(precedingstahs.size()); 
					
					//Preceding-sibling  :- selects all siblings before the current node
					//"//tagname[contains(text(),'textvalue')]/ancestor::ancesstor_tagname/Preceding-sibling::Preceding_tagname
							
					List<WebElement> Precedingsiblingstahs=	driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/preceding-sibling::tr"));
					System.out.println(Precedingsiblingstahs.size()); 
					
					
}

		
		@Test
		public void logingxpathaxes() {
			
			//with child axes xpath example 
			//find the signup button from the registaration form present in the facebook application . (child)
			////div[@id='ref_form_box']/child::div[10]/button
			driver.findElement(By.xpath("//div[@id='ref_form_box']/child::div[10]/button")).click();
			
		//locate firstname field from signup button in facebook (parent)
//			button[@id='u_0_13']/parent::*/parent::*/child::div[1]/div/div[1]
			driver.findElement(By.xpath("button[@id='u_0_13']/parent::*/parent::*/child::div[1]/div/div[1]")).sendKeys("manu");

			//identify the password from mobile number fileld in facebook.(following)
			//input[@id='u_0_r']/following::input[2]
			
			//locating mobile number by using new password field in facebook (preceding)
		  //input[@id='password_step_input']/preceding::input[2]

		//locate surname from female radio button in facebook(Ancestor)
			//input[@id='u_0_4']/ancestor::div[2]/div[1]/div/div[2]
			//input[@id='u_0_4']/ancestor::div[2]//input[@id='u_0_o']
			
			 
			//identify the search text box from the google search button present i the google search home page . (Parent) 
			//div[@class='FpdoLc tfB0Bf']//input[@name='btnk']/parent::*/parent::*/parent::*/div[1]
			
			//identify the todays deal link from the amezone search text box present in the amezone home page . (Following)
			//input[@id='twotabsearchtextbox']/following::a[contains(text(),"Todays's Deals")]

			//Identify the Hello,Signin from the amezone search text box present in the amezone home page . (Following)
			//:: always fallowed by tagname
			//input[@id='twotabsearchtextbox']/following::span[contains(text(),'Hello,Sign in')]
			
			//identify mobile link which is part of menu bar - Amezone (Descendant)
		//div[@id='nav-xshop']/descendant::a[contains(text(),"Mobiles")]
			
		}	
		
		
		
		@AfterClass
		public void tearDown() {

			driver.quit();
		}
		


}
