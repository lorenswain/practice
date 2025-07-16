package testnggrouping;

import org.testng.annotations.Test;

public class group3 {
	@Test(priority= 1, groups= {"regression","sanity"})
	void AAA ()
	{
		System.out.println("regression testcase 5 passed");
	}
	
	@Test(priority= 2, groups= {"functional"})                               //both sanity & regression
	void BBB ()
	{
		System.out.println("functional testcase 5 passed");
	}
	
	@Test(priority= 3, groups= {"regression","sanity"})
	void CCC ()
	{
		System.out.println("regression testcase 6 passed");
	}

}
