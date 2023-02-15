package org.scr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium Scroll
public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.ajio.com/");
//maximize
		driver.manage().window().maximize();
		
//To Use Javascript for ScrollDown(true)
		WebElement scrolld = driver.findElement(By.xpath("//a[text()='Collections']"));
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)",scrolld);
		
		Thread.sleep(3000);

//To Use Javascript for ScrollUp(false)
		WebElement scrollup = driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div[1]/div[7]/div/div/div/div/div/a/img"));
		executor.executeScript("arguments[0].scrollIntoView(false)",scrollup);
	}

}
