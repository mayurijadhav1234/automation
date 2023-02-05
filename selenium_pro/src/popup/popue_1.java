package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popue_1 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		//driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("mayuri647365");
		//driver.findElement(By.xpath("//input[@type=\"text\" and @class=\"_2IX_2- VJZDxU\"]")).sendKeys("qwer");

		JavascriptExecutor j = (JavascriptExecutor)driver;
	    j.executeScript ("document.getElementById('//input[@type=\"text\"]').value='mayuri'");
	    
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("Q!@#$");

		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();

		
		driver.quit();
		}
	}


