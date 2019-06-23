package com.org.selenium.selenium1;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class firstOne1 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\selenium\\chromedriver.exe";
    public WebDriver driver ; 
    
  @Test
  public void f() {
	  
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.quit();
  }
}

