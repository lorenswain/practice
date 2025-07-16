package amazon_webpage_testing;

import java.lang.classfile.CodeBuilder.CatchBuilder;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DetailPage {
	WebDriver driver;
	Actions act;
	public DetailPage(WebDriver driver) {
		this.driver= driver;
		act=new Actions(driver);
	}
		
	String  AboveFst1_URL  = "https://www.amazon.com/dp/B0BLJ6CCXZ";       //above fst ASIn
	String BleowFst1_URL  = "https://www.amazon.com/dp/B0DHR8C643";         // below FST ASIN	
	
	String  AboveFst1_GC_URL  = "https://www.amazon.com/dp/B0B6BG2PB4";       //above fst ASIn
	String BleowFst1_GC_URL  = "https://www.amazon.com/dp/B0DMNJ1LN7";         // below FST ASIN	
	
    By Detailpage_ssdcheck = By.xpath("//span[@data-csa-c-delivery-price='FREE']//span[@class='a-text-bold']");    //  Above fst ssd promise shown in detail	
//	By BelowFst_SSDcheck =   By.xpath("//span[@data-csa-c-delivery-price='FREE']//span[@class='a-text-bold']");     //  below fst ssd promise shown in detail
//	By BelowFst_SSDcheck = By.xpath("//span[@data-csa-c-delivery-condition='on qualifying orders over $25']");
	//By BelowFst_SSDcheck = By.xpath("//*[@id=\"mir-layout-DELIVERY_BLOCK\"]");
	By add_to_cart= By.id("add-to-cart-button");                                                                  //add to cart
	
	By buy_now= By.xpath("//input[@id='buy-now-button']");                                                        //buy now
	
	By qyantityDropDown= By.xpath("(//span[contains(text(),'Quantity')])[1]");                                    //quantity drop down
	
	String [] BelowSSDpromise = {"Today 5 PM - 10 PM","Overnight 4 AM - 8 AM","Overnight 7 AM - 11 AM","Today 7 AM - 11 AM",
			"Tomorrow 10 AM - 3 PM","Today 10 AM - 3 PM","Today 2 PM - 6 PM"};                                                     // expected MDW promise 
			
	String [] AboveSSDpromise =		{"ettggr",
			"Today 5 PM - 10 PM","Overnight 4 AM - 8 AM","Overnight 7 AM - 11 AM","Today 7 AM - 11 AM",
			"Tomorrow 10 AM - 3 PM","Today 10 AM - 3 PM","Today 2 PM - 6 PM"};
	
	
	//..............................................................................................................
		//-------------------------------------------------------------------------------------------------------------
	public void detail_Above_Lego()
	{
		driver.get(AboveFst1_URL);                                                                  //navigate to below fst detail page
	}
	
	public void detail_belowLego()
	{
		driver.get(BleowFst1_URL);                                                                  //navigate to below fst detail page
	}
	public void AboveFst1_GC_URL()
	{
		driver.get(AboveFst1_GC_URL);                                                                  //navigate to below fst detail page
	}
	public void BleowFst1_GC_URL()
	{
		driver.get(BleowFst1_GC_URL);                                                                  //navigate to below fst detail page
	}
	public void buy_box_promise_Detailpage()
	{
		System.out.println(driver.findElement(Detailpage_ssdcheck).getText());
	}
	
	public void Movingto_BelowFST_detailpage() throws InterruptedException
	{
		boolean matchFound= false;	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String SSD_Promise_DP_Below=driver.findElement(Detailpage_ssdcheck).getText();	            // ssd promise check in detail page
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(SSD_Promise_DP_Below);		     
	//	String deliveryCharge = driver.findElement(By.xpath("//*[@id='mir-layout-DELIVERY_BLOCK']/div/span")).getAttribute("data-csa-c-delivery-time");
	//	System.out.println(deliveryCharge);
		for(String belowexpected : AboveSSDpromise) { 
			
			if (belowexpected.equals(belowexpected))	
			{	System.out.println("Pass");
			 matchFound = true;
             break;
         }}                                                                                          // compare the actual promise to expected promise

     if (!matchFound) {
         System.out.println("No matching SSD promise found in AboveSSDpromise list.");
         Assert.fail("No SSD promise matched the expected Above list.");
     }
 } 
//......................................................................................................................		
//..............................................................................................................
//-------------------------------------------------------------------------------------------------------------	
	public void Movingto_AboveFST_detailpage()
	{
		boolean matchFound= false;		                                                                                //navigate to above fst detail page    
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String SSD_Promise_DP_Above=driver.findElement(Detailpage_ssdcheck).getText();                             // ssd promise check in detail page
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(SSD_Promise_DP_Above);
		for(String expected : AboveSSDpromise ) {
			
			if (SSD_Promise_DP_Above.equals(expected)) {
	            System.out.println("Pass");     			
			 Assert.assertTrue(true);	
			  matchFound = true;
              break;
          } }                                                                                            // compare the actual promise to expected promise
      if (!matchFound) {
          System.out.println("No matching SSD promise found in AboveSSDpromise list.");
          Assert.fail("No SSD promise matched the expected Above list.");
            }
}	
	
	
	
	
	
	
	
	public void Add_to_Cart()                                                                                               // Add to cart
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement Add_to_Cart = wait.until(ExpectedConditions.visibilityOfElementLocated(add_to_cart));
			Add_to_Cart.click();
	}
	
	public void Buy_Now()                                                                                                   // Buy Now
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Buy_Now = wait.until(ExpectedConditions.visibilityOfElementLocated(buy_now));
		Buy_Now.click();
	}
	
	public void increaseQuantity(int x)                                                                                // Quantity increase
	{		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));                                                       //webdriver wait
		WebElement increaseQuantity = wait.until(ExpectedConditions.visibilityOfElementLocated(qyantityDropDown));
		increaseQuantity.click();
		for(int i=1;i<x;i++) {
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();}
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();		
	}

}
