package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeTesting3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\eclipse-workspace\\firstapp\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");


		//identify the element
		//WebElement userName = driver.findElement(By.ById.id("identifierId"));
		WebElement userName  = driver.findElementById("identifierId");

		//perform the action
		userName.clear();
		userName.sendKeys("abdulkadar99@gmail.com");

		 //identify the element
			// WebElement nxt=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));

		//WebElement nxt = driver.findElement(By.ById.id("identifierNext"));
		WebElement nxt = driver.findElementById("identifierNext");

			nxt.click();

		Thread.sleep(5000);
		driver.close();
		}
		}
