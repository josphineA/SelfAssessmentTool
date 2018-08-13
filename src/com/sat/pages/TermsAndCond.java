package com.sat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sat.base.BaseClass;


public class TermsAndCond extends BaseClass {


	@FindBy(xpath = "//*[@id=\"MainContent\"]/div/div/form/table/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[12]/td/table/tbody/tr/td/div/table/tbody/tr/td[1]/input")
	WebElement agreeButton;
	
	//Initializing the Page Objects:
	public TermsAndCond(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickAgree() throws InterruptedException{
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,800)", "");
		agreeButton.click();
		System.out.println("Agree button clicked");
		
		BeforeYouStart before=new BeforeYouStart();
		before.beforeStart();
		
	}
	 
}
