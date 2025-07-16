package datadrivenandparalleltesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltest {
	WebDriver driver;
	
	@Parameters({"Browser"})
	@BeforeClass
	
	void setup(String Browser) throws InterruptedException
	{
		
	switch(Browser.toLowerCase()) {
		case "chrome" : driver= new ChromeDriver();break;
		case "firefox" : driver= new FirefoxDriver();break;
		case "edge" : driver= new EdgeDriver();break;
		default:System.out.println("invalid browser");
		}
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void testlogo() {
	boolean logo=	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(logo,true);
	}
	@Test(priority=2)
	void testurl() {
		String url= driver.getCurrentUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=3)
	void testtitle () {
		String title= driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	
	@AfterClass
	void close() {driver.close();}

}
