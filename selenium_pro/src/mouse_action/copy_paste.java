package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copy_paste {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement UN=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		WebElement pass=driver.findElement(By.xpath("//input[@type=\"password\"]"));

		UN.sendKeys("my name is mayuri");
		Actions Act=new Actions(driver);
		//ctrl+a
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("a");
		Act.keyUp(Keys.CONTROL);
		Act.build().perform();
		

		  // Ctrl+c
		  Act.keyDown(Keys.CONTROL);
		  Act.sendKeys("c");
		  Act.keyUp(Keys.CONTROL);
		  Act.build().perform();

		  // Tab
		  Act.sendKeys(Keys.TAB);
		  Act.build().perform();
		  System.out.println("Hello");
		        
		        Thread.sleep(2000);
		  Act.keyDown(Keys.CONTROL);
		  Act.sendKeys("v");
		  Act.keyUp(Keys.CONTROL);
		  Act.build().perform();
		 }


	}


