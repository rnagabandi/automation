package com.automation.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.page.CarTradeHomePage;
import com.automation.page.MyAccount;

public class LoginTestPlan {
	
	@DataProvider(name="testLoginData")
	Object[][] testData(){
		
		return new Object[][] { {"raghu279@gmail.com","laasya279"} /*, {"abc","123"} , {"123","456"}  , {"abc123","xyz124"} , {"ttttt","hhhhh"}*/};
		
	}
	
	@Test(groups={"login"},dataProvider="testLoginData")
	public void logintest(String userId,String password) throws Exception{
		
		WebDriver driver=null;
		
		try {
			driver = new FirefoxDriver();
			
			driver.get("http://www.cartrade.com/");
			
			/*JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,4500)", "");
			
			*/
			
			//driver.
			
			String press = Keys.chord(Keys.CONTROL,Keys.END);
			WebElement element= driver.findElement(By.id("loginshow"));
			
			element.sendKeys(press);
			
			Thread.sleep(12000);
			
			Actions action = new Actions(driver); 
			
			driver.navigate().to("http://google.com");
			
			CarTradeHomePage homePage = new CarTradeHomePage(driver);
			
			MyAccount  account =homePage.enterDetails(userId,password);
			
			System.out.println("Login successfully into Car Trade system");
			
			Set<String>  windows=driver.getWindowHandles();
			
			driver.switchTo().window("");
			Alert alert=driver.switchTo().alert();
			
			alert.accept();
			alert.dismiss();
			
			alert.sendKeys("");
			
			driver.manage().timeouts().implicitlyWait(123, TimeUnit.MILLISECONDS);
			
			WebDriverWait wait = new WebDriverWait(driver, 123);
			//wait.until(driver.findElement(By.id("")).isDisplayed());
			
		}finally{
			if (driver!=null) 
				driver.close();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		//new LoginTestPlan().logintest();
		
		
		
	}
	
}
