package com.sat.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.sat.base.BaseClass;
import com.sat.pages.HomePage;
import com.sat.pages.TermsAndCond;

public class TermsAndCondTest extends BaseClass {

	TermsAndCond termsCondition;

	public TermsAndCondTest() {
		super();
	}
	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		driverInitialization();
		driver.get(prop.getProperty("termscondurl"));
		termsCondition = new TermsAndCond();	
	}
	

	
	@Test(priority=1)
	public void clickAgreeTest() throws InterruptedException{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		termsCondition.clickAgree();
	}
	

	@AfterMethod
	public void tearDown(){
		//driver.quit();

	}

}
