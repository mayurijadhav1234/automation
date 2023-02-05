package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class kyes_actions {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
	    act.sendKeys(Keys.ALT).perform();
	    String s1=driver.findElement(By.id("result")).getText();
	    System.out.println(s1);
	    act.sendKeys(Keys.CANCEL).perform();
	    String s2=driver.findElement(By.id("result")).getText();
        System.out.println(s2);
		
	}

}
