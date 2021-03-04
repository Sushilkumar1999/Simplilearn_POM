package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;



public class testcase1 {
	
	WebDriver driver;

	
	@BeforeMethod
	public void lunchBrowser()  {
		System.setProperty("webdriver.chrome.driver", "/home/sushilnayaktecn/Downloads/chromedriver");
        //System.setProperty("webdriver.gecko.driver", "/home/sushilnayaktecn/Downloads/geckodriver");
              	
	    driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);

		
	}
	
	@Test
	public void Logintest() throws IOException {
		
		Loginpage obj = new Loginpage(driver);
		obj.Login();
	 
	}
	
	@AfterMethod
	public void CloseBrowser() {
		//driver.quit();
	}

}
