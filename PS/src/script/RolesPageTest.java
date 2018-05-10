package script;

import java.util.Set;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.lib;
import pom.HomePage;
import pom.LoginPage;

public class RolesPageTest extends BaseTest {
	
	@Test(priority=3)
	public void rolesTab() throws InterruptedException {
Set<String> allWHS = driver.getWindowHandles();
		
		for(String wh:allWHS)
		{
		driver.switchTo().window(wh);
		}
			  int rc=lib.getRowCount(XL_PATH,"Sheet1");
			  for(int i=1;i<=rc;i++)
			  {
			  String un = lib.getCellValue(XL_PATH, "Sheet1",i, 0);
			  String pw=lib.getCellValue(XL_PATH, "Sheet1", i, 1);
			  
	  LoginPage p=new LoginPage(driver);
	  p.setUsername(un);
	  p.setPassword(pw);
	  p.clickLogin();
			  }
		
	for(int i=1;i<=rc;i++)
	  {
	  String date=lib.getCellValue(XL_PATH, "Sheet1",i,2);
	  String cname=lib.getCellValue(XL_PATH,"Sheet1",i,3);
      HomePage p1=new HomePage(driver);
      p1.clickCustManagement();
      p1.clickCreateBusiness();
      p1.clickRoles();
      p1.selectRoleType();
      p1.insAgencyLocation();
      Thread.sleep(2000);
      p1.clickBtn();
      p1.general();
      p1.agencTypeDropDown();
      p1.agencyType();
      p1.eoExpireDate(date);
      p1.contactName(cname);
      p1.appDetails();
      p1.AppDetailsAddBtn();
      p1.LOBDropDown();
      p1.LOBWorkComp();
      p1.LOBEffectiveDate(date);
      p1.LOBAppointmentStatus();
      p1.LOBAppStatus();
      p1.Save();
	  }	
}

}
