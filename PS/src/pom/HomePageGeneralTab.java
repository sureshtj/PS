package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePageGeneralTab extends BaseTest{
	
	@FindBy(id="ii_customer_portletcustomers1Caption1")
	private WebElement custManage;
	@FindBy(xpath="//button[@id='ii_customer_portletcustomers1RoomNavitem3']")
	private WebElement createBusi;
	@FindBy(xpath="//a/span[@title='General']")
	private WebElement generalTab;
	@FindBy(xpath="//a[@id='iiii_customer_customers1_customer_roomcustomerinfos1_customer_generals1ComboboxEx1-btn']/i")
	private WebElement countryDropDown;
	@FindBy(xpath="//span/input[@id='iiii_customer_customers1_customer_roomcustomerinfos1_customer_generals1ComboboxEx1-real']")
	private WebElement country;
	@FindBy(id="iiii_customer_customers1_customer_roomcustomerinfos1_customer_generals1TextboxEx1")
	private WebElement busiName;
	@FindBy(xpath="//input[@id='iiii_customer_customers1_customer_roomcustomerinfos1_customer_generals1DateboxEx1-real']")
	private WebElement effctivedate;
	@FindBy(id="iiii_customer_customers1_customer_roomcustomerinfos1_customer_generals1TaxidBox1")
	private WebElement taxId;
	@FindBy(xpath="//a/span[@id='iii_customer_customers1_customer_roomcustomerinfos1saveButton-cnt']/img")
	private WebElement Save;
	
	
	public HomePageGeneralTab(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	
	public void custManage()
	{
	verifyElement(custManage);
	custManage.click();
	}
	public void createBusi()
	{
		verifyElement(createBusi);
		createBusi.click();
	}
	public void generalTab()
	{
		verifyElement(generalTab);
		generalTab.click();
	}
	public void	countryDropDown()
	{
		verifyElement(countryDropDown);
		countryDropDown.click();
	}
	public void country(String countryname)
	{
		verifyElement(country);
		country.sendKeys(countryname);
	}
	public void busiName(String businessname)
	{
		verifyElement(busiName);
		busiName.sendKeys(businessname);
	}
	public void effctivedate(String date)
	{
		verifyElement(effctivedate);
		effctivedate.sendKeys(date);
	}
	public void taxId(String taxidinfo)
	{
		verifyElement(taxId);
		taxId.sendKeys(taxidinfo);
	}
	public void Save()
	{
		verifyElement(Save);
		Save.click();
	}
}
