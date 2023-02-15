package org.gen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class General {
public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
          WebDriver driver =new ChromeDriver();
//To load the url
		driver.get("https://www.youtube.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
//To maximize
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
//To Close
	driver.quit();
				
}
}
