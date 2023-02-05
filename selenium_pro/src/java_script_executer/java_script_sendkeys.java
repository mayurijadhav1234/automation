package java_script_executer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_script_sendkeys {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
         driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		// First way
		WebElement Login = driver.findElement(By.xpath("//button[@name=\"login\"]"));

		JavascriptExecutor Js = (JavascriptExecutor) driver;

//		Js.executeScript("document.getElementById('email').value='Rohit';");
//		Js.executeScript("document.getElementById('pass').value='Patil';");
//		Js.executeScript("arguments[0].click()", Login);

		// SecondWay

		WebElement input1 = driver.findElement(By.id("email"));
		WebElement input2 = driver.findElement(By.id("pass"));

		Js.executeScript("arguments[0].value='Avinash';", input1);
		Js.executeScript("arguments[0].value='More';", input2);
		Js.executeScript("arguments[0].click()", Login);

	}
	}

