package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		//Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
         
		WebElement Outerfame = driver.findElement(By.xpath("//div[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(Outerfame);

		WebElement Innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(Innerframe);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Autoamtion");

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//a")).click();


		
		}

		}


	


