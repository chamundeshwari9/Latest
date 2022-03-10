package com.qa.opencart.Factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public Properties prop;
/**
 * THis method is used to initialize the WebDriver
 * @param browserName
 * @return the driver
 */
	public WebDriver init_driver( Properties prop)
	{
		String browserName = prop.getProperty("browser").trim();
		System.out.println("browser name is : "+browserName);
		if (browserName.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if (browserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please pass the right browser :" + browserName);
		}
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.get(prop.getProperty("url"));
		return driver;
	}
	public Properties init_prop() throws IOException
	{
		prop= new Properties();
		
		try {
			
		FileInputStream ip = new FileInputStream(" test");
		prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
