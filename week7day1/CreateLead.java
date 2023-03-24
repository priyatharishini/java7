package week7day1;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;







public class CreateLead extends BaseClass {
	String[][] data;
	@BeforeClass
	public void setfileName()
	{
		 filename = "create";
	}
@Test(dataProvider = "fetchData")
	public  void runCreate(String cname,String fname,String lname,String phno) {
	driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		

//@DataProvider(name="fetchData")
//public String[][] SendData() throws IOException
//{
//	 data=new String[2][4];
//	data[0][0]="TL";
//	data[0][1]="pooja";
//	data[0][2]="R";
//	data[0][3]="99";
//	
//	
//	
//	data[1][0]="CTS";
//	data[1][1]="ram";
//	data[1][2]="S";
//	data[1][3]="98";
//	return data;
//	
	//Exceldata data=new Exceldata();
	//String[][] readData = Exceldata.readData();		
	//return readData;		
//return Excelldata.readdata("create");
}
}






