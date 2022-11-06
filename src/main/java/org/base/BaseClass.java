package org.base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
		public static WebDriver chromeBrowser() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			return driver;
		}
		//if condition
		public static WebDriver browserLaunch(String bname) {
		
		if(bname.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();	
		}
		
		else if (bname.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
    	driver=new FirefoxDriver();
		}
		
		else if (bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
	    	driver=new EdgeDriver();
		}
		
		return driver;
		
     }	
		
		//switchcase
		public static WebDriver browserLunch2(String bname ) {
			switch(bname) {
			case"Chrome":
				WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			case"firefox":
				WebDriverManager.firefoxdriver().setup();
		    	driver=new FirefoxDriver();	
			case"edge":
				WebDriverManager.edgedriver().setup();
		    	driver=new EdgeDriver();
		    	default:
		    		System.out.println("Invalid browser name");
			}
			return driver;
			
		}

		public static void urllaunch(String url) {
	    driver.get(url);
	    driver.manage().window().maximize();
     	}
		
		public static void implicitlywait( int a) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	    }
		public static void sendkeys(WebElement e,String a) {
		e.sendKeys(a);
		}
		
		public static void click(WebElement e) {
		e.click();
		}
		public static String getcurrenturl() {
        String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
		
		public static String gettitle() {
		String title = driver.getTitle();
		return title;
		}
		public static void quit() {
		driver.quit();
		}
		public static String gettext (WebElement e) {
		String text = e.getText();
		return text;
		}
		
		public static String getattribute(WebElement e) {
		String attribute = e.getAttribute("Value");
		return attribute;
		}
		
		public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
        a.moveToElement(target).perform();
		}
		
		public static void dragAndDrop(WebElement src,WebElement tar) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, tar).perform();
		}
		
		public static void SelectByIndex(WebElement e,int a) {
			Select s=new Select(e);
			s.selectByIndex(a);

		}
		
		public static void refresh() {
			driver.navigate().refresh();
		}
		
		
		
		}		
		
	