package amazon_webpage_testing;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class check {
	
	public static void main(String[] orgs) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		Actions act=new Actions(driver);

		driver.get("https://www.amazon.com/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_youraccount_switchacct&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&_encoding=UTF8&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
		
		driver.findElement(By.id("ap_email")).sendKeys("dex-ssd-qa-mtest+p+0-1744104414362iZFa@amazon.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.id("ap_password")).sendKeys("testtest");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		Thread.sleep(20000);
		
		WebElement languagemouseover = driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/a/span/span[2]"));
		WebElement languagemouseover_EN = driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//span[contains(@dir,'ltr')][normalize-space()='English']"));
	
		languagemouseover.click();
			
			
			Thread.sleep(4000);
		driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
		boolean x= driver.findElement(By.xpath("//*[@class='a-section a-spacing-top-micro sc-sss-box']")).isDisplayed();
    	if (x== true)
    		System.out.println(driver.findElement(By.xpath("//*[@class='a-section a-spacing-top-micro sc-sss-box']")).getText());
    
	driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout' and @value='Proceed to checkout']")).click();
	Thread.sleep(6000);
	System.out.println(driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none address-promise-text a-text-bold']//span[@class='break-word']")).getText());
	
	
	
	}
		
		
	}


