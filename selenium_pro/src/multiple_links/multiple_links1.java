package multiple_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_links1 {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
			driver.findElement(By.linkText("Grocery")).click();
			
			List<WebElement> size=driver.findElements(By.tagName("a"));
			System.out.println(size.size());
			
			for(WebElement link: size)
			{
				System.out.println(link.getText());
				System.out.println(link.getAttribute("href"));
			}
			driver.quit();
			
			
			
	}

}
