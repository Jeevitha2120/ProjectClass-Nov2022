package org.base;


import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass {
	
	public static void main(String[] args) {
	
		browserLaunch("chrome");
		
		urllaunch("https://www.facebook.com/");
		
		implicitlywait(20);
		
        WebElement txtUsername = driver.findElement(By.id("email"));
        sendkeys(txtUsername, "sera");
        
        WebElement txtpassword = driver.findElement(By.id("password"));
        sendkeys(txtpassword, "99889");
	
        refresh();
        
      sendkeys(txtUsername, "raja");
        
        
        
	}
		
	}
