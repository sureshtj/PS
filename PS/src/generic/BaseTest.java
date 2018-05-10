package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst{
	public static WebDriver driver;
	
         static
         {
        	 System.setProperty(CHROME_KEY,CHROME_VALUE);
        	 System.setProperty(GECKO_KEY, GECKO_VALUE);
         } 
         
         @BeforeMethod
         public void OpenApplication()
         { 
        	 
        	driver=new ChromeDriver();
        	String url = lib.getProperty(CONFIG_PATH,"URL");
        	driver.get(url);
        	String ito=lib.getProperty(CONFIG_PATH, "ITO");
         	int ito1=Integer.parseInt(ito);
         	driver.manage().timeouts().implicitlyWait(ito1,TimeUnit.SECONDS);
        	
        	 
         }
         
         public static void verifyElement(WebElement element)
         {
        	 
           try
        	 {
         	  WebDriverWait wait=new WebDriverWait(driver,30);
        	 wait.until(ExpectedConditions.visibilityOf(element));
        	
        	 }
        	 catch(Exception e)
        	 {
        		 System.out.println("Element is not present");
        	 }
        	 
        	 
        			 
         }
     @AfterMethod
         public void CloseApplication()
         {
        	 driver.quit();
         }
}
