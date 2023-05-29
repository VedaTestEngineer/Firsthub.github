package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findtexter 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty ("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.xpath("//a[@title='Urdu']"));
		//WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Thread.sleep(2000);
		String t = ele.getText();
		System.out.println(t);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
