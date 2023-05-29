package qsp.PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;

public class HiddenDivisionPopUp 
{

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.redbus.com/");
	  Thread.sleep(5000);
	  driver.findElement(By.id("return-box")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//span[.='3'])[1]")).click();
	  Thread.sleep(2000);
	  driver.quit();

	}

}
