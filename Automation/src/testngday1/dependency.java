package testngday1;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

//open app
// login
// search
//adv search
//logout



public class dependency {
	
	@Test(priority=1)
	
	void openapp()
	{
		System.out.println("openapp");
		Assert.assertTrue(true);
	}
	
	
    @Test(priority=2, dependsOnMethods ="openapp")
	
	void login()
	{
	System.out.println("login");
	Assert.assertTrue(false);
	}
    
    
    @Test(priority=3, dependsOnMethods ="login")

          void search(){
	    System.out.println("search");}
    
    
  @Test(priority=4, dependsOnMethods ="search")
         void advsearch(){
	      System.out.println("adv search" );}
  
  
   @Test(priority=5, dependsOnMethods ="advsearch")

       void logout(){
	System.out.println("logout");}

}
