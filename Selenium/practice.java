package Selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.checkerframework.framework.qual.FromByteCode;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.graphbuilder.struc.LinkedList;

public class practice {


	 public static void main(String[] args) throws InterruptedException, SQLException {

		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\User\\Desktop\\IT\\Bright Path Technology\\Selenium Folder\\Browsers\\Chrome 93\\chromedriver.exe"
		  ); WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		  WebElement ele= driver.findElement(By.xpath("(//a[contains(text(),'Download sample DOC file')])[1]"));
		  
	
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  

		  js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red');", ele);
		  

//		  @BeforeSuite
//		  @AfterSuite
//		  @BeforeClass
//		  @AfterClass
//		  @BeforeTest
//		  @AfrerTest
//		  @BeforeMethod
//		  @AfterMethod
//		  @DataProvider
//		  @Test
//		  @Parameters
//		  @Listeners
//		  @Factory
		  
		 
		 

		  
		  
		/*
		 * //Explict Wait WebDriverWait wait = new WebDriverWait(driver,
		 * Duration.ofSeconds(10));
		 * 
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("button"))).click();
		 * 
		 * 
		 * //Fluent Wait Wait <WebDriver> wait1 = new
		 * FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(
		 * Duration.ofSeconds(5)) .ignoring(NoSuchElementException.class);
		 * 
		 * wait1.until(ExpectedConditions.elementToBeClickable(By.id("button"))).click()
		 * ;
		 * 
		 * // Implicit wait
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * 
		 * 
		 * driver.wait();
		 * 
		 * 
		 * List<WebElement> elements = driver.findElements(By.tagName("a"));
		 * 
		 * List <WebElement>finalList = new ArrayList<>(); for (WebElement element :
		 * elements){ if(element.getAttribute("href") != null){
		 * 
		 * finalList.add(element); } }
		 */
		/*
		 * driver.get("http://www.google.com");
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * WebElement ele = driver.findElement(By.className("gLFyf"));
		 * 
		 * 
		 * act.sendKeys(ele, "Hello Goodle").sendKeys(Keys.ENTER).perform();
		 * 
		 * 
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * 
		 * js.executeScript("document.getElementsByName('q').value='Google'");
		 * 
		 * driver.wait(10);
		 * 
		 * 
		 * 
		 * 
		 */
		/*
		 * System.out.print(driver.findElement(By.name("q")).getAttribute("className"));
		 */
		
	 }

	}


