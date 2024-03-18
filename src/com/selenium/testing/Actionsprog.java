package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsprog {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\eclipse-workspace\\firstapp\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	 driver.get("https://www.gmail.com");

	WebElement un  = driver.findElement(By.id("identifierId"));
	un.sendKeys("abdulkadar@gmail.comabdulkadar@gmail.com");
	
	Actions actions = new Actions(driver);
	// actions.sendKeys(un,"abdulkadar@gmail.com").build().perform();
	
	actions.click(un).sendKeys("abdulkadar@gmail.com").build().perform();
	
	WebElement nxt  = driver.findElement(By.id("identifierNext"));
      // nxt.click();

	//actions.click(nxt).build().perform();
	
	// actions.click(nxt).perform();
	
	// actions.doubleClick(nxt).perform();	
	
	actions.sendKeys(nxt,Keys.ENTER).perform();
	driver.get("https://www.amazon.in/");
WebElement country = driver.findElement(By.xpath("//span[@class='<span class=\"icp-nav-flag icp-nav-flag-in icp-nav-flag-lop\"></span>}'/following-sibling::div"));
	actions.moveToElement(country).build().perform();
	
String txt = country.getText();
System.out.println("country txt is: "+txt);



Thread.sleep(5000);
driver.close();
	
	

	
	
	
	
}
}
