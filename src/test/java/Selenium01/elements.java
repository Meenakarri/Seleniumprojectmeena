package Selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class elements {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		
	/*	driver.get("https://demoqa.com/checkbox");
		
		driver.manage().window().maximize();
		
		//checkbox
		
		WebElement chckbox = driver.findElement(By.xpath("//span[@class ='rct-title']"));
		
		chckbox.click();
		
		//radio

		driver.get("https://demoqa.com/radio-button");
		
		driver.manage().window().maximize();
		
		WebElement radiobox = driver.findElement(By.xpath("//label[@for ='yesRadio']"));
		
		radiobox.click(); */
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		
	WebElement dbl=	driver.findElement(By.xpath("//button[@id ='doubleClickBtn']"));
	
	
	WebElement rbl=	driver.findElement(By.xpath("//button[@id ='rightClickBtn']"));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(dbl);
		
		action.contextClick(rbl);
		
		action.perform();
		
		//driver.quit();
		
		
		
	}

}
