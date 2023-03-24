package week7day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import week7day1.Excelldata;

public class BaseClass {
	
	public ChromeDriver driver;
	public String filename;
	@Parameters({"url"})
	@BeforeMethod
	public void preCondition(String url) throws InterruptedException
	{
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		
}

@AfterMethod
public void postCondition()
{
	driver.close();
	
}
@DataProvider(name="fetchData")
public String[][] sendData() throws IOException {
	return Excelldata.readdata(filename);
	
}
}
