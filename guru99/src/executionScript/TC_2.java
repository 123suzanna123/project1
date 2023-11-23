
package executionScript;

import org.testng.annotations.Test;

import automationLibrary.dbLogin;

public class TC_2 {
  @Test
//Login page navigation check	
		public void Flightfinder () throws Exception
		{   
				
		dbLogin.getInstance().Flightfinder();
		//system.out.println("my code is wrkon");
		//Excelclass.getInstance().LaunchWebConfig();
			Thread.sleep(1000);
			
	}
  
}
