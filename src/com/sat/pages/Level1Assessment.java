package com.sat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sat.base.BaseClass;

public class Level1Assessment extends BaseClass {
	
	public static String qualification=null;

	@FindBy(name = "SalaryID")
	WebElement empsalary;

	@FindBy(name = "JobSearchID")
	WebElement empoccupation;

	@FindBy(name = "firstYearGrad")
	WebElement graduation;

	@FindBy(name = "secondYearGrad")
	WebElement secondgraduation;
	
	@FindBy(xpath = "//*[contains(@href,'educationPopUp')]")
	WebElement institutesearch;

	@FindBy(xpath = "//*[contains(@href,'educationPopUp2')]")
	WebElement institutesearch2;
	
	
	@FindBy(name = "DOB")
	WebElement dob;

	@FindBy(id = "goButton")
	WebElement frmcomplete;
		

	// Initializing the Page Objects:
	public Level1Assessment() {// default constrctor
		PageFactory.initElements(driver, this);
	}

	public void form1() throws InterruptedException {
		System.out.println("starting to fill the Form.class...");

		String monthsal = reader.getCellData("Form1", "monthlysalary", 2).toString();
		System.out.println(monthsal);
		empsalary.sendKeys(monthsal);

		String occup = reader.getCellData("Form1", "occupation", 2);
		System.out.println(occup);
		empoccupation.sendKeys(occup);
		driver.findElement(By.id("JobSearchID")).sendKeys(Keys.TAB);
		// Thread.sleep(5000);

		String exp = reader.getCellData("Form1", "yearsofexp", 2);
		System.out.println(exp);
		Select expid = new Select(driver.findElement(By.name("ExperienceID")));
		expid.selectByVisibleText(exp);

		String sgexp = reader.getCellData("Form1", "expinsg", 2);
		System.out.println(sgexp);
		Select localexpid = new Select(driver.findElement(By.name("ExperienceLocalID")));
		localexpid.selectByVisibleText(sgexp);

		qualification = reader.getCellData("Form1", "noofqualification", 2);
		System.out.println(qualification);
		Select qualno = new Select(driver.findElement(By.name("numberOfEducation")));
		qualno.selectByVisibleText(qualification);
		Thread.sleep(10000);
				
		institutesearch.click();

		UniversitySearch unisearch = new UniversitySearch();
		unisearch.institution1();

	}

	public void form2() {
		try {
			// Thread.sleep(5000);
			System.out.println("==form2=");
		
		
			String awardinguniversity = reader.getCellData("Form1", "awardinguniv", 2).toString();
			System.out.println("***********" + awardinguniversity);
			
			Select firstuniv = new Select(driver.findElement(By.name("firstMapAwardingUni")));
			firstuniv.selectByVisibleText(awardinguniversity);
			Thread.sleep(5000);

			String firstqual = reader.getCellData("Form1", "firstqualification", 2);
			System.out.println(firstqual);
			Select firstdegree = new Select(driver.findElement(By.name("firstQual")));
			firstdegree.selectByVisibleText(firstqual);
			Thread.sleep(5000);

			String facul = reader.getCellData("Form1", "faculty", 2);
			System.out.println(facul);
			Select faculty = new Select(driver.findElement(By.name("firstFacultySel")));
			faculty.selectByVisibleText(facul);
			Thread.sleep(5000);

			String major = reader.getCellData("Form1", "specialisation", 2);
			System.out.println(major);
			Select specialisation = new Select(driver.findElement(By.name("firstEduSpecSelected")));
			specialisation.selectByVisibleText(major);

			String mode = reader.getCellData("Form1", "studymode", 2);
			System.out.println(mode);
			Select studymode = new Select(driver.findElement(By.name("firstStudymodeID")));
			studymode.selectByVisibleText(mode);

			String year = reader.getCellData("Form1", "yearStudy", 2);
			System.out.println(year);
			Select studyyear = new Select(driver.findElement(By.name("yearStudy")));
			studyyear.selectByVisibleText(year);

			String month = reader.getCellData("Form1", "monthStudy", 2);
			System.out.println(month);
			Select studymonth = new Select(driver.findElement(By.name("monthStudy")));
			studymonth.selectByVisibleText(month);

			String gradyear = reader.getCellData("Form1", "graduationyear", 2);
			System.out.println(gradyear);
			graduation.sendKeys(gradyear);
			
			
			System.out.println(qualification);
			
			if (qualification.equals("2 educational qualifications attained")){
				
				System.out.println("==Go to form 3=");
							
				form3(); }
				
				else {
								
			System.out.println("==Go to form 5=");
			form5();

	}
			
			
		}
			catch (Exception e) {
				e.printStackTrace();
				}
		}					

				
	public void form3() {
				
				try {
					
					System.out.println("==form3 Entering=");
			
//					if (qualification.equals("2 educational qualifications attained")){
//						
//						System.out.println("==Filling 2nd Educational details=");
//						
						institutesearch2.click();
//
						UniversitySearch unisearch = new UniversitySearch();
						unisearch.institution2();
						
				} catch (Exception e) {
					e.printStackTrace();}
					
					}
					
	public void form4() {
		
		try {		
			String awardinguniversity = reader.getCellData("Form1", "awardinguniv", 2).toString();
			System.out.println("***********" + awardinguniversity);
			
//			Select firstuniv = new Select(driver.findElement(By.name("firstMapAwardingUni")));
//			firstuniv.selectByVisibleText(awardinguniversity);
//			Thread.sleep(5000);

			String secondqual = reader.getCellData("Form1", "secondqualification", 2);
			System.out.println(secondqual);
			Select seconddegree = new Select(driver.findElement(By.name("secondQual")));
			seconddegree.selectByVisibleText(secondqual);
			Thread.sleep(5000);

			String secondfacul = reader.getCellData("Form1", "secondfaculty", 2);
			System.out.println(secondfacul);
			Select secondfaculty = new Select(driver.findElement(By.name("secondFacultySel")));
			secondfaculty.selectByVisibleText(secondfacul);
			Thread.sleep(5000);

			String secondmajor = reader.getCellData("Form1", "secondspecialisation", 2);
			System.out.println(secondmajor);
			Select secondspecialisation = new Select(driver.findElement(By.name("secondEduSpecSelected")));
			secondspecialisation.selectByVisibleText(secondmajor);

			String secondmode = reader.getCellData("Form1", "secondstudymode", 2);
			System.out.println(secondmode);
			Select secondstudymode = new Select(driver.findElement(By.name("secondStudymodeID")));
			secondstudymode.selectByVisibleText(secondmode);

			String secondyear = reader.getCellData("Form1", "secondyearStudy", 2);
			System.out.println(secondyear);
			Select secondstudyyear = new Select(driver.findElement(By.name("secondYearStudy")));
			secondstudyyear.selectByVisibleText(secondyear);

			String secondmonth = reader.getCellData("Form1", "secondmonthStudy", 2);
			System.out.println(secondmonth);
			Select secondstudymonth = new Select(driver.findElement(By.name("secondMonthStudy")));
			secondstudymonth.selectByVisibleText(secondmonth);

			String secondgradyear = reader.getCellData("Form1", "secondgraduationyear", 2);
			System.out.println(secondgradyear);
			secondgraduation.sendKeys(secondgradyear);
			
			form5();
			
				} catch (Exception e) {
	e.printStackTrace();}
	
	}
		public void form5() {
					
			try {	
				
			String nationality = reader.getCellData("Form1", "nationality", 2);
			System.out.println(nationality);
			Select country = new Select(driver.findElement(By.name("NationalityID")));
			country.selectByVisibleText(nationality);

			 WebElement date=driver.findElement(By.id("DOB"));			 
			 String dateVal=reader.getCellData("Form1", "dob", 2);
			 selectDateByJS(driver, date, dateVal);
//			 String dateVal="19/12/1983";
			 Thread.sleep(3000);
			 
			 WebElement doa=driver.findElement(By.id("DOA"));			 
			 String doaVal=reader.getCellData("Form1", "applndate", 2);
//			 System.out.println(doaVal);
//			 String doaVal="04/10/2018";
			 selectApplnDateByJS(driver, doa, doaVal);
			 Thread.sleep(3000);

			String purpose = reader.getCellData("Form1", "satpurpose", 2);
			System.out.println(purpose);

			WebElement satpurp;

			if (purpose.equals("Yes")) {

				satpurp = driver.findElement(By.id("renewalApplication1"));
			} else {
				satpurp = driver.findElement(By.id("renewalApplication2"));
			}
			satpurp.click();
			
			Thread.sleep(3000);
			
			frmcomplete.click();
			
		} catch (Exception e) {
			e.printStackTrace();
			}
	}

		
		public static void selectDateByJS(WebDriver driver,WebElement element,String dateVal) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
			
		}
		
		public static void selectApplnDateByJS(WebDriver driver,WebElement element,String doaVal) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+doaVal+"');", element);
			
		}
		
	
			
		
	// /,

	//// System.out.println("ABCD");
	//// ((JavascriptExecutor)driver).executeScript("document.getElementById('DOB').setAttribute('value','10/02/1983')").toString();

	// System.out.println("ABCD");

	// institutesearch.click();
	//
	// UniversitySearch unisearch=new UniversitySearch();
	// unisearch.institution();

	// }

}
