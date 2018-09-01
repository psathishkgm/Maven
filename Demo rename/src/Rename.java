import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rename {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		System.out.println("Successfully launced browser");
	}
	@Test
	public void Test4() throws InterruptedException
	{
		driver.findElement(By.id("lst-ib")).sendKeys("Dhoni");
		Thread.sleep(6000);
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}	
}
