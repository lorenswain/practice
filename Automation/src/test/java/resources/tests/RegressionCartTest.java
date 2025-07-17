package test.java.resources.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import main.java.methods.CartPage;
import main.java.methods.DetailPage;


@Test(groups = {"regression"})
public class RegressionCartTest extends BaseTest {
	
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
	@Test(priority=22)
	void Save_for_ltr_cart()
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_Above_Lego();
		dp.Add_to_Cart();
	    CartPage cp= new CartPage(driver);
	    cp.CartPage1();
	    cp.saveforlater();
	}
	@Test(priority=23)
	void Delete_fromCart()
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_Above_Lego();
		dp.Add_to_Cart();
	    CartPage cp= new CartPage(driver);
	    cp.CartPage1();
	    cp.delete();
	}
	@Test(priority=24)
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
	@Test(priority=25)
	void increase_Quantity_Cart() throws InterruptedException
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_belowLego();
		dp.Add_to_Cart();
	    CartPage cp= new CartPage(driver);
	    cp.CartPage1();
	    cp.increase_quantity_cartpage(3);cp.saveforlater();
	}
	@Test(priority=26)
	void decrease_Quantity_Cart() throws InterruptedException
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
	@Test(priority=27)
	void DeleteBy_decrease_Quantity_Cart() throws InterruptedException
	{DetailPage dp=new DetailPage(driver);
	dp.detail_Above_Lego();
	dp.Add_to_Cart();
    CartPage cp= new CartPage(driver);
    cp.CartPage1();
    cp.increase_quantity_cartpage(3);
    cp.delete_by_decrease_quantity_cartpage();
	}
	
	
	@Test(priority=28)
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
