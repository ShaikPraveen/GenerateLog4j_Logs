package com.freecrm;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCRMTest 
{
	static WebDriver driver;
	Logger log=Logger.getLogger(FreeCRMTest.class);
 
	@BeforeMethod
 	public void setUp()
	{
		driver=new FirefoxDriver();
		log.info("CHROME BROWSER LAUNCHED");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");	
		log.warn("NAVIGATE TO URL");
		log.fatal("THIS IS FATAL");
		log.debug("THIS IS BEBUG");
		
	}
	
	@Test
	public void pass()
	{
		
		log.info("------------------STARTED TESTCAES----------------");
		Assert.assertEquals(driver.getTitle(), "#1 Free CRM software in the cloud for sales and service");
	    log.info("------------------VERIFIED TITLE-----------------");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		log.info("---------------BROWSER CLOSED---------------------");
	}

}
