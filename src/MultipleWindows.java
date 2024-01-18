package com.test.app;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
static WebElement element;
static boolean bool;
static String text;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");

driver.get("https://demo.automationtesting.in/Windows.html");
driver.manage().window().maximize();

// Multiple Windows Handling
element = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")); 
String mainWindowHandle = driver.getWindowHandle();
System.out.println(mainWindowHandle);
element.click();
Thread.sleep(3000);

// Get handles of the windows
Set<String> allWindowHandles = driver.getWindowHandles();
System.out.println(allWindowHandles);
Iterator<String> iterator = allWindowHandles.iterator();
System.out.println(allWindowHandles.size());


// Check if child window has other child windows and will fetch the text from
// the child window
for(String handle : allWindowHandles) {	
	System.out.println(handle);
if (!mainWindowHandle.equalsIgnoreCase(handle)) {
driver.switchTo().window(handle);
WebElement text = driver.findElement(By.id("navbarDropdown")); 
text.click();
System.out.println("Heading of child window is --->>>>    " + text.getText());
Thread.sleep(3000);
}
}
driver.close();

driver.switchTo().window(mainWindowHandle);
Thread.sleep(3000);
element = driver.findElement(By.className("analystic"));
Thread.sleep(2000);
element.click();
//Thread.sleep(3000);
driver.quit();
}
}

