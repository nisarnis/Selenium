package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

		WebElement btnclk = driver.findElement(By.xpath("//input[@title='Sign in']"));
		btnclk.click();
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		// al.dismiss();
		al.accept();

		// al.sendKeys("yes");

	}

}
