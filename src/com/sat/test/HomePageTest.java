package com.sat.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.sat.base.BaseClass;
import com.sat.pages.HomePage;

public class HomePageTest extends BaseClass {
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		driverInitialization();
		driver.get(prop.getProperty("homepageurl"));
		homePage = new HomePage();	
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	
	@Test(priority=1)
	public void clickEligibilityButtonTest(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.clickEligibilityButton();
	}
	
	@Test(priority=2)
	public void searchButtonTest(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.searchButton();	
		
		
	}
	
	@Test(priority=3)
	public void verifySitemapTest(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.verifySitemap();	
	}
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
	

}
