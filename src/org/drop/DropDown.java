package org.drop;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Selenium(DropDown)
public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html\r\n");
WebElement dropd = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
Thread.sleep(3000);
Select select=new Select(dropd);
List<WebElement> options = select.getOptions();
for (int i = 0; i <options.size(); i=i+1) {
	String txt = options.get(i).getAttribute("value");
	System.out.println(txt);
}
	}

}
