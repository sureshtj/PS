package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BaseTest;




public class LoginPage extends BaseTest{
	@FindBy(id="iloginId")
	private WebElement unTB;
	@FindBy(id="ipassword")
	private WebElement pwTB;
	@FindBy(id="iloginButton")
	private WebElement loginBtn;
	@FindBy(id="ilogout1")
	private WebElement logoutBtn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setUsername(String un)
	{
		verifyElement(unTB);
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		verifyElement(pwTB);
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		verifyElement(loginBtn);
		loginBtn.click();
	}
	public void verifyHomePageisDisplayed()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try {
			wait.until(ExpectedConditions.visibilityOf(logoutBtn));
			Reporter.log("PASS : Home page is displayed",true);
		}
		catch(Exception e){
			Reporter.log("FAIL : Home page is not displayed",true);
			takesScreenShot();
			Assert.fail();
			
		}
	}
}
