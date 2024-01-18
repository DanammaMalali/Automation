package com.test.app;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	    WebElement element;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		element=driver.findElement(By.linkText("Gmail"));
		element.click();
		
		
		element=driver.findElement(By.linkText("Sign in"));
		element.click();
		
		
		element=driver.findElement(By.tagName("input"));
		element.click();
		element.sendKeys("danumalali28@gmail.com");
		
		
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		
		
		element=driver.findElement(By.linkText("Sign in"));
		String url=element.getAttribute("href");
		URL urlconnection=new URL(url);
		HttpURLConnection connection= (HttpURLConnection) urlconnection.openConnection();
		connection.setConnectTimeout(5000);
		connection.connect();
		if(connection.getResponseCode()>=400)
		{
			System.out.println("Broken link");
		}
		else
			System.out.println("Not broken link");
		driver.close();
	}

}
