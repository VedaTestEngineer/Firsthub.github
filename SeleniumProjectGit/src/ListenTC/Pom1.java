package ListenTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom1 extends Base_Page
{
	@FindBy (id = "email")
    private WebElement usname;
	
	@FindBy (name = "pass")
	private WebElement pass;
	
	@FindBy (name = "Login")
	private WebElement lgin_btn;
	
	public Pom1 (WebDriver driver)
	{
		super(driver);
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
