package Amazon_webpage_TestCase_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amazon_webpage_testing.LoginPage;
import amazon_webpage_testing.SearchPage;

public class Regression_serach {
	WebDriver driver;
	
	
	@BeforeClass()
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_youraccount_switchacct&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&_encoding=UTF8&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		LoginPage lp= new LoginPage(driver);
		
		lp.LoginAmazon("dex-ssd-qa-mtest+p+0-1744104414362iZFa@amazon.com","testtest");
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	 void landingSearchpage_lego()
	 {
		SearchPage sp= new SearchPage(driver);
		sp.search();
	//	sp.languageSETbymoseover();
		boolean x=sp.PrimecheckandSearchAsin();
		Assert.assertTrue(x, "This is an Nonprime account. So can't procced");
		
	
	 }
	
	@Test(priority=2)
	void get_DDS_filter()
	{
		SearchPage sp= new SearchPage(driver);
		sp.get_DDS_filter();
	    sp.get_it_today();
        sp.get_it_tomorrow();
        Assert.assertTrue(true);
	}
	@Test   (priority=3)
     void get_SSD_filter() {  
    	 SearchPage sp= new SearchPage(driver);
		sp.get_SSD__filter();
		sp.select_SSD_Filter2();
		sp.select_SSD_Filter1();
		Assert.assertTrue(true);
	}
	
	@AfterClass
	void quit() {
		driver.quit();
	}
	
	
}
