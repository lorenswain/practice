package testnggrouping;

import org.testng.annotations.Test;

public class group2 {
	
	@Test(priority= 1, groups= {"regression"})
	void AA ()
	{
		System.out.println("regression testcase 2 passed");
	}
	
	@Test(priority= 2, groups= {"sanity"})
	void BB ()
	{
		System.out.println("sanity testcase 3 passed");
	}
	
	@Test(priority= 3, groups= {"regression"})
	void CC ()
	{
		System.out.println("regression testcase 3 passed");
	}

}
