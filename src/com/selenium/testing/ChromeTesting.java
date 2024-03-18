fpackage com.selenium.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTesting {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\eclipse-workspace\\firstapp\\Drivers\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdul\\eclipse-workspace\\firstapp\\Drivers\\geckodriver.exe");
 
	WebDriver driver = new ChromeDriver();
	
	
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	driver.get("https://www.gmail.com");
	String cururl = driver.getCurrentUrl();
	System.out.println("Current Url is:" + cururl);
	
	String title = driver.getTitle();
	System.out.println("title name is :"+title);
	
	String curWinName = driver.getWindowHandle();
	System.out.println("current window name is :"+curWinName);
	
	Set<String> windows = driver.getWindowHandles();
	System.out.println("All window are :" + windows);
	
	 //identify the element
	WebElement userName = driver.findElement(By.id("identifierId"));
	
	
	//perform the action
	userName.clear();
	userName.sendKeys("abdulkadar99@gmail.com");
	
	  //identify the element
		// WebElement nxt=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
	
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	
	
		nxt.click();
	Thread.sleep(5000);
	
	driver.close();
}
}
