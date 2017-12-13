package script;

import page.LoginPage;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;

public class ValidLogin extends BaseTest {
	@Test(priority=1,groups="smoke")
	public void testValidLogin(){
		String un=Excel.getCellValue(XL_PATH,"ValidLogin",1,0);
		String pw=Excel.getCellValue(XL_PATH,"ValidLogin",1,1);
		String eTitle=Excel.getCellValue(XL_PATH,"ValidLogin",1,2);
		//Enter valid User Name
		LoginPage l=new LoginPage(driver); 
		l.setUserName(un);
		//Enter valid password
		l.setPassword(pw);
		//Click on login
		l.clickLogin();
		//verify that Home Page is Displayed
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyTitle(driver, eTitle);
	}
}

