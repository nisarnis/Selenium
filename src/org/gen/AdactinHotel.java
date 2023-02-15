package org.gen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Day2 selenium Task (q-10)
public class AdactinHotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver s=new ChromeDriver();
		s.get("https://adactinhotelapp.com/");
		WebElement txtusername = s.findElement(By.id("username"));
		txtusername.sendKeys("Nisar");
		WebElement txtpass = s.findElement(By.id("password"));
		txtpass.sendKeys("163883333333");
		
		
		
		
		
	}

}
