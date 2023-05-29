package frameworkTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTest 
{
	@Test
	public void data1()
	{
		Reporter.log("3",true);
	}
	@Test
	public void data2()
	{
		Reporter.log ("4",true);
	}

}
