package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckCustCompURL 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String cust = "https://www.facebook.com/";
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String comp = driver.getCurrentUrl();
		
		if (cust.equals(comp))
		{
			System.out.println ("PASS");
		}
		else
		{
			System.out.println ("FAIL");
		}
		

	}

}
