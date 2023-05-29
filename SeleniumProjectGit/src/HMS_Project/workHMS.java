package HMS_Project;

import org.testng.annotations.Test;

public class workHMS extends launchHMS
{
	@Test
	public void validLogin() throws InterruptedException
	{
		POM_HMS  p = new POM_HMS (driver);
		p.username ("divya@gmail.com");
		Thread.sleep(2000);
		p.pwd ("123456");
		Thread.sleep(2000);
		p.click_btn();
		Thread.sleep(5000);
		p.click_apptdpdwn();
		Thread.sleep(2000);
		
		
	}

}
