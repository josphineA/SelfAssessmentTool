package com.sat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sat.base.BaseClass;

public class HomePage extends BaseClass {

	
	@FindBy(id = "eserviceavailability_0_HypLogin")
	WebElement eligibilityCheck;

	@FindBy(xpath = "//*[@id=\"mainform\"]/div[6]/div[1]/div/a")
	WebElement searchButton;
	
	@FindBy(id = "search-query")
	WebElement searchText;
	
	@FindBy(xpath ="//*[@id=\"navsearch_0_DivCode\"]/div/div/div/div/div[3]/button")
	WebElement searchClick;
	
	@FindBy(xpath ="//*[@id=\"header_0_DivCode\"]/header/div/nav/a[1]")
	WebElement sitemapClick;
	
	//Initializing the Page Objects:
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickEligibilityButton(){
		eligibilityCheck.click();
		System.out.println("Eligibilty check clicked");
		
	}
	
	public void searchButton(){
		searchButton.click();
		searchText.sendKeys("Annual Leave");
		searchClick.click();
	}

	public void verifySitemap(){
		sitemapClick.click();
	}
}
