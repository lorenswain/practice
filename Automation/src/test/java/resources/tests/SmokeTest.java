package test.java.resources.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.java.methods.CartPage;
import main.java.methods.DetailPage;
import main.java.methods.LoginPage;
import main.java.methods.SearchPage;
import main.java.methods.checkoutPage;

public class SmokeTest{
	WebDriver driver;
	
	
	  @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_youraccount_switchacct&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&_encoding=UTF8&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	

		LoginPage lp= new LoginPage(driver);
		lp.LoginAmazon("dex-ssd-qa-mtest+p+0-1744104414362iZFa@amazon.com","testtest");
		driver.manage().window().maximize();
		 System.out.println("✅ Login successful");
	        Assert.assertTrue(true);
	        SearchPage ms= new SearchPage(driver);
	        ms.languageSETbymoseover();
	        boolean prime = ms.PrimecheckandSearchAsin();Assert.assertTrue(prime,"prime logo not observed fail");
	}
	  
	  @Test(priority=0)
	  void abovefst_LEGO_serachtocheckout() throws InterruptedException
	  {  System.out.println("lego above start");
		  DetailPage DP=new DetailPage(driver);
		  DP.detail_Above_Lego();
		  DP.Movingto_AboveFST_detailpage();
		  DP.Add_to_Cart();
		  CartPage cp= new CartPage(driver);
		  cp.CartPage1();
		  cp.Proceed_To_CheckOut();
		  
			checkoutPage CPP=new checkoutPage(driver);
			CPP.Delivery_promise_checkout(); 
			boolean enable =  CPP.AboveFst_rush_option_RadioBTN_checkout();    //above FST
			Assert.assertTrue(enable, "above fst checkout Fail"); 
			cp.CartPage1();
			cp.saveforlater();
			 System.out.println("lego above end");
	  }
	  @Test(priority=2, dependsOnMethods = "abovefst_LEGO_serachtocheckout")
	  void abovefst_GC_serachtocheckout() throws InterruptedException
	  { System.out.println("GC above start");
		  DetailPage DP=new DetailPage(driver);
		  DP.AboveFst1_GC_URL();
		  DP.Movingto_AboveFST_detailpage();
		  DP.Add_to_Cart();
		  CartPage cp= new CartPage(driver);
		  cp.CartPage1();
		  cp.Proceed_To_CheckOut();
		  checkoutPage CPP=new checkoutPage(driver);
			CPP.Delivery_promise_checkout(); 
			boolean enable =  CPP.AboveFst_rush_option_RadioBTN_checkout();    //above FST
			Assert.assertTrue(enable, "above fst checkout Fail"); 
			cp.CartPage1();
			cp.saveforlater();
		 
			System.out.println("GC above end");
	  }
	 
	  @Test(priority=3)
	  void Belowfst_LEGO_serachtocheckout() throws InterruptedException
	  { System.out.println("lego below start");
		  DetailPage DP=new DetailPage(driver);
		  DP.detail_belowLego();
		  DP.Movingto_AboveFST_detailpage();
		  DP.Add_to_Cart();
		  CartPage cp= new CartPage(driver);
		  cp.CartPage1();
		  cp.Proceed_To_CheckOut();
		  checkoutPage CPP=new checkoutPage(driver);
			CPP.Delivery_promise_checkout(); 
			boolean enable = CPP.BelowFst_1DC_option_RadioBTN_checkout();   //above FST
			Assert.assertTrue(enable, "above fst checkout Fail"); 
			cp.CartPage1();
			cp.saveforlater();
			System.out.println("lego below end");
	  }
	  
	  @Test(priority=4,dependsOnMethods = "Belowfst_LEGO_serachtocheckout")
	  void Belowfst_GC_serachtocheckout() throws InterruptedException
	  { System.out.println("GC below start");
		  DetailPage DP=new DetailPage(driver);
		  DP.BleowFst1_GC_URL();
		  DP.Movingto_AboveFST_detailpage();
		  DP.Add_to_Cart();
		  CartPage cp= new CartPage(driver);
		  cp.CartPage1();
		  cp.Proceed_To_CheckOut();
		  checkoutPage CPP=new checkoutPage(driver);
			CPP.Delivery_promise_checkout(); 
			boolean enable =    CPP.AboveFst_rush_option_RadioBTN_checkout();    //above FST
			Assert.assertTrue(enable, "above fst checkout Fail"); 
			cp.CartPage1();
			cp.saveforlater();
			System.out.println("GC below end");
	  }
	  


}


