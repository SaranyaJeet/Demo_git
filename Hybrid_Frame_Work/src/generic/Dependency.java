package generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency
{
	@Test
	public void test1()
	{
		Reporter.log("hi");
	}
	@Test
	public void test2()
	{   
		Assert.fail();
		Reporter.log("hi1");
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		Reporter.log("hi2");
	}

}
