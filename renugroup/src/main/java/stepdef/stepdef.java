package stepdef;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdef extends Dataprovider {
	WebDriver driver;

	
	@Given("^USer is logged in with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_logged_in_with_valid_and(String arg1, String arg2) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
		
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
				  driver.get("http://www.amazon.com/");
				  System.out.println("This is first step");
				  Actions act = new Actions(driver); 
				  
				  WebElement ele =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
				  
				 act.doubleClick(ele).build().perform();
				 Thread.sleep(2000);
				  driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).click( ); 
				  driver.findElement(By.xpath("(//label[text()[normalize-space()='Email (phone for mobile accounts)']]/following::input)[1]")).sendKeys(arg1); 
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@type='submit']")).click();
				  String text = super.readData();
				  
				 driver.findElement(By.id("ap_password")).sendKeys(text);
				 
	    
	}

	@Then("^click on the signin button$")
	public void click_on_the_signin_button() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^Enter the product name and search$")
	public void enter_the_product_name_and_search() throws Throwable {
		List<WebElement> dd = driver.findElements(By. xpath("//select[@class='nav-search-dropdown searchSelect']"));
		
		
		driver.findElement(By.xpath("(//label[text()[normalize-space()='Search']]/following::input)[1]")).sendKeys("Shampoos" , Keys.ENTER); 
	}

	@And("^disply and sort the product as per the price\\.$")
	public void disply_and_sort_the_product_as_per_the_price() throws Throwable {
		driver.findElement(By.xpath("//span[@data-action='a-dropdown-button']")).click();
		driver.findElement(By.xpath("//a[@data-value='{\"stringVal\":\"price-asc-rank\"}']")).click();
	    
		
	}
	@Then("^i am going to read data from fillo$")
	public void i_am_going_to_read_data_from_fillo() throws Throwable {
	    
		/*
		 * Fillo obj = new Fillo(); Connection connect =
		 * obj.getConnection("C:\\Users\\training\\Desktop\\Renu\\data.xlsx"); Recordset
		 * set = connect.executeQuery("Select * from Sheet1");
		 * 
		 * while(set.next()) { System.out.println(set.getField("Name") +
		 * set.getField("acc name")); }
		 */
		
		System.out.println("This is last step");
		}



	}
