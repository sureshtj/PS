package script;

import java.util.Set;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.lib;
import pom.HomePageGeneralTab;
import pom.LoginPage;

public class TestHomeGeneralPage extends BaseTest {
	
	@Test(priority=2)
	public void testHomeGeneral() {
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
			String countryname=lib.getCellValue(XL_PATH, "Sheet1",i,4);
			String businessname=lib.getCellValue(XL_PATH, "Sheet1",i,5);
			String date=lib.getCellValue(XL_PATH, "Sheet1",i,6);
			String taxidinfo=lib.getCellValue(XL_PATH, "Sheet1",i,7);
			
			HomePageGeneralTab ht=new HomePageGeneralTab(driver);
			ht.custManage();
			ht.createBusi();
			ht.generalTab();
			ht.country(countryname);
			ht.busiName(businessname);
			ht.effctivedate(date);
			ht.taxId(taxidinfo);
			ht.Save();
		}
		
	}
	

}
