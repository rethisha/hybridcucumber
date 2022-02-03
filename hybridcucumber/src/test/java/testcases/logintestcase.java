package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.libraryclass;
import pages.loginpage;
import seleniumreusuablefunction.seleniumutilities;

public class logintestcase extends libraryclass {
	seleniumutilities selenium;
	loginpage lp;
	@BeforeMethod
	public void openapp()
	{
		launchapp("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void login()
	{
		 lp=new loginpage(driver);
		lp.login("Admin","admin123");
	}
	
	@AfterMethod
	public void teardown() throws IOException
	{
	selenium=new seleniumutilities(driver);
	 selenium.screenshot("C:\\Users\\rethisha\\git\\hybridcucumber\\hybridcucumber\\src\\test\\resources\\screenshots\\Login.png");
	}
}
