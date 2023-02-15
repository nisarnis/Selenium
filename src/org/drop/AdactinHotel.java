package org.drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Selenium DropDown
public class AdactinHotel {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
//click
	//WebElement btnregister = driver.findElement(By.xpath("(//td[@align='center'])[1]"));
	//btnregister.click();
	WebElement txtuser = driver.findElement(By.id("username"));
	txtuser.sendKeys("Nisarfathima03");
	WebElement txtpass = driver.findElement(By.id("password"));
	txtpass.sendKeys("nisarnijar");
	WebElement btnclck = driver.findElement(By.id("login"));
	btnclck.click();
	WebElement dd1 = driver.findElement(By.id("location"));
	Select select=new Select(dd1);
    select.selectByVisibleText("Melbourne");
    WebElement dd2 = driver.findElement(By.id("hotels"));
    Select sel=new Select(dd2);
	sel.selectByIndex(2);
	WebElement dd = driver.findElement(By.id("room_type"));
	Select e=new Select(dd);
	e.selectByValue("Deluxe");
	WebElement dd3 = driver.findElement(By.id("room_nos"));
	Select w=new Select(dd3);
	w.selectByValue("2");
	WebElement dd4 = driver.findElement(By.id("adult_room"));
		Select ww=new Select(dd3);
		ww.selectByVisibleText("2 - Two");
	WebElement btncl = driver.findElement(By.id("Submit"));
		btncl.click();
	WebElement btnclick = driver.findElement(By.id("radiobutton_0"));
	   btnclick.click();
	  WebElement btn = driver.findElement(By.id("continue"));
	btn.click();
	WebElement txtfirst = driver.findElement(By.id("first_name"));
	txtfirst.sendKeys("sita");
	WebElement txtlast = driver.findElement(By.id("last_name"));
	txtlast.sendKeys("lakshmi");
	WebElement txtbill = driver.findElement(By.id("address"));
	txtbill.sendKeys("22,London");
	WebElement txtcc = driver.findElement(By.id("cc_num"));
	txtcc.sendKeys("9876054654321589");
	WebElement ddown = driver.findElement(By.id("cc_type"));
	Select selec=new Select(ddown);
	selec.selectByIndex(1);
	WebElement dropd = driver.findElement(By.id("cc_exp_month"));
	Select se=new Select(dropd);
	se.selectByValue("3");
	WebElement dropdo = driver.findElement(By.id("cc_exp_year"));
	Select ed=new Select(dropdo);
	ed.selectByVisibleText("2016");
	WebElement drd = driver.findElement(By.id("cc_cvv"));
	drd.sendKeys("321");
	WebElement btncll = driver.findElement(By.id("book_now"));
	btncll.click();
	Thread.sleep(3000);
	WebElement txtbookno = driver.findElement(By.id("order_no"));
	String text = txtbookno.getAttribute("value");
	System.out.println(text);
	
	}

}
