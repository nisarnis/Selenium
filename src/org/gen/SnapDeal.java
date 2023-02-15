package org.gen;
//Day2(q-7)Selenium Task
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login\r\n");
		Thread.sleep(2000);
		WebElement txtemail = driver.findElement(By.id("userName"));
		txtemail.sendKeys("Greens@18339");
	}

}
