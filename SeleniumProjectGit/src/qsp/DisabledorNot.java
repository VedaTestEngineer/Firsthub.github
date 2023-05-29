package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledorNot 
{

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("file:///C:/Users/kantharaj/Desktop/Export/Disabled.html");
	 Thread.sleep(2000);
     driver.findElement(By.id("a1")).sendKeys("world");
	}

}
