package com.test.app;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
static WebDriver driver;
static WebElement element;
static boolean bool;
static WebDriverWait wait;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");
driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);



// Explicit wait of 5seconds
wait = new WebDriverWait(driver, Duration.ofSeconds(10));


element=driver.findElement(By.xpath("//*[@id='alert']"));
wait.until(ExpectedConditions.visibilityOfAllElements(element));
element.click();
Thread.sleep(3000);
Alert alert=wait.until(ExpectedConditions.alertIsPresent());
alert.accept();


element=driver.findElement(By.xpath("//*[@id=\"populate-text\"]"));
wait.until(ExpectedConditions.visibilityOfAllElements(element));
element.click();
Thread.sleep(3000);


element=driver.findElement(By.xpath("//*[@id=\"display-other-button\"]"));
wait.until(ExpectedConditions.visibilityOfAllElements(element));
element.click();
Thread.sleep(5000);


System.out.println("Successfully ran the Explicit wait");


driver.close();
}
}


