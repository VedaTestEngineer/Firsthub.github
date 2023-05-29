package frameworkTestNG.Assertion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import frameworkTestNG.GenericScript;

public class PerformVerification extends GenericScript
{
     @Test
     public void validLogin () throws InterruptedException
     {
    	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hgveda1990@gmail.com");
    	 driver.findElement (By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")).click();
    	 driver.findElement (By.name("password")).sendKeys("veda1234");
    	 driver.findElement (By.xpath("//span[.='Next']")).click();
    	 Thread.sleep(2000);
    	 String title = driver.getTitle();
    	 System.out.println (title);
    	 
    	 
     }
}
