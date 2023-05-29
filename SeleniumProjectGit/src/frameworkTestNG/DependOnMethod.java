package frameworkTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethod 
{
	@Test
	public void compose()
	{
		Reporter.log("compose", true);
	}
	
	@Test (dependsOnMethods = "compose")
	public void sentItems()
	{
		Reporter.log("sent items", true);
		Assert.fail();
	}
	
	@Test (dependsOnMethods = "sentItems")
	public void trash()
	{
		Reporter.log("trash", true);
	}
	

}
