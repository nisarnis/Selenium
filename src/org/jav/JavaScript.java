package org.jav;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//JavaScriptExecutor
public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.instagram.com/accounts/login/");
//To 
	WebElement txtuser = driver.findElement(By.name("username"));
	Thread.sleep(3000);
//To Use JavaScriptExecutor
//Type Cast
	JavascriptExecutor executor=(JavascriptExecutor) driver;
//To insert the value by javascript
	executor.executeScript("arguments[0].setAttribute('value','Nisar')",txtuser);
//To print the value by javascript
	Object printtxt = executor.executeScript("return arguments[0].getAttribute('value')",txtuser);
	System.out.println(printtxt);
//To insert the value
	WebElement txtpass = driver.findElement(By.name("password"));
	executor.executeScript("arguments[0].setAttribute('value','1233')",txtpass);
	Object printpass = executor.executeScript("return arguments[0].getAttribute('value')",txtpass);
	System.out.println(printpass);

	
	
	
	
	
	
	
	
	
	
	}

}
