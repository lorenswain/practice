package amazon_webpage_testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bind.annotation.Super;

public class CartPage {
	
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver= driver;
	}
	
	
	By Cart = By.xpath("//a[@id='nav-cart']");                               //cart link on right side top corner
	
	public void CartPage1()                                                                                    //Method for clicking & navigating to cart page
	{
		driver.findElement(Cart).click();
		System.out.println("Now you are in cart page");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	By saveforltr = By.xpath("//input[@value='Save for later' and @data-action='save-for-later']");
	public void saveforlater()
	{driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(saveforltr).click();
	}
	
	By delete = By.xpath("//input[@value='Delete' and @data-action='delete-active']");
	public void delete()
	{ driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(delete).click();
	}
	
	By increase_quantity_cartpage = By.xpath("//button[@data-a-selector='increment' and @data-action='a-stepper-increment']");
	public void increase_quantity_cartpage(int i)
	{ driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (int c=1;c<i ;c++) {}
		driver.findElement(increase_quantity_cartpage).click();
	}

	By decrease_quantity_cartpage = By.xpath("//button[@data-a-selector='decrement' and @data-action='a-stepper-decrement']");
	By quantity_check = By.xpath("//span[@data-a-selector='value']");
	public void decrease_quantity_cartpage()
	{  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String x = driver.findElement(quantity_check).getText();
		int z = Integer.parseInt(x);
		
		if(z>1) 
		{
	       for(int i=1;i<z;z--)
		driver.findElement(decrease_quantity_cartpage).click();
	    }
	 }

	
	public void delete_by_decrease_quantity_cartpage()
	{   
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String x = driver.findElement(quantity_check).getText();
		int z = Integer.parseInt(x);
		
		if(z>1) 
		{
	       for(int i=1;i<=z;z--)
		driver.findElement(decrease_quantity_cartpage).click();
	    }
	 }
	
	
	
	By ProgressbarMSG =By.xpath("//*[@class='a-section a-spacing-top-micro sc-sss-box']");            // progress bar
	
	  public  void ProgressbarMSG()                                                                         //  progressbar message
	    { driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	boolean x= driver.findElement(ProgressbarMSG).isDisplayed();
	    	if (x== true)
	    		System.out.println(driver.findElement(ProgressbarMSG).getText());
	    }

	 By Proceed_To_CheckOut = By.xpath("//input[@name='proceedToRetailCheckout' and @value='Proceed to checkout']");
	 
	public void Proceed_To_CheckOut() throws InterruptedException                                                                         //Proceed to check out button
	 {
		 driver.findElement(Proceed_To_CheckOut).click();
		 Thread.sleep(5000);
		 
	 }
	    
	 By SSDPromise_check_CartPage= By.xpath("//div[@class='udm-delivery-block']");                     //SSD promise check in cart page
	public  void SSDPromise_check_CartPage()
	 { driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Promise_check_CartPage =driver.findElement(SSDPromise_check_CartPage).getText();
		System.out.println(Promise_check_CartPage);
	 }
}
