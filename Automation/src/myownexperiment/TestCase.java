package myownexperiment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
	
	WebDriver driver;
		
	@BeforeClass
	void Setup()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_youraccount_switchacct&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&_encoding=UTF8&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	void Login()
	{
		LoginPage lp= new LoginPage(driver);
		lp.LoginAmazon("dex-ssd-qa-mtest+p+0-1744104414362iZFa@amazon.com","testtest");
		Assert.assertTrue(true);System.out.println("login success");
	}
	@Test(priority=1, dependsOnMethods = "Login")
	
	void SearchandPrimecheck()
	{
		SearchPage SP= new SearchPage(driver);
		SP.languageSETbymoseover();
		SP.PrimecheckandSearchAsin();
		
		SP.search();
		Assert.assertTrue(true);System.out.println("SearchandPrimecheck success");
	}

	@Test(priority=2,dependsOnMethods = "SearchandPrimecheck")
	void detailpage() throws InterruptedException
	{
		DetailPage DP= new DetailPage(driver);
		DP.detail_Above_Lego();
		
		DP.Movingto_AboveFST_detailpage();
		DP.increaseQuantity(2);
		DP.Add_to_Cart();

	}
	
	@Test(priority=3,dependsOnMethods = "detailpage")
	void CartPage() throws InterruptedException
	{
	
		CartPage CP =new CartPage(driver);
	    CP.CartPage1();
	    CP.ProgressbarMSG();
	    CP.SSDPromise_check_CartPage();
	    CP.Proceed_To_CheckOut();
	
	}
	
	@Test(priority=3, dependsOnMethods = "CartPage")
	void checkout() throws InterruptedException
	{
	
		checkoutPage CPP=new checkoutPage(driver);
		CPP.Delivery_promise_checkout(); 
		

		
		boolean enable =  CPP.AboveFst_rush_option_RadioBTN_checkout();    //above FST
		Assert.assertTrue(enable, "above fst checkout Fail");              //Above Fst
				
//		boolean enable1DC =  CPP.BelowFst_1DC_option_RadioBTN_checkout();   //Below FST
//		Assert.assertTrue(enable1DC , "above fst checkout Fail");         //Below FST
	}
	
	@Test(priority=200)
	void quit() 
	{
		CartPage CP =new CartPage(driver);
		CP.CartPage1();
		CP.saveforlater();
		
	//driver.quit();
	}
}
