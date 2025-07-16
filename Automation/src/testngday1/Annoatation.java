package testngday1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* Testcase
 *  login
 * search
 * logout
 * login
 * adv search
 * logout
 * */




public class Annoatation {
	
	@BeforeTest
	void beforetest()
	{
		System.out.println("before test");
	}
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("before suite");
	}
	
	@AfterTest
	void aftertest()
	{
		System.out.println("after test");
	}
	@AfterSuite
	void aftersuite()
	{
		System.out.println("after suite");
	}
	
	@Test
	
	static void search()
	{
		System.out.println("Search");
	}
    
     @Test
	
	static void Advancesearch()
	{
    	 System.out.println(" ADV Search");
	}
	
     @BeforeMethod
     
     static void login()
     {
    	 System.out.println("login before method");
     }
	
	
     @AfterMethod
     
     static void logout()
     {
    	 System.out.println("logout after method");
     }
	
 @BeforeClass
     
     static void login1()
     {
    	 System.out.println("login before class");
     }
	
	
     @AfterClass
     
     static void logout1()
     {
    	 System.out.println("logout after class");
     }
	
     
     
}
