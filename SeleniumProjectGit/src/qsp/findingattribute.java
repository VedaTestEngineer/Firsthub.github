package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class findingattribute 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Thread.sleep(2000);
		String att = ele.getAttribute("href");
		System.out.println (att);
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
