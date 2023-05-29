package qsp.Dropdowns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class GetTextOfOptions 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kantharaj/Desktop/Export/Dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("Shree Sagar"));
		Thread.sleep(2000);
		Select s = new Select (ele);
		List<WebElement> opt = s.getOptions();
		/*int count = opt.size();
		for (int i=0; i<count;i++)
		{
			WebElement we = opt.get(i);
			String t = we.getText();
			System.out.println (t);
		}*/
		for (WebElement we : opt)
		{
			String t = we.getText();
			System.out.println(t);
		}
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
