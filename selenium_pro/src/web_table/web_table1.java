package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_table1 {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		WebElement w1=driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
//		js.executeScript("arguments[0],scrollintoView()", w1);
//		
		//print row size
		//first way
		int row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println("total number of row==>" +row);
		
		List<WebElement> row1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println("total no of row==>"+row1.size());
		
		//print col size
		int col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("total number of column==>" +col);
		
		List<WebElement> col1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("total no of column==>"+col1.size());
		
		String data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
		System.out.println(data);
		String head1=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th[1]")).getText();
		System.out.println(head1);
		
		for(int i=2;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				String actualdata=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
                if(actualdata.equals("UK"))	
                {
                	System.out.println("row data : " +i+ " colmn data: " +j);
                }
			}
			System.out.println(" ");
		}
 

		

	}

}
