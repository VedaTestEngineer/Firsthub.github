package frameworkTestNG.Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Basic_Frame_Work 
{
	@FindBy (id = "email")
    private WebElement usname;
	
	@FindBy (name = "pass")
	private WebElement pass;
	
	@FindBy (name = "Login")
	private WebElement lgin_btn;
	
	public Pom (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username (String data)
	{
		usname.sendKeys(data);
	}
	
	public void pwd (String data1)
	{
		pass.sendKeys(data1);
	}
	
	public void click_btn()
	{
		lgin_btn.click();
	}
}
