package testnggrouping;

import org.testng.annotations.Test;

public class group1 {
	
	@Test(priority= 1, groups= {"sanity"})
	void A ()
	{
		System.out.println("sanity testcase 1 passed");
	}
	
	@Test(priority= 2, groups= {"regression"})
	void b ()
	{
		System.out.println("regression testcase 1 passed");
	}
	
	@Test(priority= 3, groups= {"sanity"})
	void c ()
	{
		System.out.println("sanity testcase 2 passed");
	}

}
