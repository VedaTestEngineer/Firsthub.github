package ListenTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class Base_Page 
{
	public WebDriver driver;
	public Base_Page (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}



@DataProvider (name = "testdata")
public Object [] [] createData1()
{
	return new Object [] []
			{
		{"Santhosh","1234"},
		{"Pavan","4568"}
			};
}
}