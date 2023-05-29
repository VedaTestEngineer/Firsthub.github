package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instatag 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username' and @type='text']")).sendKeys("veda");
		driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("veda");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
