package com.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginSuccess {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://Users//shubh//Downloads//chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("http://localhost:7080/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
	@Test(priority =1)
	public void Usrname() {
	driver.findElement(By.name("username")).sendKeys("tomsmith");
	System.out.println("entering username successfully");
	
	
	}
	
	@Test(priority=2)
	public void pwd() throws InterruptedException {
	driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	System.out.println("entering password successfully");
	
	Thread.sleep(5000);
	}
	
	@Test(priority=3)
	public void doLogin() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
	System.out.println("click on login");
	Thread.sleep(2000);
	}
		/*
		 * added new comment		
		 */
	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
