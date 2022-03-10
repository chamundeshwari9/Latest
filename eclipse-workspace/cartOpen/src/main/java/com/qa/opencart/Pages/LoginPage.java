package com.qa.opencart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//declare private driver
	
	
	private WebDriver driver;

	
	//2.create the page constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//3. by locator
	
	private  By emailId = By.id("input-email");
	private By psassWord = By.id("input-password");
	private By loginBtn = By.xpath("//input[@type=\"submit\"]");
	private By registerLink = By.linkText("Register");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	
	
	
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getLoginPageUrl()
	{
		return driver.getCurrentUrl();
	}
	 public boolean isForgotPWDLinkEixst()
	 {
		 return driver.findElement(forgotPwdLink).isDisplayed();
	 }
	 
	 public boolean isRegisterLinkExists()
	 {
		 return driver.findElement(registerLink).isDisplayed();
	 }
	 
	 public void doLogin(String un,String pwd)
	 {
		 System.out.println("loginwith :"  +un+ ":" + pwd);
		 driver.findElement(emailId).sendKeys(un);
		 driver.findElement(psassWord).sendKeys(pwd);
		 driver.findElement(loginBtn).click();
	 }

}
