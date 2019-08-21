package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLevelTests 
{
	//Applying Retry Logic On Test Level.
	@Test(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
 
	@Test(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Test3()
	{
		Assert.assertEquals(true, true);
	}
}
