package com.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {

	private WebDriver driver;
	
	public MyAccount(WebDriver driver) {
		
		this.driver=driver;
				
		if (!this.driver.getTitle().contains("My Account")) {
			throw new IllegalStateException("This is not the login page");
		}
	}
	
	By myAccount = By.linkText("My Account");
	
	
}
