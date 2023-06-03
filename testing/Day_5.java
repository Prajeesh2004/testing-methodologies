package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_5 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		if(title.equals("Home"))
		{
			System.out.println("same");
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2800)", "");
		Thread.sleep(3000);
		WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img"));
		clothing.click();
		String clothing_shop=driver.getTitle();
		if(clothing_shop.equals("Shop"))
		{
			System.out.println("Same name");
		}
		
		WebElement cloth1=driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[1]/div/h2/a"));
		String nameOf1=cloth1.getText();
		System.out.println(nameOf1);
		driver.quit();
//		
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"t3-header\"]/div/div/div[2]/div[2]/ul/li[1]/a")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
