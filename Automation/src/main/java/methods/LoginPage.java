package main.java.methods;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
				
	}

    By Email= By.id("ap_email");
	By Nextpage = By.xpath("//*[@id=\"continue\"]");
	By Pwd =By.id("ap_password");
	By Signin =By.xpath("//input[@id='signInSubmit']");
	
	public void LoginAmazon(String xemail, String ypwd)
	{
		
		driver.findElement(Email).sendKeys(xemail);
		driver.findElement(Nextpage).click();
		driver.findElement(Pwd).sendKeys(ypwd);
		driver.findElement(Signin).click();
	}
	
	
	
	
	
	
}
