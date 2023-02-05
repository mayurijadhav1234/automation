package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait_1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		String BaseURL = "https://www.redbus.in/";

		driver.get(BaseURL);
		
		WebDriverWait MyWait = new WebDriverWait(driver, Duration.ofSeconds(15));				
		WebElement Element=MyWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));		
        Element.sendKeys("Pune");
      //  Thread.sleep(3000);
        
		WebDriverWait MyWait1 = new WebDriverWait(driver, Duration.ofSeconds(45));	
        WebElement Element1=MyWait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest123")));		
        Element1.sendKeys("Mumbai");
        
	}

}
