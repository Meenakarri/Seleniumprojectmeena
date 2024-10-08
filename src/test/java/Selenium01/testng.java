package Selenium01;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class testng {
	
	
	@Test
	
	public void test01() {
		System.out.println("testng is working");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
	}

}
