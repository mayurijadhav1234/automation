package java_script_executer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_link_byelemnt {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/");

		Thread.sleep(3000);
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		WebElement W3Spaces = driver.findElement(By.xpath("//h1[contains(text(),'W3Schools Spaces')]"));
		
		Js.executeScript("arguments[0].scrollIntoView();", W3Spaces);
		
		Thread.sleep(5000);

		driver.quit();
	}


	}


