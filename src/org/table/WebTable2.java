package org.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//To fetch the particular data
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> data = table.findElements(By.tagName("td"));
		System.out.println(data.get(7).getText());
		System.out.println(data.get(1).getText());
//To fetch the particular row
		List<WebElement> heading = driver.findElements(By.tagName("tr"));
		System.out.println(heading.get(0).getText());
//To fetch all the data
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).getText());
			
		}
	System.out.println("==============");	
		List<WebElement> heads = driver.findElements(By.tagName("th"));
		System.out.println(heads.size());
		System.out.println(heads.get(1).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
