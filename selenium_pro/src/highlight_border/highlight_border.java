package highlight_border;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlight_border {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		
		WebElement Element=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	    WebElement input=driver.findElement(By.id("email"));
	    WebElement button=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		
		
	//	Js.executeScript("arguments[0].style.border='10px solid Red'", Element);
		Js.executeScript("arguments[0].style.border='5px solid black'", Element);
		Js.executeScript("arguments[0].style.border='10px solid red'", input);
		Js.executeScript("arguments[0].style.border='7px solid green'", button);

		Thread.sleep(5000);

		driver.quit();
	}
	}


