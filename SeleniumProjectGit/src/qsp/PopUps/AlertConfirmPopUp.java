package qsp.PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class AlertConfirmPopUp 
{

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  Thread.sleep(5000);
	  driver.findElement(By.name("cusid")).sendKeys("123");
	  Thread.sleep(2000);
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  Alert a = driver.switchTo().alert();
	  a.accept();
	  Thread.sleep(2000);
	  driver.quit();
	  
	  

	}

}
