package multiple_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");
		
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			
			int Broken_link=0;
			for(WebElement link:links)
			{
				String url=link.getAttribute("href");
				if(url==null || url.isEmpty())
				{
					System.out.println("url is empty");
					continue;
				}
				
				URL link1=new URL(url);
				 //abstact class
		    	 HttpURLConnection httpcode=(HttpURLConnection) link1.openConnection();
		    	 httpcode.connect();
		    	 
		    	 if(httpcode.getResponseCode()>=400) {
		    		 
		    		 System.out.println(httpcode.getResponseCode()+"--->"+url+"is ---->"+" :Broken Link");
		    		 Broken_link++;
		    	 }
		    	 else {
		    		 System.out.println(httpcode.getResponseCode()+"--->"+url+"is ---->"+" :Valid Link");

		    	 }
		    	 
		       }
		       System.out.println("Number of broken links :"+Broken_link);
		        driver.quit();
			}

		    	 
			}
	


