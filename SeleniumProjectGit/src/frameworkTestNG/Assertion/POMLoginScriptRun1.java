package frameworkTestNG.Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginScriptRun1
{
	//declaration
	@FindBy (name = "email")
	private WebElement unTbox;
	@FindBy (name = "pass")
	private WebElement pwdTbox;
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement loginBtn;
	
	//initializtion
	public POM_Script (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void unData (String un)
	{
		unTbox.sendKeys(un);
	}
	public void pwdData (String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}

}
