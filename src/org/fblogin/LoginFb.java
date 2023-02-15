package org.fblogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.Timeout;

public class LoginFb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//username
		WebElement username = driver.findElement(By.name("username"));
		js.executeScript("arguments[0].setAttribute('value','nisar')",username);
		
		
		
		WebElement passwrd = driver.findElement(By.name("password"));
		passwrd.sendKeys("hkehdfe");
		WebElement btnclick = driver.findElement(By.xpath("//div[text()='Log in']"));
		js.executeScript("arguments[0].click()", btnclick);
		
		Object name = js.executeScript("returnarguments[0].getAttribute('value')", username);
		System.out.println(name);
		
		
	}

}
