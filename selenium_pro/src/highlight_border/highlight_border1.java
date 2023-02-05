package highlight_border;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlight_border1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

		WebElement Element=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	   WebElement input=driver.findElement(By.id("email"));
	    WebElement input2=driver.findElement(By.id("pass"));
	    WebElement button=driver.findElement(By.xpath("//button[@name=\"login\"]"));
	    WebElement ss=driver.findElement(By.xpath("//a[@title=\"Log in to Facebook\"]"));
	    WebElement ss1=driver.findElement(By.xpath("//div[@class=\"_8esj _95k9 _8esf _8opv _8f3m _8ilg _8icx _8op_ _95ka\"]"));

	    


         Thread.sleep(2000);
         drawborder(Element, driver);
         drawborder(input, driver);
         drawborder(input2, driver);
         drawborder(button,driver);
         drawborder(ss,driver);
         drawborder(ss1,driver);


         
         
         Thread.sleep(5000);

         //driver.quit();
	}

	private static void drawborder(WebElement ele1, WebDriver driver)
	{
		JavascriptExecutor Js  = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].style.border='5px solid yellow'", ele1);
		Js.executeScript("arguments[0].style.background='Red'", ele1);
    }

}
