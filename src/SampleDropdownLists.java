package com.test.app;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleDropdownLists {
static WebElement element;
static boolean bool;
static List<WebElement> list;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

// Open URL in browser
driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
driver.manage().window().maximize();
Thread.sleep(2000);

element = driver.findElement(By.id("selectProductSort"));
//Instantiating Select class instance
Select select = new Select(element);


// // selectByIndex
 select.selectByIndex(3);
 Thread.sleep(3000);
//
// // selectByValue
 select.selectByValue("price:asc");
 Thread.sleep(3000);
//
// // selectByVisibleText
 select.selectByVisibleText("Price: Highest first");
 Thread.sleep(3000);


// // DeselectByIndex
 select.deselectByIndex(1);
// Exception in thread "main" java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
// at org.openqa.selenium.support.ui.Select.deselectByIndex(Select.java:244)
// at com.selenium.practice.SampleDropdownLists.main(SampleDropdownLists.java:44)

 //GetOptions
list = select.getOptions();
System.out.println("All Options : ");
System.out.println(Arrays.toString(list.toArray()));

for (int i = 0; i < list.size(); i++) {
String options = list.get(i).getText();
System.out.println(options);
}

Thread.sleep(3000);
// getFirstSelectedOption
select.selectByValue("price:asc");
System.out.println(" getFirstSelectedOption : " + select.getFirstSelectedOption());

Thread.sleep(3000);
// getAllSelectedOptions
System.out.println(" getAllSelectedOptions ");

list = select.getAllSelectedOptions();
System.out.println(Arrays.toString(list.toArray()));

for (int i = 0; i < list.size(); i++) {
String options = list.get(i).getText();
System.out.println(options);
}

Thread.sleep(3000);

// Close the browser
driver.close();
}
}
