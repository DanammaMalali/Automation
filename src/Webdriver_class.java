

//Run yout First Selenium WebDriver script by copy paste below code after executing above five simple steps.
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Webdriver_class
{
public static void main(String[] args)
{
WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\somum\\Downloads\\chromedriver_win32");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\somum\\Downloads\\chromedriver_win32.exe");
driver.get("http://google.com");
System.out.println(driver.getTitle());
driver.manage().window().maximize();
driver.close();
}
}