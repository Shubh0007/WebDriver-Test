package com.task;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContextMenu {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://Users//shubh//Downloads//chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("http://localhost:7080/context_menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
        
		}
	
	@Test
	public void test() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement box = driver.findElement(By.id("hot-spot"));
		action.contextClick(box).build().perform();
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
