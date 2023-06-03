package com.example.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_7Test {

	@Test
	public void compare() {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String a = driver.getTitle();
		Assert.assertEquals(a, "Guest Registration Form – User Registration");
	}
}
