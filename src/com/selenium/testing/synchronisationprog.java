package com.selenium.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchronisationprog {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\eclipse-workspace\\firstapp\\Drivers\\chromedriver.exe");
	 
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		 driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("abdulkadar@gmail");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("passwd")).sendKeys("hardwork");
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}
}
