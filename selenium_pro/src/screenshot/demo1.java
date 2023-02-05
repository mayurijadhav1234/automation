package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo1 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://mail.google.com/mail/u/0/#inbox");
	    
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    System.out.println(src);
	    
	    File dest=new File("C:\\Users\\Admin\\Documents\\sheet\\gmail.jpg");
	    FileHandler.copy(src, dest);
	
	}

}
