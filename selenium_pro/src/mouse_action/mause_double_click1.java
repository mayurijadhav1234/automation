package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mause_double_click1 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://demo.guru99.com/test/simple_context_menu.html");
          
          WebElement element=driver.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To See Alert\")]"));
          
          Actions act=new Actions(driver);
          
          act.doubleClick(element).build().perform();
          //Thread.sleep(3000);
          String s1=driver.switchTo().alert().getText();
          System.out.println(s1);

          driver.switchTo().alert().accept();
          Thread.sleep(3000);

          driver.quit();

	}

}
