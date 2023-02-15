package org.gen;
//Day2(q-3)Selenium
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\SeleniumDay2Task\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/\r\n");
WebElement txtgooglesearch = driver.findElement(By.name("q"));
	txtgooglesearch.sendKeys("GreensTechnology");
	
	}
}