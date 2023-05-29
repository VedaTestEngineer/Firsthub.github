package qsp.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Filler 
{

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.uitestpractice.com/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[.='Form']")).click();
		  driver.findElement(By.id("firstname")).sendKeys("Veda");//firstname
		  driver.findElement(By.id("lastname")).sendKeys("Kantharaj");//lastname
		  driver.findElement(By.xpath("//input[@name='optradio']/../../label[2]")).click();//married radio
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@value='read']")).click();//reading radio
		  Thread.sleep(2000);
		  WebElement ele = driver.findElement(By.xpath("//select[@id='sel1']"));
		  Select s = new Select(ele);
		  s.selectByVisibleText("India");
		  Thread.sleep(2000);
		  driver.findElement(By.id("datepicker")).click();
		  WebElement ele1 = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		  Select s1 = new Select(ele1);
		  s1.selectByVisibleText("Jan");
		  Thread.sleep(2000);
		  WebElement ele2 = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		  Select s2 = new Select(ele2);
		  s2.selectByVisibleText("1990");
		  driver.findElement(By.xpath("//a[.='9']")).click();
		  driver.findElement(By.id("phonenumber")).sendKeys("7337785319");
		  Thread.sleep(2000);
		  driver.findElement(By.id("username")).sendKeys("VedaKantharaj");
		  Thread.sleep(2000);
		  driver.findElement(By.id("email")).sendKeys("hgveda1990@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.id("comment")).sendKeys("I am a learner");
		  Thread.sleep(2000);
		  driver.findElement(By.id("pwd")).sendKeys("1234abcd");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[.='Submit']")).click();
		  
		  
		  

	}

}
