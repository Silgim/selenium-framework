package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin() {
		LoginPage login=new LoginPage(driver);
		
		login.enterUserNameText("admin@yourstore.com");
		login.enterPasswordText("admin");
		login.clickLogin();
		System.out.println("Page entered is :"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Just a moment...");
		
	}

}

