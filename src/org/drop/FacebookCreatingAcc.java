package org.drop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class FacebookCreatingAcc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[text()='Create new account']"));
		act.moveToElement(move).perform();
		move.click();
		// act.contextClick(move).perform();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement datedd = driver.findElement(By.id("day"));
		Select sel = new Select(datedd);
		sel.selectByIndex(26);
		List<WebElement> dateall = sel.getOptions();
		for (int i = 0; i < dateall.size(); i++) {
			System.out.println(dateall.get(i).getText());
		}
		WebElement monthdd = driver.findElement(By.id("month"));
		/*act.moveToElement(monthdd).perform();
		monthdd.click();*/
		Select s=new Select( monthdd);
		s.selectByVisibleText("Mar");
		List<WebElement> alloptions = s.getOptions();
		for (int i = 0; i < alloptions.size(); i++) {
			System.out.println(alloptions.get(i).getText());
		}
	
		WebElement radioclk = driver.findElement(By.id("u_9_4_QI"));
		radioclk.click();
		//To maximize
				driver.manage().window().minimize();
		
		
	}

}
