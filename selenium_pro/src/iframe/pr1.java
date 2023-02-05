package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr1 {

	public static void main(String[] args) {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://demo.automationtesting.in/Frames.html");
           
           
           
           driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
           
          //WebElement outer= driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
  		WebElement outer = driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
  		driver.switchTo().frame(outer);

	    
			WebElement inner = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
			driver.switchTo().frame(inner);

	      // WebElement inner=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	       
	       driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("pratik pawar");
	
	}

}
