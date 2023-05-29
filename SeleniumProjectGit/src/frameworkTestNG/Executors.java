package frameworkTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Executors extends GenericScript
{
	@Test
	public void flippi() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Bhagavad Gita");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='Bhagavad Gita As It Is (English, Hardcover, A. C. Bhakt...']")).click();
		
	}
	
	@Test
	public void Amaze()
	{
		driver.findElement(By.xpath(""))
	}

}
