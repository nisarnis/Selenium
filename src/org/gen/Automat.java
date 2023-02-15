package org.gen;
//Day-2(q-9)Selenium
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automat {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Home\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
	WebDriver t=new ChromeDriver();
	t.get("https://www.copado.com/\r\n");
	WebElement gg = t.findElement(By.id("141:0"));
	
	
	
	
	
}
}
