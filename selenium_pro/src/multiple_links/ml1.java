package multiple_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ml1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.orangehrm.com/");
			
			driver.findElement(By.linkText("Book a Free Demo")).click();
			
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			//for each loop
//			for(WebElement link: links)
//			{
//				System.out.println(link.getText());
//				System.out.println(link.getAttribute("href"));
//			}
//			//for loop
			
			for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
				System.out.println(links.get(i).getAttribute("href"));
			}
			
			driver.findElement(By.partialLinkText("Contact Sales")).click();
			List<WebElement> links2=driver.findElements(By.tagName("a"));
			System.out.println(links2.size());
			
			for(int i=0;i<links2.size();i++)
				{
					System.out.println(links2.get(i).getText());
					System.out.println(links2.get(i).getAttribute("href"));
				}
				
			
        driver.quit();
	}

}
