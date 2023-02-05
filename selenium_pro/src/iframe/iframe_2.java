package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		//Thread.sleep(3000);

		driver.switchTo().frame("SingleFrame");

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Autoamtion");

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//a")).click();
		}
	}


