package ListenTC;

import org.testng.annotations.Test;

public class TestScript1 extends Base_Test
{
	@Test
	public void test1()
	{
		Pom1 p = new Pom1 (driver);
		p.usname ("");
		p.passPwd ("");
		p.clickBtn();
	}

}
