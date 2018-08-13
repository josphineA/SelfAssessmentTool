package com.sat.pages;

import java.text.Normalizer.Form;

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
	
	//Initializing the Page Objects:
	public UniversitySearch(){
		PageFactory.initElements(driver, this);
	}
	
	public void institution() throws InterruptedException{
		System.out.println("Entering the institute seacrh popup window...");
		
				 
		 String firstedu=reader.getCellData("Firsteducation", "country", 2);
		 System.out.println(firstedu);
		 Thread.sleep(5000);
		 Select educountry = new Select(driver.findElement(By.name("CountryID")));
		 educountry.selectByVisibleText(firstedu);
		 Thread.sleep(10000);
		 
			 
		 String universityname=reader.getCellData("Firsteducation", "univname", 2);
		 System.out.println(universityname);
		 Select institutename = new Select(driver.findElement(By.name("EduSearchName")));
		 institutename.selectByVisibleText(universityname);
		 driver.findElement(By.id("EduSearchName")).sendKeys(Keys.TAB);
		 Thread.sleep(10000);
		 
		 
		 
		 retrievebutton.click();


		}
	
}
