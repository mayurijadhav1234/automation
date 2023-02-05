package highlight_border;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_down1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);

       JavascriptExecutor Js =(JavascriptExecutor) driver;
		
		Js.executeScript("window.scrollBy(0,5000)", "");
		Thread.sleep(3000);

		Js.executeScript("window.scrollBy(0,-7000)", "");
	    Js.executeScript("window.scrollBy(250,0)", "");

	
	}

}
