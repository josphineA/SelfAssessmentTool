package com.sat.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.sat.base.BaseClass;
import com.sat.pages.BeforeYouStart;
import com.sat.pages.HomePage;

public class BeforeYouStartTest extends BaseClass {
	BeforeYouStart befStart;

	public BeforeYouStartTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		driverInitialization();
		driver.get(prop.getProperty("beforestarturl"));
		befStart = new BeforeYouStart();	
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	
	@Test(priority=1)
	public void beforeStartTest() throws InterruptedException{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		befStart.beforeStart();
	}
	
		
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
	

}
