
package executionScript;

import org.testng.annotations.Test;

import automationLibrary.dbLogin;
import testBase.webDriver;

public class TC_1 extends webDriver {
  @Test
  public void LaunchWebExcel () throws Exception
	{   
	System.out.println("my code is wrkon");
	dbLogin.getInstance().LaunchWebExcel();
	//System.out.println("my code is wrkon");
	//Excelclass.getInstance().LaunchWebConfig();
		//Thread.sleep(1000);
		
}
  
}
