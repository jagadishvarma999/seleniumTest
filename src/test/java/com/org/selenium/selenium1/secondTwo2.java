package com.org.selenium.selenium1;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.testng.annotations.Test;
 
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
 
public class secondTwo2 {
 
 public WebDriver driver;
 
  @Test
 
  public void main() {
 
 // Find the element that's ID attribute is 'account'(My Account)
 
      // Enter Username on the element found by above desc.
 
      driver.findElement(By.id("email")).sendKeys("testuser_1");
 
      // Find the element that's ID attribute is 'pwd' (Password)
 
      // Enter Password on the element found by the above desc.
 
      driver.findElement(By.id("pass")).sendKeys("Test@123");
 
      // Now submit the form. WebDriver will find the form for us from the element
 
      driver.findElement(By.id("u_0_a")).click();
 
      // Print a Log In message to the screen
 
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
      String expectedTitle = "Facebook - Log In or Sign Up";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.quit();
 
  }
 
  @BeforeMethod
 
  public void beforeMethod() {
 
   // Create a new instance of the chrome driver
 
      driver = new ChromeDriver();
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      //Launch the Online Store Website
 
      driver.get("https://www.facebook.com/");

 
  }
 
  @AfterMethod
 
  public void afterMethod() {
 
   // Close the driver
 
      driver.quit();
 
  }
 
}
