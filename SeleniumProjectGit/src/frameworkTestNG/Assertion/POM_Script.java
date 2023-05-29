package frameworkTestNG.Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script 
{
	//declaration
	@FindBy (xpath = "//button[@name='login']")
	private WebElement loginBtn;

	//initializtion
	public POM_Script (WebDriver driver)
	{
		PageFactory.initElements (driver,this);
	}
	
	//utilization
	public void clickLogin()
	{
		loginBtn.click();
	}
}

