package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_3 {
	WebDriver driver= new EdgeDriver();
  @BeforeMethod
  public void Before() {
	  WebDriverManager.edgedriver().setup();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  @Test
  public void Test() throws InterruptedException {
	  Thread.sleep(3000);
	  WebElement userName=driver.findElement(By.name("username"));
	  userName.sendKeys("Admin");
	  Thread.sleep(3000);
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  Thread.sleep(3000);	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
  }
  @AfterMethod
  public void After() {
	  driver.quit();
  }
}
