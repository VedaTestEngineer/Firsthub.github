package frameworkTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest 
{
	@Test
	public void data1()
	{
		Reporter.log("1",true);
	}
	@Test
	public void data2()
	{
		Reporter.log("2",true);
	}

}
