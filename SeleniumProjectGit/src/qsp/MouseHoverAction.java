package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty ("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("(//div[.='Fashion'])[4]"));
		Actions act = new Actions (driver);
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
