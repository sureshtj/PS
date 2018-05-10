package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {
	@FindBy(id="iloginId")
	private WebElement unTB;
	@FindBy(id="ipassword")
	private WebElement pwTB;
	@FindBy(id="iloginButton")
	private WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}
	
}
