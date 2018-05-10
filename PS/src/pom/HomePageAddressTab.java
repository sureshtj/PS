package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePageAddressTab extends BaseTest {
	
	@FindBy(id="iii_customer_customers1_customer_roomcustomerinfos1TabEx2-cnt")
	private WebElement addressTab;
	@FindBy(xpath="//td/button[@id='iiii_customer_customers1_customer_roomcustomerinfos1_customer_addressess1add']")
	private WebElement addButton;
	@FindBy(id="iiii_customer_customers1_customer_roomcustomerinfos1_customer_addressess1ComboboxEx1-real")
	private WebElement addressType;
	@FindBy(xpath="//span/input[@id='iiii_customer_customers1_customer_roomcustomerinfos1_customer_addressess1DateboxEx1-real']")
	private WebElement effDate;
	@FindBy(id="iiiii_customer_customers1_customer_roomcustomerinfos1_customer_addressess1s1country-real")
	private WebElement country;
	@FindBy(id="iiiii_customer_customers1_customer_roomcustomerinfos1_customer_addressess1s1line1\" class=\"z-textbox")
	private WebElement addressLine1;
	@FindBy(id="iiiii_customer_customers1_customer_roomcustomerinfos1_customer_addressess1s1line2")
	private WebElement addressLine2;
	@FindBy(id="iiiii_customer_customers1_customer_roomcustomerinfos1_customer_addressess1s1postalCode")
	private WebElement postalCode;
	@FindBy(xpath="//img[@src='assets/images/search.png']")
    private WebElement postalCodeSerach;
	
	public HomePageAddressTab(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addressTab()
	{
		verifyElement(addressTab);
		addressTab.click();
	}
	public void addButton()
	{
		verifyElement(addButton);
		addButton.click();
	}
	public void addressType(String addtype)
	{
		verifyElement(addressType);
		addressType.sendKeys(addtype);
	}
	public void country(String countryname)
	{
		verifyElement(country);
		country.sendKeys(countryname);
	}
	public void addressLine1(String add1)
	{
		verifyElement(addressLine1);
		addressLine1.sendKeys(add1);
	}
	public void addressLine2(String add2)
	{
		verifyElement(addressLine2);
		addressLine2.sendKeys(add2);
	}
	public void postalCode(String zipcode) throws AWTException
	{
		verifyElement(postalCode);
		postalCode.sendKeys(zipcode);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
	}
}
