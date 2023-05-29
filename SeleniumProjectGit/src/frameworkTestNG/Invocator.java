package frameworkTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocator 
{
	@Test (invocationCount = 3, priority = 1)
	public void data1()
	{
		Reporter.log("1", true);
	}
	
	@Test (invocationCount = 2, priority = 2)
	public void data2()
	{
		Reporter.log("2", true);
	}
	
	@Test
	public void data3()
	{
		Reporter.log ("3", true);
	}

}
