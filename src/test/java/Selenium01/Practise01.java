package Selenium01;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/login/");	
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("testuser");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		/*if (title.equals(""))
		
			System.out.println("pass");
		
		else*/
		//System.out.println("fail");
		
		System.out.println(driver.getTitle());
		
		WebElement ele= driver.findElement(By.xpath("//button[text()='Log out']")) ;
		if(ele.isDisplayed()) {
		System.out.println("logout is visible" + ele.getText());
		
		
		}
		else
			System.out.println("button not visible");
		
		ele.click();
		

	}


	
}
