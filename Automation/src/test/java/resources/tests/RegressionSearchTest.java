package test.java.resources.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.methods.SearchPage;

@Test(groups = {"regression"})
public class RegressionSearchTest extends BaseTest{


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
	
	
	
}
