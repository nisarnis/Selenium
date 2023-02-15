package org.gen;
//Day2(q-1)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\SeleniumDay2Task\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
//GetTitle-To fetch the title of the webpage
			String title = driver.getTitle();
			System.out.println(title);
//GetCurrenturl-To fetch the currenturl of the Webpage
			String url = driver.getCurrentUrl();
			System.out.println(url);
//FindElement-
			WebElement txtUsername = driver.findElement(By.id("email"));
//Sendkeys-to insert the value
				txtUsername.sendKeys("Greens tech");
				WebElement txtPassword = driver.findElement(By.id("pass"));
					txtPassword.sendKeys("Greens@1223");
	}

}
