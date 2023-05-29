package qsp.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOverThrice 
{

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.in/");
      Thread.sleep(2000);
      JavascriptExecutor js = (JavascriptExecutor) driver;
      for (int i=0; i<3; i++)
      {
      js.executeScript("window.scrollBy(0,500)");
      Thread.sleep(2000);
      }
      Thread.sleep(2000);
      for (int i=0; i<3; i++)
      {
      js.executeScript("window.scrollBy(0,-500)");
      Thread.sleep(2000);
      }
      Thread.sleep(2000);
      driver.quit();
      

	}

}
