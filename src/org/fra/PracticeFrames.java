package org.fra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Frames 13/2/2023
public class PracticeFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		int size = totalframe.size();
		System.out.println(size);
		
	//switching the control to frame 
		driver.switchTo().frame(0);
		WebElement txtbox = driver.findElement(By.tagName("input"));
		txtbox.sendKeys("Aalim");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//Switching the control to inner frame
		driver.switchTo().frame("frame3");
		WebElement chk = driver.findElement(By.id("a"));
		chk.click();
    //switching the control to webpage
		driver.switchTo().defaultContent();
		WebElement frame = driver.findElement(By.xpath("iframe[@id='frame2']"));
		driver.switchTo().frame(frame);
		WebElement element = driver.findElement(By.id("animals"));
		element.sendKeys("big baby cat");
	//Switching the control to parent frame
		driver.switchTo().parentFrame();
		txtbox.clear();
		txtbox.sendKeys("Nisar");

	}

}
