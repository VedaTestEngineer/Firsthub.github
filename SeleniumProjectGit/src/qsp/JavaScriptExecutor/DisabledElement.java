package qsp.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement 
{

	public static void main(String[] args) throws InterruptedException
	{
     System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("file:///C:/Users/kantharaj/Desktop/Export/Disabled.html");
     Thread.sleep(2000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("document.getElementById('a1').value='world'");
     Thread.sleep(2000);
     js.executeScript("document.getElementById('a1').value=' ' ");
     Thread.sleep(2000);
     driver.quit();
     
	}

}
