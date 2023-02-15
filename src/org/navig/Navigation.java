package org.navig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Day 20 (Selenium navigation)
public class Navigation {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com/");
	driver.manage().window().maximize();
      driver.navigate().refresh();
      driver.navigate().forward();
      driver.close();
	}

}
