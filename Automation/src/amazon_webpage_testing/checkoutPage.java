package amazon_webpage_testing;

import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkoutPage {

	WebDriver driver;
	public checkoutPage(WebDriver driver) {
		this.driver= driver;	
		}
	                                  
                                                                                                              //check delivery promise title in checkout
	By Delivery_promise_checkout = By.xpath("//h2[@class='a-size-medium a-spacing-none address-promise-text a-text-bold']//span[@class='break-word']");
	
	public void Delivery_promise_checkout()                                                                          //print delivery promise title in checkout
	{
		System.out.println(driver.findElement(Delivery_promise_checkout).getText());
	}
	
 
	
	By AboveFst_rush_option_RadioBTN = By.xpath("//input[@type='radio' and @value= 'rush']");  //above FST radio button rush selected
		
		public boolean AboveFst_rush_option_RadioBTN_checkout()                                                                   // readio bttn check-enable or not
		{	 
			 return driver.findElement(AboveFst_rush_option_RadioBTN).isEnabled();
		 }
		
		
	//------------------------------------------------------------------------------------------------------------------------	
		
		
		By BelowFst_1DC_option_RadioBTN = By.xpath("//input[@type='radio' and @value= 'next-1dc']");  //below FST radio button 1DC selected
		public boolean BelowFst_1DC_option_RadioBTN_checkout()                                                                                //below FST radio button 1DC selected method
		{ 
			 return driver.findElement(BelowFst_1DC_option_RadioBTN).isEnabled();
				
		 }
		
		
		
		
		By BelowFst_rush_option_RadioBTN = By.xpath("//input[@type='radio' and @value= 'rush']");  //below FST radio button rush selected
		
	   public	void BelowFst_rush_option_RadioBTN() 
		{
			driver.findElement(Delivery_promise_checkout).click();                                                      //resh ship select for below fst manually
		}

	    
}
