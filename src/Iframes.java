package com.test.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;
static int count;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");


driver.get("https://www.quackit.com/html/examples/frames/");
driver.manage().window().maximize();

Thread.sleep(5000);

// Frames Handling
count = driver.findElements(By.tagName("iframe")).size();
System.out.println(count);

//Switching to frame by ID
//driver.switchTo().frame("aswift_2");

// // Switching to frame by ID
//driver.switchTo().frame("aswift_0");

// //Switching to frame by index(Not recommended unless only one frame is present)
// driver.switchTo().frame(2);

// Switch to frame by Web element
 WebElement element = driver.findElement(By.xpath("//*[@id=\"aswift_0\"]")); 
 driver.switchTo().frame(element);

// Get title of Frame / Page
System.out.println(driver.getTitle());
Thread.sleep(3000);

// Switch back to main frame
driver.switchTo().defaultContent();

// Click on Home button in Main Frame
driver.findElement(By.xpath("//iframe[@id='aswift_2']")).click();
Thread.sleep(10000);

// Nested Frames sample
driver.get("https://the-internet.herokuapp.com/frames");
Thread.sleep(3000);

// identify element and click
driver.findElement(By.partialLinkText("Nested")).click();


// switching to frame with frame name
driver.switchTo().frame("frame-bottom");
WebElement m = driver.findElement(By.xpath("/html/body"));  
Thread.sleep(3000);
System.out.println("Frame text: " + m.getText());

// Close the browser
driver.close();
}
}