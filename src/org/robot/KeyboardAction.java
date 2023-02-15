package org.robot;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

//Selenium(Robot class-keyboard Action)
public class KeyboardAction {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium Keyboard Action\\driver\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
 //  driver.manage().window().maximize();
  // WebElement txtusername = driver.findElement(By.id("email"));
   Robot robot=new Robot();
//Username
   robot.keyPress(KeyEvent.VK_SHIFT);
   
   robot.keyPress(KeyEvent.VK_N);
   robot.keyRelease(KeyEvent.VK_N);
   robot.keyPress(KeyEvent.VK_I);
   robot.keyRelease(KeyEvent.VK_I);
   robot.keyPress(KeyEvent.VK_S);
   robot.keyRelease(KeyEvent.VK_S);
   robot.keyPress(KeyEvent.VK_A);
   robot.keyRelease(KeyEvent.VK_A);
   robot.keyPress(KeyEvent.VK_R);
   robot.keyRelease(KeyEvent.VK_R);
   robot.keyRelease(KeyEvent.VK_SHIFT);
   robot.keyPress(KeyEvent.VK_TAB);
   
//password  
  robot.keyRelease(KeyEvent.VK_TAB);
  robot.keyPress(KeyEvent.VK_N);
  robot.keyRelease(KeyEvent.VK_N);
  robot.keyPress(KeyEvent.VK_I);
  robot.keyRelease(KeyEvent.VK_I);
  
 // Actions actions=new Actions(driver);
 // actions.keyDown();
  
//Enter
//  robot.keyPress(KeyEvent.VK_TAB);
 // robot.keyRelease(KeyEvent.VK_TAB);
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);

  
  
  
  
  
  
   
   
   
   
   
   
	
	
	
	
	}

}
