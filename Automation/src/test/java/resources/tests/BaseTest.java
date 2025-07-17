package test.java.resources.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import main.java.methods.LoginPage;

public class BaseTest {

	protected static WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_youraccount_switchacct&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&_encoding=UTF8&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		LoginPage lp= new LoginPage(driver);

		lp.LoginAmazon("dex-ssd-qa-mtest+p+0-1744104414362iZFa@amazon.com","testtest");
		driver.manage().window().maximize();
	}

//	@AfterClass(alwaysRun = true)
//	public void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}

}
