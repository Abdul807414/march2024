package com.selenium.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsProg {


public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().deleteAllCookies();

driver.get("https://www.gmail.com");

     String cururl = driver.getCurrentUrl();
System.out.println("Current url is :" + cururl);
  String title = driver.getTitle();

  String window = driver.getWindowHandle();
 Set<String> wind = driver.getWindowHandles();

WebElement userName = driver.findElement(By.id("identifierId"));

 userName.clear();
 userName.sendKeys("abdul78@gmail.com");

WebElement nxt = driver.findElement(By.id("identifierNext"));
nxt.click();

Thread.sleep(5000);

driver.close();








}
}
