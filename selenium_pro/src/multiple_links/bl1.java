package multiple_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bl1 {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
  
        driver.get("https://demo.automationtesting.in/Register.html");
        
       List<WebElement> Links =driver.findElements(By.tagName("a"));
       
       System.out.println(Links.size());
       
       int BrokenLinks=0;
       
       for(WebElement elemet :Links) {
    	 String url = elemet.getAttribute("href");
    	 if(url==null || url.isEmpty()) {   		 
    		 System.out.println("URL is empty");
    		 continue;
    	 }
    	 
    	 URL link = new URL(url);
    	 //abstact class
    	 HttpURLConnection httpcode=(HttpURLConnection) link.openConnection();
    	 httpcode.connect();
    	 
    	 if(httpcode.getResponseCode()>=400) {
    		 
    		 System.out.println(httpcode.getResponseCode()+"--->"+url+"is ---->"+" :Broken Link");
    		 BrokenLinks++;
    	 }
    	 else {
    		 System.out.println(httpcode.getResponseCode()+"--->"+url+"is ---->"+" :Valid Link");

    	 }
    	 
       }
       System.out.println("Number of broken links :"+BrokenLinks);
        driver.quit();
	}
	}

