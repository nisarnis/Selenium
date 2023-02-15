package org.fra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium (Frames)
public class Frames {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	//driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	driver.manage().window().maximize();
	List<WebElement> frame = driver.findElements(By.tagName("iframe"));
    int size = frame.size();
    System.out.println(size);
    WebElement findElement = driver.findElement(By.id("DUMMY1"));
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
