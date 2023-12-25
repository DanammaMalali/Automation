import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonTest {

	public static void main(String [] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\somum\\Downloads\\chromedriver_win32");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\somum\\Downloads\\chromedriver_win32.exe");
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement element;
	element=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	element.click();
	element=driver.findElement(By.id("ap_email" ));
	element.sendKeys("danumalali28@gmail.com");
	element=driver.findElement(By.xpath("//*[@id=\'continue\']"));
	element.click();
	Thread.sleep(2000);
	driver.close();
	}
}
