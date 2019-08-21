package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RunTimeTests 
{
	//Test Cases for Run Time Retry Logic.
	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
 
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3()
	{
		Assert.assertEquals(true, true);
	}
}
