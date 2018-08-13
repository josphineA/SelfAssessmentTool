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

public class Level1Assessment extends BaseClass {


	@FindBy(name = "SalaryID")
    WebElement empsalary;
	
	@FindBy(name = "JobSearchID")
    WebElement empoccupation;
	
	@FindBy(name = "firstYearGrad")
    WebElement graduation;
	
//	@FindBy(name = "ExperienceLocalID")
//    WebElement sgexperience;
	
//	@FindBy(name = "numberOfEducation")
//    WebElement education;
	
	@FindBy(xpath = "//*[@id=\"firstEduSection\"]/table/tbody[1]/tr[3]/td[6]/a/img")
    WebElement instituteseacrh;
	
	@FindBy(name = "DOB")
    WebElement dob;
	
	@FindBy(name = "DOB")
    WebElement purpose;
	
	//Initializing the Page Objects:
	public Level1Assessment(){
		PageFactory.initElements(driver, this);
	}
	
	public void form1() throws InterruptedException{
		System.out.println("starting to fill the Form.class...");
		
		 String monthsal=reader.getCellData("Form1", "monthlysalary", 2).toString();
		 System.out.println(monthsal);
		 empsalary.sendKeys(monthsal);
	
		 String occup=reader.getCellData("Form1", "occupation", 2);
		 System.out.println(occup);
		 empoccupation.sendKeys(occup);
		 driver.findElement(By.id("JobSearchID")).sendKeys(Keys.TAB);
		// Thread.sleep(5000);
		 
		 String exp=reader.getCellData("Form1", "yearsofexp", 2);
		 System.out.println(exp);
		 Select expid = new Select(driver.findElement(By.name("ExperienceID")));
		 expid.selectByVisibleText(exp);
		 
		 String sgexp=reader.getCellData("Form1", "expinsg", 2);
		 System.out.println(sgexp);
		 Select localexpid = new Select(driver.findElement(By.name("ExperienceLocalID")));
		 localexpid.selectByVisibleText(sgexp);
		 
		 String qualification=reader.getCellData("Form1", "noofqualification", 2);
		 System.out.println(qualification);
		 Select qualno = new Select(driver.findElement(By.name("numberOfEducation")));
		 qualno.selectByVisibleText(qualification);
		 Thread.sleep(10000);
		 
		 String facul=reader.getCellData("Form1", "faculty", 2);
		 System.out.println(facul);
		 Select faculty = new Select(driver.findElement(By.name("firstFacultySel")));
		 faculty.selectByVisibleText(facul);
		 Thread.sleep(5000);
		 
		 String major=reader.getCellData("Form1", "specialisation", 2);
		 System.out.println(major);
		 Select specialisation = new Select(driver.findElement(By.name("firstEduSpecSelected")));
		 specialisation.selectByVisibleText(major);
		 
		 String mode=reader.getCellData("Form1", "studymode", 2);
		 System.out.println(mode);
		 Select studymode = new Select(driver.findElement(By.name("firstStudymodeID")));
		 studymode.selectByVisibleText(mode);
		 
		 String year=reader.getCellData("Form1", "yearStudy", 2);
		 System.out.println(year);
		 Select studyyear = new Select(driver.findElement(By.name("yearStudy")));
		 studyyear.selectByVisibleText(year);
		 
		 String month=reader.getCellData("Form1", "monthStudy", 2);
		 System.out.println(month);
		 Select studymonth = new Select(driver.findElement(By.name("monthStudy")));
		 studymonth.selectByVisibleText(month);
		 
		 String gradyear=reader.getCellData("Form1", "graduationyear", 2);
		 System.out.println(gradyear);
		 graduation.sendKeys(gradyear);
		  
//		 String gradyear=reader.getCellData("Form1", "graduationyear", 2).toString();
//		 System.out.println(gradyear);
//		 Select graduation = new Select(driver.findElement(By.name("firstYearGrad")));
//		 graduation.selectByVisibleText(gradyear);
		 
		 String nationality=reader.getCellData("Form1", "nationality", 2);
		 System.out.println(nationality);
		 Select country = new Select(driver.findElement(By.name("NationalityID")));
		 country.selectByVisibleText(nationality);
		 
//		 System.out.println("ABCD");
//		 ((JavascriptExecutor)driver).executeScript("document.getElementById('DOB').setAttribute('value','10/02/1983')").toString();
		 
		 System.out.println("ABCD");
		 String purpose=reader.getCellData("Form1", "satpurpose", 2);
		  System.out.println(purpose);
		  
		  WebElement satpurp;
		  if(purpose.equals("Yes")){
			  
			  satpurp = driver.findElement(By.id("renewalApplication1"));
		  }
		  else {
			  satpurp = driver.findElement(By.id("renewalApplication2"));
		  }
		  satpurp.click();
		  
//		 instituteseacrh.click();
//		 
//		 UniversitySearch unisearch=new UniversitySearch();
//		 unisearch.institution();
		  
	}
	
}
