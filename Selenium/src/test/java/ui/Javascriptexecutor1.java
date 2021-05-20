package ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Javascriptexecutor1 {
    public WebDriver driver;
	
    public static void drawBorder(WebDriver driver,WebElement element)
    {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("arguments[0].style.border='3px solid red'",element);
    }
    public static String gettitlejs(WebDriver driver)
    {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	String title=js.executeScript("return document.title").toString();
    	return title;
    }


}
