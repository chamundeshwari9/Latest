package com.qa.opencart.Test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.Factory.DriverFactory;
import com.qa.opencart.Pages.LoginPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	LoginPage loginaPage;
	Properties prop;
	@BeforeTest
	public void setUp() throws IOException
	{
		df = new DriverFactory();
		df.init_prop();
		df.init_driver(prop);
		loginaPage = new LoginPage(driver);
	}
@AfterTest
public void tearDown()
{
	driver.quit();
}
}
