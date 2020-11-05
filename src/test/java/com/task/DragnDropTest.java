package com.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragnDropTest {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://Users//shubh//Downloads//chromedriver_win32//chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("http://localhost:7080/drag_and_drop");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
	
	@Test
	public void DragnDrop() {
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(source).moveToElement(target).release(target).build().perform();
		//action.dragAndDrop(source, target).release(target).build().perform();
		
		
	}
	
	
	
	
	

}
