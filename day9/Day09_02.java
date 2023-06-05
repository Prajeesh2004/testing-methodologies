package com.example.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day09_02 {
	WebDriver driver;;
  @Test
  public void testCase1() {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.navigate().to("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.godaddy.com/en-in" );
//	  driver.quit();
	  System.out.println("Thread Count is : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void testCase2() {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.navigate().to("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  driver.findElement(By.linkText("Domain Name Search")).click();
//	  driver.quit();
	  System.out.println("Thread Count is : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void testCase3() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.navigate().to("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Domain Name Search")).click();
	  Thread.sleep(2000);
	  String head=driver.getTitle();
	  Assert.assertEquals(head, "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).sendKeys("mydomain");
	  driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).click();
	  
	  
	  Thread.sleep(3000);
	  JavascriptExecutor js=  (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,300)", "");
//	  driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button")).isDisplayed();
//	  driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/span")).isDisplayed();
	  System.out.println("Thread Count is : "+ Thread.currentThread().getId());
  }
}
