package org.gen;
//Day-2 selenium task (q-8)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver j=new ChromeDriver();
	j.get("https://www.instagram.com/accounts/login/?hl=en) login page");
//to insert value
	Thread.sleep(2000);
WebElement txtusername = j.findElement(By.name("username"));
    txtusername.sendKeys("Nisar");
WebElement txtpassword = j.findElement(By.name("password"));
	txtpassword.sendKeys("232432");
	
}
}
