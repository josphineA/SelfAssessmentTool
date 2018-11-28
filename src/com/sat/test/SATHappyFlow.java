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

public class SATHappyFlow extends BaseClass {

	TermsAndCond termsCondition;

	public SATHappyFlow() {
		super();
	}
	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		driverInitialization();
		System.out.println("=Terms setUp==");
		driver.get(prop.getProperty("termscondurl"));
		termsCondition = new TermsAndCond();	
	}
	

	
	@Test(priority=1)
	public void clickAgreeTest() throws InterruptedException{
		System.out.println("clickAgreeTest in Test file");
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
