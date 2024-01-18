package com.test.app;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;

public class CheckBoxAndRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		WebElement element;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        element=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        element.click();
        
        if(element.isEnabled())
        	System.out.println("Is Enabled");
        else
        	System.out.println("Not Enabled");
        
        Thread.sleep(2000);
        
        if(element.isSelected())
        	System.out.println("Is selected");
        else
        	System.out.println("Not Selected");
        
        Thread.sleep(2000);
        
        if(element.isDisplayed())
        	System.out.println("Is Displayed");
        else
        	System.out.println("Not Displayed");  
        
        Thread.sleep(2000);
        
        element=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
        
        if(element.isEnabled())
            System.out.println("Female is enabled");
        else
        	System.out.println("Female is not enabled");
        
        Thread.sleep(2000);
        
        driver.close();
	}

}
