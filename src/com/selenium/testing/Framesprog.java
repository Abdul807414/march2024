package com.selenium.testing;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Framesprog {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\eclipse-workspace\\firstapp\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.jqueryui.com");
		
		driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
  
		driver.findElement(By.id("tags")).sendKeys("java");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
System.out.println("Noof frames are :"+frames.size());
// driver.switchTo().frame(0);
WebElement ele = driver.findElement(By.className("demo-frame"));
driver.switchTo().frame(ele);
driver.findElement(By.id("tags")).sendKeys("java");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Draggable")).click();


driver.switchTo().frame(0);
WebElement draggable = driver.findElement(By.id("draggable"));
Actions actions = new Actions(driver);
actions.dragAndDropBy(draggable, 150, 150).build().perform();

driver.switchTo().defaultContent();
driver.findElement(By.linkText("Droppable")).click();


driver.switchTo().frame(0);

WebElement draggable2 = driver.findElement(By.id("draggable"));
WebElement droppable2 = driver.findElement(By.id("droppable"));
actions.dragAndDrop(draggable2, droppable2).build().perform();

driver.switchTo().defaultContent();

WebElement activeEle = driver.switchTo().activeElement();
System.out.println("Active element is:" +activeEle);



		Thread.sleep(5000);
		driver.close();
	}
}