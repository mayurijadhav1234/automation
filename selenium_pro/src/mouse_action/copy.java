package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copy {

	public static void main(String[] args) throws InterruptedException {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.bharatmatrimony.com/");
           
           driver.findElement(By.xpath("//a[@class=\"mob-none\"]")).click();
           WebElement un=driver.findElement(By.xpath("//input[@class=\"hp-txtBox\"]"));
           WebElement pass=driver.findElement(By.id("TEMPPASSWD1"));
           
           un.sendKeys("my name is khan");
           Actions act=new Actions(driver);
           act.keyDown(Keys.CONTROL);
   		act.sendKeys("a");
   		act.keyUp(Keys.CONTROL);
   		act.build().perform();
   		

   		  // Ctrl+c
   		  act.keyDown(Keys.CONTROL);
   		  act.sendKeys("c");
   		  act.keyUp(Keys.CONTROL);
   		  act.build().perform();

           
           
           
           
           //select tab
           act.keyDown(Keys.TAB);
           
           act.build().perform();
           System.out.println("hello");
           
           //paste
           act.keyDown(Keys.CONTROL);
           act.sendKeys("v");
           act.keyUp(Keys.CONTROL);
           act.build().perform();
           
           
           
           
         
           
           
	}

}
