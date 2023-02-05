package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr1 {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement w1=driver.findElement(By.xpath("//h3[contains(text(),\"Example\")]"));

		js.executeScript("arguments[0],scrollintoView()", w1);
		
//		int row=driver.findElements(By.id("customers")).size();
//		System.out.println(row);
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println(row.size());
		
		
		
		
	}

}
