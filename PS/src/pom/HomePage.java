package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePage extends BaseTest{
	@FindBy(id="ii_customer_portletcustomers1Caption1")
	private WebElement custManage;
	@FindBy(xpath="//button[@id='ii_customer_portletcustomers1RoomNavitem3']")
	private WebElement createBusi;
	@FindBy(xpath="//span[@title='Roles']")
	private WebElement Roles;
	@FindBy(xpath="//a[@id='iiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1roleType-btn']/i")
	private WebElement RolTypeDropDown;
	@FindBy(xpath="//ul/li[7]/span[2]")
	private WebElement insAgencylocation;
	@FindBy(id="iiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1addRole")
	private WebElement addButton;
	@FindBy(xpath="(//span[@title='General'])[2]")
	private WebElement General;
	@FindBy(xpath="//a[@id='iiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_agentagencygenerals1agencyType-btn']/i")
	private WebElement AgencyTypeDropDown;
	@FindBy(xpath="//ul/li[2][@id='iiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_agentagencygenerals1Comboitem2']/span[2]")
	private WebElement AgencyType;
	@FindBy(id="iiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_agentagencygenerals1eoExpirationDate-real")
	private WebElement EOExpireDate;
	@FindBy(xpath="//input[@id='iiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_agentagencygenerals1contactName']")
	private WebElement contactName;
	@FindBy(xpath="//a/span[@title='Appointment Details']")
	private WebElement AppDetails;
	@FindBy(xpath="//tr/td/button[@id='iiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_appointmentsmasters1add']")
	private WebElement AppDetailsAddBtn;
	@FindBy(xpath="//a[@id='iiiiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_appointmentsmasters1_customer_roles_appointmentsdetails1_customer_roles_appointmentsdetailgenerals1lob-btn']/i")
	private WebElement LOBDropDown;
	@FindBy(xpath="//ul/li[2][@id='iiiiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_appointmentsmasters1_customer_roles_appointmentsdetails1_customer_roles_appointmentsdetailgenerals1Comboitem2']/span[2]")
	private WebElement LOBWorkComp;
	@FindBy(xpath="//div/span/input[@id='iiiiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_appointmentsmasters1_customer_roles_appointmentsdetails1_customer_roles_appointmentsdetailgenerals1effectiveDate-real']")
	private WebElement LOBEffectiveDate;
	@FindBy(xpath="//a[@id='iiiiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_appointmentsmasters1_customer_roles_appointmentsdetails1_customer_roles_appointmentsdetailgenerals1appointentStatus-btn']/i")
	private WebElement LOBAppointmentStatus;
	@FindBy(xpath="//ul/li[2][@id='iiiiiiii_customer_customers1_customer_roomcustomerinfos1_customer_roless1s1_customer_roles_appointmentsmasters1_customer_roles_appointmentsdetails1_customer_roles_appointmentsdetailgenerals1Comboitem4']/span[2]")
	private WebElement LOBAppStatus;
	@FindBy(xpath="//a/span[@id='iii_customer_customers1_customer_roomcustomerinfos1saveButton-cnt']/img")
	private WebElement Save;
	

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickCustManagement()
	{
		custManage.click();
	}
	public void clickCreateBusiness()
	{
		verifyElement(createBusi);
		createBusi.click();
	}
	public void clickRoles()
	{
		verifyElement(Roles);
		Roles.click();
	}
	public void selectRoleType()
	{
		verifyElement(RolTypeDropDown);
		RolTypeDropDown.click();
	}
	public void insAgencyLocation()
	{
		verifyElement(insAgencylocation);
		insAgencylocation.click();
	}
	public void clickBtn()
	{
		verifyElement(addButton);
		addButton.click();
	}
	public void general()
	{
		verifyElement(General);
		General.click();
	}
	public void agencTypeDropDown()
	{
		verifyElement(AgencyTypeDropDown);
		AgencyTypeDropDown.click();
	}
	public void agencyType()
	{
		verifyElement(AgencyType);
		AgencyType.click();
	}
	public void eoExpireDate(String date)
	{
		verifyElement(EOExpireDate);
		EOExpireDate.sendKeys(date);
	}
	public void contactName(String cname)
	{
		verifyElement(contactName);
		contactName.sendKeys(cname);
	}
	public void appDetails()
	{ 
		verifyElement(AppDetails);
		AppDetails.click();
	}
	public void AppDetailsAddBtn()
	{
		verifyElement(AppDetailsAddBtn);
		AppDetailsAddBtn.click();
	}
	public void LOBDropDown()
	{
		verifyElement(LOBDropDown);
		LOBDropDown.click();
	}
	public void LOBWorkComp()
	{
		verifyElement(LOBWorkComp);
		LOBWorkComp.click();
	}
	public void LOBEffectiveDate(String efdate)
	{
		verifyElement(LOBEffectiveDate);
		LOBEffectiveDate.sendKeys(efdate);
	}
	public void LOBAppointmentStatus() {
		verifyElement(LOBAppointmentStatus);
		LOBAppointmentStatus.click();
	}
	public void LOBAppStatus()
	{
		verifyElement(LOBAppStatus);
		LOBAppStatus.click();
	}
	public void Save()
	{
		verifyElement(Save);
		Save.click();
	}
}
