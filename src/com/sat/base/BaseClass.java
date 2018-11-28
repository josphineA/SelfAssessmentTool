package com.sat.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.excel.utility.Xls_Reader;

public class BaseClass {

	public static WebDriver driver;
	public WebDriverWait wait;
	public static Xls_Reader reader;
	public static Properties prop;
	
	public static WebDriver getDriver() {
		return driver;
	}
		
	public static Xls_Reader getReader() {
		return reader;
	}
	
	public BaseClass() {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Eclipse\\workspace\\SelfAssessmentTool2\\src\\com\\sat\\config\\config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	 public static void driverInitialization() {

		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--start-maximized");
		  options.addArguments("--disable-notifications");		          
		  driver = new ChromeDriver(options);	
		  //  wait = new WebDriverWait(driver, 15);
		  reader= new Xls_Reader("C:\\Eclipse\\workspace\\SelfAssessmentTool2\\src\\com\\excel\\testdata\\SATData.xlsx");
//		  driver.get(prop.getProperty("homepageurl"));
	  }
}
