package com.test.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
static WebDriver driver;
static WebElement element;
static boolean bool;
static String text;
static int rows, columns, i, j;
static String value;

public static void main(String[] args) throws InterruptedException {
// To launch a Chrome Browser
driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver.get("https://the-internet.herokuapp.com/tables");
driver.manage().window().maximize();

// Timeout Applicable for all the elements
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Simple Web Table Handling
// columns = driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th")).size();
columns = driver.findElements(By.xpath("//*[@id='table1']/thead/tr/th")).size(); //*[@id="table1"]/thead/tr
System.out.println("No of columns : " + columns);  

// rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr/td[1]")).size();
rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr")).size(); 
System.out.println("No of rows : " + rows);

// driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr/td[1]"));

// Retrieve first row and second coloumn value
System.out.println("Retrieve first row and second coloumn value  :  ");
System.out.print(driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[1]/td[2]")).getText());
System.out.println();
System.out.println();  
System.out.println();


// Retrieving the headers of table
for (int i = 1; i <= columns; i++) {
// Printing the header value
System.out.print(driver.findElement(By.xpath("//*[@id='table1']/thead/tr/th[" + i + "]")).getText() + "     ");
}

System.out.println();
System.out.println();

//[@id='table1']/tbody/tr[1]/td[2]
// To retrieve the values of table
for (i = 1; i <=rows; i++) {
for (j = 1; j <=columns; j++) {
value = driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
System.out.print(value + "    ");
}
System.out.println();
}
System.out.println();
System.out.println();


//print maximum due


String str= driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[2]/td[4]")).getText();
str=str.substring(1);
float max=Float.parseFloat(String.valueOf(str));
for(int i=1;i<=rows;i++)
{
	String string= driver.findElement(By.xpath("//*[@id='table1']/tbody/tr["+i+"]/td[4]")).getText();
	string=string.substring(1);
	float num=Float.parseFloat(String.valueOf(string)); 
	if(num>max)
	{
		max=num;
	}	
}
System.out.println("Maximum due:"+" "+max);




Thread.sleep(2000);

System.out.println();

// Close the browser
driver.close();
}
}

