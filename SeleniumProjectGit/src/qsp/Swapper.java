package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;



public class Swapper 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kantharaj/Desktop/Export/Swap.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("a1"));
		WebElement ele1 = driver.findElement(By.id("a2"));
		WebElement ele2 = driver.findElement(By.id("a3"));
		ele.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"v");
	}

}
