package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeTest // this will only run once before the test 
	public void createDBconn() {
		System.out.println("creating DB Connection");
	}
	@AfterTest  // this will only run once after the test
	public void closeDBConn() {
		System.out.println("closing DB connection");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("closing the browser");
	}
	
	@Test(priority=2,groups="functional" )
	public void loginapp() {
		System.out.println("Login into app");
	}
	
	@Test(priority = 1, groups="functional")
	public void doUserReg() {
		System.out.println("Executing User registration");
	}
	

}
