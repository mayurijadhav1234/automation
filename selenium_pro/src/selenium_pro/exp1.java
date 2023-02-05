package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp1 {

	public static void main(String[] args) {
		
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mayu.p.jadhav@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("38457346534765");
		driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
		
		

	}

}
