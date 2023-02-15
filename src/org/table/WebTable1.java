package org.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Locate the table
		WebElement table = driver.findElement(By.id("customers"));
		//To get the row count 
		List<WebElement> rowcount = table.findElements(By.tagName("tr"));
		System.out.println(rowcount.size());
		//to get the heading count
		List<WebElement> headingcount = table.findElements(By.tagName("th"));
		System.out.println(headingcount.size());
		//To get the tabledata count
		List<WebElement> testdatacount = table.findElements(By.tagName("td"));
		System.out.println(testdatacount.size());
		//Iterate all the rows
		for (int i = 0; i < rowcount.size(); i++) {
			System.out.println(rowcount.get(i).getText());
		//Iterate all the testdata
			for (int j = 0; j < testdatacount.size(); j++) {
				System.out.println(testdatacount.get(j).getText());
				
			}
			System.out.println("==============");
			System.out.println(testdatacount.get(5).getText());
		}
	}
}
