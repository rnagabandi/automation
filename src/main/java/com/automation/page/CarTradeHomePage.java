package com.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarTradeHomePage {
	
	private final WebDriver driver;
	
	public CarTradeHomePage(WebDriver driver) {
		
		this.driver = driver;
		
		
		
	}
	
	By loginLocator = By.id("loginshow");
	By userIdLocator = By.id("username");
	By passwordLocator = By.id("password");
	By submitLocator= By.className("loginBtn");
	
	public MyAccount enterDetails(String userName,String password){
		
		this.driver.findElement(loginLocator).click();
		this.driver.findElement(userIdLocator).sendKeys(userName);
		this.driver.findElement(passwordLocator).sendKeys(password);
		this.driver.findElement(submitLocator).submit();
		
		return new MyAccount(this.driver);
	}
	
	public CarTradeHomePage enterInvalidDetails(String userName , String password){
		
		this.driver.findElement(loginLocator).click();
		this.driver.findElement(userIdLocator).sendKeys(userName);
		this.driver.findElement(passwordLocator).sendKeys(password);
		this.driver.findElement(submitLocator).submit();
		
		return new CarTradeHomePage(this.driver);
		
	}
	

}
