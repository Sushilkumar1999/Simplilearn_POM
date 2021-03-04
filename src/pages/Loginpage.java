package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

WebDriver driver;
XSSFWorkbook wb;
XSSFSheet sheet;

@FindBy(linkText="Log in")
WebElement lnkLogin;

@FindBy(name="user_login")
WebElement editUsername;

@FindBy(name="user_pwd")
WebElement editpwd;

@FindBy(className="rememberMe")
WebElement chkbox;

@FindBy(name="btn_login")
WebElement btnPwd;

public Loginpage(WebDriver testdriver) {
	this.driver=testdriver;
	PageFactory.initElements(driver, this);
}


public void Login() throws IOException {
	
	
	lnkLogin.click();
	FileInputStream file = new FileInputStream("Excellread.xlsx");
	wb = new XSSFWorkbook(file);
	sheet = wb.getSheet("report");
	//driver.quit();
	
	 //to find a string
	//*[contains(text(),'Welcome')]
	
	String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
	editUsername.sendKeys(UserName);
	

	String Password1 = sheet.getRow(1).getCell(0).getStringCellValue();
	editpwd.sendKeys(Password1);
	

	
	
	
	btnPwd.click();
	
}

}
