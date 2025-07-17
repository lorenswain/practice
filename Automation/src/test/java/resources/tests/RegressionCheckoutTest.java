package test.java.resources.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.methods.CartPage;
import main.java.methods.DetailPage;
import main.java.methods.checkoutPage;

@Test(groups = {"regression"})
public class RegressionCheckoutTest extends BaseTest {
	
	
		@Test(priority=31)
		void CheckoutPage_Above_Lego() throws InterruptedException
		{
				DetailPage dp=new DetailPage(driver);
				dp.detail_Above_Lego();
				dp.Add_to_Cart();
			    CartPage cp= new CartPage(driver);
			    cp.CartPage1();	
			    cp.Proceed_To_CheckOut();
			    checkoutPage cop= new checkoutPage(driver);
			    cop.Delivery_promise_checkout();
			    boolean x= cop.AboveFst_rush_option_RadioBTN_checkout();
			    Assert.assertTrue(x);
			    System.out.println("rush selected");
			  
		}
		@Test(priority=32)
		void CheckoutPage_Below_lego() throws InterruptedException
		{
				DetailPage dp=new DetailPage(driver);
				dp.detail_belowLego();
				dp.Add_to_Cart();
			    CartPage cp= new CartPage(driver);
			    cp.CartPage1();	
			    cp.Proceed_To_CheckOut();
			    checkoutPage cop= new checkoutPage(driver);
			    cop.Delivery_promise_checkout();
			    boolean x= cop.BelowFst_1DC_option_RadioBTN_checkout();
			    Assert.assertTrue(x);System.out.println("1DC selected successfully");
			    cop.BelowFst_rush_option_RadioBTN();
			    System.out.println("Rush clicked successfully");	
			    cop.Increase_quantity_checkout(3);
		}
		@Test(priority=33)
		void CheckoutPage_Below_lego_increaseQuantity() throws InterruptedException
		{
				DetailPage dp=new DetailPage(driver);
				dp.detail_belowLego();
				dp.Add_to_Cart();
			    CartPage cp= new CartPage(driver);
			    cp.CartPage1();	
			    cp.Proceed_To_CheckOut();
			    checkoutPage cop= new checkoutPage(driver);
			    cop.Delivery_promise_checkout();
			    boolean x= cop.BelowFst_1DC_option_RadioBTN_checkout();
			    Assert.assertTrue(x);System.out.println("1DC selected successfully");
			    cop.Increase_quantity_checkout(3); 
			    boolean z= cop.AboveFst_rush_option_RadioBTN_checkout();
			    Assert.assertTrue(z); 
			    System.out.println("Rush clicked successfully");
		}
		
	

}
