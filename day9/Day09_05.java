package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day09_05 {
	WebDriver driver=new EdgeDriver();
	  @BeforeMethod
	  public void test01() throws InterruptedException {
		  WebDriverManager.edgedriver().setup();
		  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
	  @Test
	  public void test02() throws InterruptedException {
		  driver.findElement(By.name("username")).sendKeys("Suvitha");
		  driver.findElement(By.name("password")).sendKeys("12345");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(5000);
		  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		  Thread.sleep(5000);
	  }
	  
	  @AfterMethod
	  public void test03() {
		  driver.close();
	  }
}
