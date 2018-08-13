package com.sat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sat.base.BaseClass;

public class BeforeYouStart extends BaseClass {


	@FindBy(xpath = "//*[@id=\"MainContent\"]/div/div/table/tbody/tr[8]/td/table/tbody/tr/td/div/table/tbody[1]/tr/td/input[1]")
    WebElement contButton;
	
	//Initializing the Page Objects:
	public BeforeYouStart(){
		PageFactory.initElements(driver, this);
	}
	
	public void beforeStart() throws InterruptedException{
		

		String country=reader.getCellData("Beforeyoustart", "country", 2);
		System.out.println(country);
		Select countryid = new Select(driver.findElement(By.id("CountryID")));
		countryid.selectByVisibleText(country);
		
		String user=reader.getCellData("Beforeyoustart", "user", 2);
		System.out.println(user);
		Select usertype = new Select(driver.findElement(By.id("TypeOfUser")));
		usertype.selectByVisibleText(user);
		
		System.out.println("Before start page completed");
		contButton.click();
		
		Level1Assessment level1=new Level1Assessment();
		level1.form1();
	}
	
//	public void searchButton(){
//		searchButton.click();
//		searchText.sendKeys("Annual Leave");
//		searchClick.click();
//	}
//
//	public void verifySitemap(){
//		sitemapClick.click();
//	}
}
