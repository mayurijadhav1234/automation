package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		//Thread.sleep(3000);

		// To switch main page to iframe page

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		driver.findElement(By.id("tryhome")).click();

		// driver.quit();

		

	}

}
