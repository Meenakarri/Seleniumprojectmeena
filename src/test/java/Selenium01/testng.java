package Selenium01;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Timeouts;


public class testng {
	
	
	@Test
	
	public void test01() throws InterruptedException {
		System.out.println("testng is working");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().wait(300);
		
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		
		driver.switchTo().alert().accept();
		
	}

}
