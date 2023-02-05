package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.id("box5"));
		Thread.sleep(4000);
		WebElement destination=driver.findElement(By.id("box104"));
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(source, destination).build().perform();
		
		WebElement src=driver.findElement(By.id("box1"));
		WebElement dest=driver.findElement(By.id("box106"));
		
		act.dragAndDrop(src, dest).perform();
		//driver.quit();

	}

}

