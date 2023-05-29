package qsp.ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expliciter 
{

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.findElement(By.name("email")).sendKeys("VedaRaj");
	  driver.findElement(By.name("pass")).sendKeys("1234");
	  driver.findElement(By.name("login")).click();
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.titleContains("Facebook"));
	  driver.findElement(By.xpath("//a[.='Friends']")).click();

	}

}
