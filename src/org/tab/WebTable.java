package org.tab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WebTable Day-17
public class WebTable {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
    WebElement tab = driver.findElement(By.id("customers"));
//To get the row count in the table
    List<WebElement> rowcount = tab.findElements(By.tagName("tr"));
    int size = rowcount.size();
    System.out.println(size);
//To get the heading count in the table
    List<WebElement> headingcount = tab.findElements(By.tagName("th"));
    int size2 = headingcount.size();
    System.out.println(size2);
//To get the testdata count in the table
    List<WebElement> testdatacount = tab.findElements(By.tagName("td"));
    int size3 = testdatacount.size();
    System.out.println(size3);
//Iterate all the rows in the table
    for (int i = 0; i <rowcount.size(); i++) {
	WebElement element = rowcount.get(i);
	System.out.println(element.getText());
	}
//To print a particular row
    String text = rowcount.get(3).getText();
    System.out.println(text);
    System.out.println("=====================");
//To get the testdata count in the table
    List<WebElement> testdata = tab.findElements(By.tagName("td"));
    int size4 = testdata.size();
    System.out.println(size4);
//To get the Tabledata print like one by one
   for (int i = 0; i <testdata.size(); i++) {
	String text2 = testdata.get(i).getText();
	System.out.println(text2);
   }
   System.out.println("====================");
//To print the specific index of the row
	List<WebElement> row = tab.findElements(By.tagName("tr"));
	WebElement webElement = row.get(2);
	System.out.println(webElement.getText());
//To print the specific index of the testdata
	System.out.println("====================");
	List<WebElement> testdatas = tab.findElements(By.tagName("td"));
	String attribute = testdatas.get(4).getText();
	System.out.println(attribute);
	System.out.println("==================");
	}
}
