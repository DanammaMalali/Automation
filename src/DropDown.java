package com.test.app;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		WebElement element;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://formstone.it/components/dropdown/demo/");
		driver.manage().window().maximize();
	    element=driver.findElement(By.xpath("//*[@id=\"demo_basic\"]"));  
		Select dropdown=new Select(element);
        dropdown.selectByVisibleText("Two");
        Thread.sleep(3000);
        //dropdown.selectByValue("");
        element=dropdown.getFirstSelectedOption();
        if(element.isSelected())
            System.out.println(element.getText()+" "+"is selected");
        Thread.sleep(5000);
        
        element=driver.findElement(By.xpath("//*[@id=\"demo_multiple\"]"));  
        dropdown=new Select(element);
        if(dropdown.isMultiple())
        	System.out.println("It is Multiple dropdown");
        List<WebElement> elements=dropdown.getOptions();
        System.out.println(elements.size());
        for(int i=0;i<elements.size();i++)
        {
        	if(elements.get(i).isEnabled())
                System.out.println(elements.get(i).getText());
        	else
        		System.out.println(elements.get(i).getText()+" "+"is disabled");
        	
        }
        dropdown.selectByVisibleText("Two");
        dropdown.selectByVisibleText("Four");
        elements=dropdown.getAllSelectedOptions();
        System.out.println("Selected options in multiple dropdown are");
        for(int i=0;i<elements.size();i++)
        {
        	System.out.println(elements.get(i).getText());
        }

        Thread.sleep(3000);
        driver.close();
	    
	}

}
