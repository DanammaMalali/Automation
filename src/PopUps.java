package com.test.app;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUps {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub

			WebDriver driver=new ChromeDriver();
			WebElement element;
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			
			
			element=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
			element.click();
			Alert alert;
			alert=driver.switchTo().alert();
			alert.accept();
			Thread.sleep(3000);
			
			
			element=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
			element.click();
			alert=driver.switchTo().alert();
			alert.dismiss();
			Thread.sleep(3000);
			
			
			element=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
			element.click();
			alert=driver.switchTo().alert();
			alert.sendKeys("Hi Alerts");
			alert.accept();
		    Thread.sleep(3000);
		    
		    
			driver.close();
			
		}

}
