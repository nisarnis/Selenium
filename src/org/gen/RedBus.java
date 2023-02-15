package org.gen;
import org.openqa.selenium.By;
//Day2 Selenium Task
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Day2 q-2
public class RedBus {
		public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\SeleniumDay2Task\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://m.redbus.in/");
WebElement txtfrom = driver.findElement(By.id("src"));
txtfrom.sendKeys("chennai");
WebElement txtTo = driver.findElement(By.id("dest"));
txtTo.sendKeys("Trichy");
WebElement txtDate = driver.findElement(By.id("onward_cal"));
txtDate.sendKeys("28/10/22");
		
		}
}