package com.qa.opencart.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.util.Constants;



public class LoginPageTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void loginPageTitleTest()
	{
		String actTitle = loginaPage.getLoginPageTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, Constants.LOGIN_PAGE_TITLE);
	}
	@Test(priority = 2)
	public void loginPageUrlTest()
	{
		String actUrl = loginaPage.getLoginPageUrl();
		System.out.println(actUrl);
		Assert.assertTrue(actUrl.contains(Constants.LOGIN_PAGE_URL_FRACTION));
	}
	@Test(priority = 3)
	public void forgotPwdLinkTest()
	{
		Assert.assertTrue(loginaPage.isForgotPWDLinkEixst());
	}
	@Test(priority = 4)
	public void registerLinkTest()
	{
		Assert.assertTrue(loginaPage.isRegisterLinkExists());
	}
	
	@Test(priority = 5)
	public void loginTest()
	{
		loginaPage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());
	}

}
