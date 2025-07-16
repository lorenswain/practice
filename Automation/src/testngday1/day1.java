package testngday1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class day1 {

	WebDriver driver= new ChromeDriver();
	Actions act=new Actions(driver);
	
	@Test(priority= 1)
	void openApp()
	{
	driver.get("https://www.amazon.com/");
	}
	
	@Test(priority= 2)
	void Searchitem()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lego");
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
	}
	
	@Test(priority=3)
	void logocheck()
	{
		boolean x=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		System.out.println(x);
	}
	
	
	@Test(priority= 4)
	void operatin()
	{
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();

		
	}
	
	
	@Test(enabled=false)  //@Ignore 
	void operatins()
	{
		driver.get("https://mail.google.com/mail/u/0/#inbox?compose=new");
		
		
	}
	@Test(priority= 6)
	void operatinss()
	{
		driver.get("https://midway-auth.amazon.com/login?next=%2FSSO%2Fredirect%3Fredirect_uri%3Dhttps%253A%252F%252Fissues.amazon.com%253A443%252Fissues%252Fsearch%253Fq%253Drequester%253Aloreswai%252520status%253AOpen%2526sort%253DlastUpdatedConversationDate%252520desc%2526mode%253Dsearch%26client_id%3Dhttps%253A%252F%252Fissues.amazon.com%253A443%26scope%3Dopenid%26sentry_handler_version%3DMidwayNginxModule-1.7-1%26use_sentry_key%3D1%26response_type%3Did_token%26nonce%3D616255183855ec7793178da86835966540b8ee6c23c97e80bda4f76946351f81%26uid%3Df6a276a3-1242-4631-8c68-95dd95b4e31e%26for_sentry%3Dtrue%26sentry_verification%3DeyJ4NXUiOiJodHRwOlwvXC9zZW50cnktcGtpLmFtYXpvbi5jb21cL3B1YmxpY2tleVwvMjQxMjg0NDIiLCJ0eXAiOiJKV1MiLCJhbGciOiJQUzI1NiJ9.eyJzdWIiOiJsb3Jlc3dhaSIsInR5cGUiOiJTZW50cnlWZXJpZmljYXRpb24iLCJleHAiOjE3NTAxNzIxMjMsImp0aSI6ImZjY2M2N2U5LTAzMDEtNDg5My1hZWNkLWJmMzJmYTA2YzMxYiJ9.UYnubok1ZqE3lxJguZj1j7Ab_MCXYjUa7UGwpIY8RvtEyxVncPiwhtg0RBKuT8dzcTsPTsIgjZMPvkuOihxrytLccaQGZlMyZrvYJSU3hqaklzhGSMI1Amfm2YG0Sd1Uirgw1fiObm9R5cyfU5ym_gLigHVqxFKHrp1zGJRoliGkZ_K-JxCUpeZPorZ_GiI_PFgPhUaeGJjD6X88_GoClGh1eXCOtbQjIqxQ-ys2jQB6AM4fTSDjDQiXeW09j0bibwqAEt3QhthNZ8vy_2fQ6QNMEjdwd_nKD5yTNDq2a_tQIAu8jbzutITM98MVBz5hjVsNgX-EoZ6FRwEX50icRA#midway");
	
}
}