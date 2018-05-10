package script;


import java.util.Set;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.lib;
import pom.HomePage;
import pom.LoginPage;

public class TestLoginPage extends BaseTest {
	
	
	@Test(priority=1)
	  public void testValidLogin() throws InterruptedException{
		Set<String> allWHS = driver.getWindowHandles();
		
			for(String wh:allWHS)
			{
			driver.switchTo().window(wh);
			}
				  int rc=lib.getRowCount(XL_PATH,"Sheet1");
				  System.out.println(rc);
				  for(int i=1;i<=rc;i++)
				  {
				  String un = lib.getCellValue(XL_PATH, "Sheet1",i, 0);
				  String pw=lib.getCellValue(XL_PATH, "Sheet1", i, 1);
				  
		  LoginPage p=new LoginPage(driver);
		  p.setUsername(un);
		  p.setPassword(pw);
		  p.clickLogin();
		  System.out.println("hi");
				  }	  
		
				  }
}
