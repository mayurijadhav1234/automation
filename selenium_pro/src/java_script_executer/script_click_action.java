package java_script_executer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_click_action {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
				
		driver.findElement(By.id("email")).sendKeys("Rohit");
		driver.findElement(By.id("pass")).sendKeys("Patil");
		
		
		WebElement Login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
	    
	    JavascriptExecutor Js =(JavascriptExecutor) driver;
	      
	    Js.executeScript("arguments[0].click()", Login);
	    
	}

}
