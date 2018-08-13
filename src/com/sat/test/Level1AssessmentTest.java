package com.sat.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.sat.base.BaseClass;
import com.sat.pages.BeforeYouStart;
import com.sat.pages.HomePage;
import com.sat.pages.Level1Assessment;

public class Level1AssessmentTest extends BaseClass {
	Level1Assessment level1;

	public Level1AssessmentTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		driverInitialization();
		driver.get(prop.getProperty("level1url"));
		level1 = new Level1Assessment();	
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	
	@Test(priority=1)
	public void Level1AssessmentTest() throws InterruptedException{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		level1.form1();
	}
	
		
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
	

}
