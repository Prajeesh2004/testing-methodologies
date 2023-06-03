package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_04 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("madurai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"todaydiv\"]/h4")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
