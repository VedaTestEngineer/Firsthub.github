package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mapper 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/@13.0668461,77.5078374,15z");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-controls='sbsg51']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-controls='sbsg52']")).sendKeys("Mysore");
		driver.findElement(By.xpath("//button[@class='mL3xi']")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
