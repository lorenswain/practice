package test.java.resources.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import main.java.methods.DetailPage;
@Test(groups = {"regression"})
public class RegressionDetailTest extends BaseTest {
	
	
	//above fst
	
	@Test(priority=11)
	void detailpage__Above_SSD_msg()
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_Above_Lego();
		dp.Movingto_AboveFST_detailpage();
		
	}
	@Test(priority=12)
		void detailpage_SSD_msg_after_increase_quantity()
		{
		DetailPage dp=new DetailPage(driver);
		dp.increaseQuantity(3);
		dp.buy_box_promise_Detailpage();
	}
	
	@Test(priority=13)
		void detailpage_SSD_msg_after_decrease_quantity()
		{
		DetailPage dp=new DetailPage(driver);
		dp.increaseQuantity(1);
		
		dp.buy_box_promise_Detailpage();
	}
	
	@Test(priority=14)
	void detailpage_addtoCart()
	{
	DetailPage dp=new DetailPage(driver);
	dp.Add_to_Cart();
	
}
	@Test(priority=15)
	void detailpage_Buy_now()
	{
	DetailPage dp=new DetailPage(driver);
	dp.detail_Above_Lego();
	dp.Buy_Now();
	
}
	
// Below fst
	
	@Test(priority=16)
	void detailpage_Below_SSD_msg() throws InterruptedException
	{
		DetailPage dp=new DetailPage(driver);
		dp.detail_belowLego();;
		dp.Movingto_BelowFST_detailpage();
		
	}
	@Test(priority=17)
		void detailpage_belowTo_Above_after_increase_quantity()
		{
		DetailPage dp=new DetailPage(driver);
		dp.increaseQuantity(3);
		dp.buy_box_promise_Detailpage();
	}
	
	@Test(priority=18)
		void detailpage_aboveTo_Below_SSD_msg_after_decrease_quantity()
		{
		DetailPage dp=new DetailPage(driver);
		dp.increaseQuantity(1);
		dp.buy_box_promise_Detailpage();
	}
	
	@Test(priority=19)
	void detailpage_BelowFST_addtoCart()
	{
	DetailPage dp=new DetailPage(driver);
	dp.Add_to_Cart();
	
}
	@Test(priority=20)
	void detailpage_BelowFST_Buy_now()
	{
	DetailPage dp=new DetailPage(driver);
	dp.detail_belowLego();
	dp.Buy_Now();
	
}
	
	 

	
}