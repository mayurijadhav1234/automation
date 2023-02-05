package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class horizontall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
         driver.get("https://codepen.io/jaemskyle/pen/XWJvRL");
         WebElement w1=driver.findElement(By.linkText("six"));
         

        //This will scroll the page Horizontally till the element is found		
         js.executeScript("arguments[0].scrollIntoView()", w1);
    }
}

