package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktag 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty ("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("VedaKantharaj");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@value='1' and @name='login']")).click();
		

	}

}
