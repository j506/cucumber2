package ui;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrpkenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(int i=0;i<link.size();i++)
		{
			WebElement ele=link.get(i);
			String url=ele.getAttribute("href");
			verifyLinkActive(url);
		}
		

	}

	private static void verifyLinkActive(String linkurl) {
		// TODO Auto-generated method stub
		try
		{
			URL url=new URL(linkurl);
			HttpURLConnection httpurlconnection=(HttpURLConnection)url.openConnection();
			httpurlconnection.setConnectTimeout(3000);
			httpurlconnection.connect();
			if(httpurlconnection.getResponseCode()==200)
			{
				System.out.println(linkurl+" "+httpurlconnection.getResponseMessage());
			}
			if(httpurlconnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{
				System.out.println(linkurl+" "+httpurlconnection.getResponseMessage()+" " +HttpURLConnection.HTTP_NOT_FOUND);
			}
			
		}catch(Exception e) {
			
		}
		
	}

}
