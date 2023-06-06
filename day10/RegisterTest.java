package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.RegisterPage;

public class RegisterTest {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		RegisterPage.Gender(driver).click();
	}
}
