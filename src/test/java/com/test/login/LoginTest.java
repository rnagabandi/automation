package com.test.login;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginTest {

	public static void main(String[] args) throws Exception{
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.id("gbqfq")).sendKeys("test");
		
		driver.findElement(By.id("gbqfsa")).click();
		
		Thread.sleep(3500);
		
	}
	
	
}
