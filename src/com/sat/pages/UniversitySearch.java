package com.sat.pages;

import java.text.Normalizer.Form;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sat.base.BaseClass;

public class UniversitySearch extends BaseClass {


	@FindBy(name = "searchButton")
    WebElement retrievebutton;
	
	@FindBy(name = "CountryID")
    WebElement countryID;
	
	@FindBy(name = "EduSearchName")
    WebElement institutename;
	
	@FindBy(name = "finalButton")
    WebElement proceed;
	
	//Initializing the Page Objects:
	public UniversitySearch(){
		//driver.get(prop.getProperty("Uniseacrh"));
		
		PageFactory.initElements(driver, this);
	}
	
	public void institution1() throws InterruptedException{
		System.out.println("Entering the institute seacrh popup window...");
		System.out.println(driver.getCurrentUrl());
			
		//method 1
		//how many windows count
		System.out.println(driver.getWindowHandles().size());
		//windows collection
		Set<String> customerWindow = driver.getWindowHandles();
		 
		driver.switchTo().window((String) customerWindow.toArray()[1]);
		
		
		//Method 2 for getting popup  window
//		String url=prop.getProperty("Uniseacrh");
//		((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url);
		
		
		Thread.sleep(5000);
		
		 String firstedu=reader.getCellData("Firsteducation", "country", 2);
		 System.out.println(firstedu);
		// Thread.sleep(5000);
		
		 
		 
		 Select educountry = new Select(driver.findElement(By.name("CountryID")));
		 educountry.selectByVisibleText(firstedu);
		 Thread.sleep(5000);
		 
 
		 String uniname=reader.getCellData("Firsteducation", "univname", 2).toString();
		 System.out.println(uniname);
		 institutename.sendKeys(uniname);;
		 
		 
		// driver.findElement(By.id("EduSearchName")).sendKeys(Keys.TAB);
		 Thread.sleep(4000);
 
		  retrievebutton.click();
		  Thread.sleep(4000);
		  
		  proceed.click();
		  System.out.println("*****" +driver.getWindowHandles().size());
		  System.out.println("*********" + driver);
			driver.switchTo().window((String) customerWindow.toArray()[0]);
			  System.out.println("Exiting current window");

		  System.out.println(driver.getCurrentUrl());

		  System.out.println("=======");
	  
		  
		  System.out.println(driver.getCurrentUrl());
		  
		  Level1Assessment level1=new Level1Assessment();
		  level1.form2();
		  
		}
	
	
	public void institution2() throws InterruptedException{
		System.out.println("Entering the institute seacrh popup window2...");
		System.out.println(driver.getCurrentUrl());
			
		//method 1
		//how many windows count
		System.out.println(driver.getWindowHandles().size());
		//windows collection
		Set<String> customerWindow = driver.getWindowHandles();
		 
		driver.switchTo().window((String) customerWindow.toArray()[1]);
		
		
		//Method 2 for getting popup  window
//		String url=prop.getProperty("Uniseacrh");
//		((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url);
		
		
		Thread.sleep(5000);
		
		 String secondedu=reader.getCellData("Secondeducation", "country", 2);
		 System.out.println(secondedu);
		// Thread.sleep(5000);
		
		 
		 
		 Select educountry2 = new Select(driver.findElement(By.name("CountryID")));
		 educountry2.selectByVisibleText(secondedu);
		 Thread.sleep(5000);
		 
 
		 String uniname2=reader.getCellData("Secondeducation", "univname", 2).toString();
		 System.out.println(uniname2);
		 institutename.sendKeys(uniname2);;
		 
		 
		// driver.findElement(By.id("EduSearchName")).sendKeys(Keys.TAB);
		 Thread.sleep(4000);
 
		  retrievebutton.click();
		  Thread.sleep(4000);
		  
		  proceed.click();
		  System.out.println("*****" +driver.getWindowHandles().size());
		  System.out.println("*********" + driver);
			driver.switchTo().window((String) customerWindow.toArray()[0]);
			  System.out.println("Exiting current window");

		  System.out.println(driver.getCurrentUrl());

		  System.out.println("=======");
	  
		  
		  System.out.println(driver.getCurrentUrl());
		  
		  Level1Assessment level1=new Level1Assessment();
		  level1.form4();
		  
		}
	
}
