package HMS_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_HMS 
{
	@FindBy (name = "email")
	private WebElement usname;
	
	@FindBy (name = "password")
	private WebElement pass;
	
	@FindBy (xpath = "//button[@type = 'submit']")
	private WebElement lgin_btn;
	
	@FindBy (xpath = "//a[@href = '#']")
	private WebElement appt_dpdwn;
	
	public POM_HMS (WebDriver driver)
	{
		PageFactory.initElements (driver, this);
	}
	
	public void username (String data)
	{
		usname.sendKeys (data);
	}
	
	public void pwd (String data1)
	{
		pass.sendKeys(data1);
	}
	
	public void click_btn()
	{
		lgin_btn.click();
	}
	
	public void click_apptdpdwn()
	{
		appt_dpdwn.click();
	}
	

}
