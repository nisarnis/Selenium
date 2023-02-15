package org.table;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WebTable Selenium
public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	//driver.get("https://www.facebook.com/");
	//driver.navigate().to("https://wwww.techlistic.com/p/demo-selenium-practice.html");

	}

}
