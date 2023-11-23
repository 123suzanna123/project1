
package automationLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.By;

//import settings.Settings;
import testBase.webDriver;
//import testdata.tableData;

public class dbLogin extends webDriver {
	//Settings se = new Settings();
	
	public static dbLogin cha = null;
	public static dbLogin getInstance() throws Exception {
		try {
			if (cha == null) {
				cha = new dbLogin();
			}	
		} catch (Exception e) {
			throw new Exception("Exception while Initializing TestBase.", e);
		}
		return cha;
	}
public void LaunchWebExcel () throws Exception 

	{  
		//USING COFIG_LAUNCH WEB
		//String URL = se.getProperty("webURL");
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		/*System.out.println("driver initialised");
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	*/
		//driver.get("https://www.facebook.com/");

			//Thread.sleep(2000);		
		
	}
public void Flightfinder () throws Exception
{
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	
	//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	Select Passengers = new Select(driver.findElement(By.name("passCount")));
	Passengers.selectByVisibleText("3");
	
	Select Departingfrom = new Select(driver.findElement(By.name("fromPort")));
	Departingfrom.selectByVisibleText("London");
	
	
	Select On = new Select(driver.findElement(By.name("fromMonth")));
	On.selectByVisibleText("March");
	
	Select Ondate = new Select(driver.findElement(By.name("toDay")));
	Ondate.selectByVisibleText("2");
	
	
	Select Arrivingin = new Select(driver.findElement(By.name("toPort")));
	Arrivingin.selectByVisibleText("Paris");
	
	Select returning = new Select(driver.findElement(By.name("toMonth")));
	returning.selectByVisibleText("June");
	
	Select returningdate = new Select(driver.findElement(By.name("toDay")));
	returningdate.selectByVisibleText("10");
	
	driver.findElement(By.xpath("//input[@value='Business']")).click();
	
	Select Airline = new Select(driver.findElement(By.name("airline")));
	Airline.selectByVisibleText("Unified Airlines");
	
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
	
	
	
}
/*public void readDb () throws Exception 
{
	String eid_facebook[] = tableData.getInstance().retrieveDBValue("User");	 
	System.out.println("checking firstname in dblogin.java"+eid_facebook[1]);
	System.out.println(eid_facebook[1]);
	System.out.println(eid_facebook[0]);
	
	driver.findElement(By.name(eid_facebook[0])).sendKeys(eid_facebook[1]);

		//Reporter.log("Login checked using mysql database");
	
	String password_facebook[] = tableData.getInstance().retrieveDBValue("password");	
	System.out.println(password_facebook[1]);

	driver.findElement(By.id(password_facebook[0])).sendKeys(password_facebook[1]);
		//String clk[] = tableData.getInstance().retrieveDBValue("click");	
	//wdriver.findElement(By.xpath(clk[0])).click();
}
*/
}
