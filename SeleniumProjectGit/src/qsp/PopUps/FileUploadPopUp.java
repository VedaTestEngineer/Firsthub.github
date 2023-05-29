package qsp.PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kantharaj/Desktop/Export/fileupload.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\kantharaj\\Desktop\\Export\\Dropdown.html");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
