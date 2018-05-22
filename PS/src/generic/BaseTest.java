package generic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst{
	public static WebDriver driver;
	public static int count=0;
	
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
         	  WebDriverWait wait=new WebDriverWait(driver,10);
        	 wait.until(ExpectedConditions.visibilityOf(element));
        	
        	 }
        	 catch(Exception e)
        	 {
        		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	     try {
					FileUtils.copyFile(screenshotFile, new File("D:/Git/PS/Screenshots/failScrnShot"+(count++)+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	 }	 
        			 
         }
         public static void takesScreenShot() 
         {
         TakesScreenshot t=(TakesScreenshot)driver;
 		File srcFile=t.getScreenshotAs(OutputType.FILE);
 		File destFile=new File("D:/Git/PS/Screenshots/failScrnShot"+(count++)+".png");
 		try {
			FileUtils.copyFile(srcFile, destFile);
			System.out.println("Screenshot captured successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         }
     @AfterMethod
         public void CloseApplication()
         {
        	 driver.quit();
         }
}
