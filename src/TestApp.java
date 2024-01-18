package com.test.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApp {

	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	    WebElement element;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://testingcareerpathacademy.netlify.app/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
