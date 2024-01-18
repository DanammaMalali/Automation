package com.test.app;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver.get("https://money.rediff.com/gainers/bse/monthly/groupall");
		driver.manage().window().maximize();
		
		List <WebElement> columns=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
		System.out.println("Size of the column"+" "+ columns.size());
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		element=element.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		
		System.out.println(element.getText());
		
		driver.close();

	}

}
