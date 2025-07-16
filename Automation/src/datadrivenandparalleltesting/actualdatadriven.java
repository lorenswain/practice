package datadrivenandparalleltesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class actualdatadriven {
private static final String data = null;
WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider= "dataforlogin")
	void login(String email,String pwd) throws InterruptedException
	{
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		
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

	
	
	@DataProvider(name="dataforlogin",indices= {0,2})  //indices pass to use specific data
	Object[][] Logindata()
	{
		Object data[][]= {
				
				{"xfdxdtxtg","6576"},{"xresresr","786768768786"},{"loplop@gmail.com" ,"defdefdef"},{"6764sdsd","uiui"}};
				
				return data;
		
		
		
		
	}
	
	
	
}
