package Amazon_webpage_TestCase_Testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import amazon_webpage_testing.CartPage;
import amazon_webpage_testing.DetailPage;



public class Regression_Cart {
	
	WebDriver driver;
	@Test(priority=21)
	
	void CartPage() throws InterruptedException
	{
			DetailPage dp=new DetailPage(driver);
			dp.detail_Above_Lego();
			dp.Add_to_Cart();
		    CartPage cp= new CartPage(driver);
		    cp.CartPage1();	
		    cp.saveforlater();
	}
	
	void Save_for_ltr_cart()
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_Above_Lego();
		dp.Add_to_Cart();
	    CartPage cp= new CartPage(driver);
	    cp.CartPage1();
	    cp.saveforlater();
	}
	void Delete_fromCart()
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_Above_Lego();
		dp.Add_to_Cart();
	    CartPage cp= new CartPage(driver);
	    cp.CartPage1();
	    cp.delete();cp.saveforlater();
	}
	
	void Progressbar_message_cart() {
		DetailPage dp=new DetailPage(driver);
		dp.detail_Above_Lego();
		dp.Add_to_Cart();
	    CartPage cp= new CartPage(driver);
	    cp.CartPage1();
	    cp.ProgressbarMSG();
	    cp.SSDPromise_check_CartPage();
	    cp.saveforlater();
		
	}
	
	void increase_Quantity_Cart()
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_belowLego();
		dp.Add_to_Cart();
	    CartPage cp= new CartPage(driver);
	    cp.CartPage1();
	    cp.increase_quantity_cartpage(3);cp.saveforlater();
	}
	
	void decrease_Quantity_Cart()
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_belowLego();
		dp.Add_to_Cart();
	    CartPage cp= new CartPage(driver);
	    cp.CartPage1();
	    cp.increase_quantity_cartpage(3);
	    cp.ProgressbarMSG();
	    cp.SSDPromise_check_CartPage();
	    cp.decrease_quantity_cartpage();
	    cp.ProgressbarMSG();cp.saveforlater();
	}
	
	void DeleteBy_decrease_Quantity_Cart()
	{DetailPage dp=new DetailPage(driver);
	dp.detail_Above_Lego();
	dp.Add_to_Cart();
    CartPage cp= new CartPage(driver);
    cp.CartPage1();
    cp.increase_quantity_cartpage(3);
    cp.delete_by_decrease_quantity_cartpage();
    cp.saveforlater();
    
		
	}
	void Proceed_to_checkoutFrom_Cart() throws InterruptedException
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_Above_Lego();
		dp.Add_to_Cart();
	    CartPage cp= new CartPage(driver);
	    cp.CartPage1();
	    cp.Proceed_To_CheckOut();
		
	}
	
}
