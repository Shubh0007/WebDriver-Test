package com.task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckandUncheck {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://Users//shubh//Downloads//chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("http://localhost:7080/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
	@Test
	public void Check() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println("checkbox1 will be checked successfully");
		Thread.sleep(4000);
		
	}
	
	@Test
	public void Uncheck() {
	WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
	checkbox.click();
		
	}
	 
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
			
		
	
	


