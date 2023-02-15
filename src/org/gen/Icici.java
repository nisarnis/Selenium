package org.gen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Day2 task q-4
public class Icici {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\SeleniumDay2Task\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp\r\n");
	WebElement txtusername = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
	txtusername.sendKeys("nisar");
	WebElement txtmob = driver.findElement(By.xpath("//input[@class='mode-select-mobile']"));
	txtmob.sendKeys("9876543210");	
	  WebElement btnContinue = driver.findElement(By.id("user-id-goahead"));
	  btnContinue.click();
	
	}

}
