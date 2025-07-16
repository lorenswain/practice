package myownexperiment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class yyyyyy extends zzzzzz{
	
	
	WebDriver driver= new ChromeDriver();
	zzzzzz z= new zzzzzz();
	
	static String[][] credentials = data(); // Inherited from zzzzzz
    static String a = credentials[0][0];
    static String b = credentials[0][1];
	
    void login(String a, String b)
	{
		driver.get("https://tinyurl.com/mvxt6wab");
		driver.findElement(By.id("ap_email")).sendKeys(a);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(b);
		 driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
	}
      
	
	}

