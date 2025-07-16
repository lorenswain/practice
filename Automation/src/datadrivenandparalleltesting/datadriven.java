package datadrivenandparalleltesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class datadriven {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	void login()
	{
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.id("input-email")).sendKeys("loplop@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("defdefdef");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		boolean status = driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]")).isDisplayed();
		
		if(status == true)
		{
			driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
			Assert.assertTrue(true);
			
		}
		else
			Assert.assertTrue(false);
		
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}

}
