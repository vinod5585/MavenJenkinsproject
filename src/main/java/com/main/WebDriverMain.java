package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverMain {
	
	
	@Test
	public void main() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).sendKeys("hello");
		
		
	}

}
