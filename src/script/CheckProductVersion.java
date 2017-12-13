package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class CheckProductVersion extends BaseTest{

	@Test(priority=3,groups="version")
	public void testCheckProductVersion(){
		String sheet="CheckProductVersion";
		String un=Excel.getCellValue(XL_PATH, sheet,1,0);
		String pw=Excel.getCellValue(XL_PATH, sheet, 1,1);
		String eVersion=Excel.getCellValue(XL_PATH, sheet,1,2);
		//Enter valid User Name
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//Enter valid password
		l.setPassword(pw);
		//Click on login
		l.clickLogin();
		//Click on Help
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clickHelp();
		//Click on About ActiTIME
		e.clickAboutActiTIME();
		//Verify the Product version
		e.verifyVersion(eVersion);
		//Click on Close Button
		e.clickClose();
		//Click on Logout
		e.clickLogout();
	}
}
