package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class facing 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("VedaKantharaj");
		driver.findElement(By.name("pass")).sendKeys("VedaKantharaj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		

	}

}
