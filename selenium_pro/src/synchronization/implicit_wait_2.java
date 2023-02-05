package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String BaseURL = "https://www.facebook.com/";
        driver.get(BaseURL);
		
		driver.findElement(By.id("serrarch7")).sendKeys("Selenium");//20
		//13
		driver.findElement(By.id("learntocode_searchbtn")).click();
		
		driver.quit();
	}

		
		
	}


