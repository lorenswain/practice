package testngday1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {
	
	
	@Test
	
	void chexkxlass()
	{
		Annoatation an = new Annoatation();
				an.search();
				an.Advancesearch();
				
	}
	
	
	
	
	@Test
	
	void testtitle()
	{
		String x = "abcd";
		String y = "abcd";
		
	// Assert.assertEquals(x, y);
		
		if(x.equals(y))
		{
			System.out.println("pass");
			Assert.assertTrue(true);}		
		else {
			System.out.println("false");
		Assert.assertTrue(false);
	}
		}
	
	}

