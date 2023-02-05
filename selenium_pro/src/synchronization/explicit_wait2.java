package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait2 {

	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


           
		By Input1 = By.id("email");		
		WaitforElement(driver, Input1, 20).sendKeys("Pune");
		By Input2 = By.id("pass");		
		WaitforElement(driver, Input2, 10).sendKeys("Mumbai");
		
		driver.quit();

		//By.xpath("id=\"onward_cal\"")args;
	}

	public static WebElement  WaitforElement(WebDriver driver, By Locator, int timeout) {

		WebDriverWait MyWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		MyWait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		return driver.findElement(Locator);
	}

}
