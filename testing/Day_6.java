package com.example.testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_6 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//Question 1
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Prajeesh");
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("s");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("praju@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Prajeesh@2004");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)", "");
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		
		//Question 2
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Prajeesh");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("s");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("praju@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("praju@2004");
		js.executeScript("window.scrollBy(0,125000)", "");
		driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("05/09/2004");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]")).sendKeys("india");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("9898989765");
		driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]")).sendKeys("09/09/2023");
		driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665628131_None\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
		
		
		//Question 3
		      driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		      driver.manage().window().maximize();
		      driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("sample@yahoo.com");
		      driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("samplepass123");
		      WebElement computerAcc=driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]"));
		      computerAcc.click();
		  	  js.executeScript("window.scrollBy(0,300)", "");
			  Thread.sleep(3000);
		
		//Question 4
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
			username.sendKeys("Admin");
			WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
			password.sendKeys("admin123");
		    WebElement button;
		    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		    button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		    button.click();
	}
}