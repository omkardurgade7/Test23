package Module1_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Base_Class;
import Library_Files.Utility_Class;
import Module1.Adactin_Login_Page;
import Module1.Adactin_Welcome_Page;
import Module1.Book_Hotel;
import Module1.Check_Order_Id;

public class Adactin_Test_Class extends Base_Class{

	
	    Adactin_Login_Page LOGIN;
	    Adactin_Welcome_Page WELCOME;
	    Book_Hotel BOOK;
	    String TCID;
	    Check_Order_Id ORDERID;
	    @BeforeClass
	    public void openBROWSER()
	    {
	    	initializeBROWSER();
	    	
	    	LOGIN=new Adactin_Login_Page(driver);
	    	WELCOME=new Adactin_Welcome_Page(driver);
	    	BOOK=new Book_Hotel(driver);
	    	ORDERID=new Check_Order_Id(driver);
	    } 
	    @BeforeMethod
	    public void logintoAPP() throws IOException
	    {
	    	LOGIN.enterun(Utility_Class.getDATAFROMPF("UserName"));
	    	LOGIN.enterps(Utility_Class.getDATAFROMPF("PassWord"));
	    	LOGIN.clickbtn();
	    }    
	    @Test(priority=1)
	    public void verifyUSERNAME() throws EncryptedDocumentException, IOException
	    {
	    	String actual=WELCOME.verify();
	    	String expected=Utility_Class.getDATAFROMEXCELSHEET(0, 0);
	    	
	    	Assert.assertEquals(actual, expected);
	    }  
	    @Test(priority=4)
	    public void verifyText() throws EncryptedDocumentException, IOException
	    {
	    	String actual=WELCOME.verify2();
	    	String expected=Utility_Class.getDATAFROMEXCELSHEET(11, 0);
	    	
	    	Assert.assertEquals(actual, expected);	
	    }   
	    @Test(priority=2)
	    public void bookHOTEL() throws EncryptedDocumentException, IOException
	    {
	       BOOK.selectloc(Utility_Class.getDATAFROMEXCELSHEET(2, 0));
	       BOOK.selecthotels(Utility_Class.getDATAFROMEXCELSHEET(3, 0));
	       BOOK.selectroomtype(Utility_Class.getDATAFROMEXCELSHEET(4, 0));
	       BOOK.selectnoofrooms(Utility_Class.getDATAFROMEXCELSHEET(5, 0));
	       BOOK.entercheckindate(Utility_Class.getDATAFROMEXCELSHEET(6, 0));
	       BOOK.entercheckoutdate(Utility_Class.getDATAFROMEXCELSHEET(7, 0));
	       BOOK.selectadaultsperroom(Utility_Class.getDATAFROMEXCELSHEET(8, 0));
	       BOOK.selectchildrenperroom(Utility_Class.getDATAFROMEXCELSHEET(9, 0));   
	       BOOK.clicksearch();
	       
	       BOOK.clickcheckbox();
	       BOOK.clickcontinue();
	       
	       BOOK.enterfirstname(Utility_Class.getDATAFROMEXCELSHEET(0, 1));
	       BOOK.enterlastname(Utility_Class.getDATAFROMEXCELSHEET(1, 1));
	       BOOK.enteraddress(Utility_Class.getDATAFROMEXCELSHEET(2, 1));
	       BOOK.entercreditcardnumber(Utility_Class.getDATAFROMEXCELSHEET(3, 1));
	       BOOK.selectcreditcardtype(Utility_Class.getDATAFROMEXCELSHEET(4, 1));
	       BOOK.selectexpirymonth(Utility_Class.getDATAFROMEXCELSHEET(5, 1));
	       BOOK.selectexpiryyear(Utility_Class.getDATAFROMEXCELSHEET(6, 1));
	       BOOK.entercvvnumber(Utility_Class.getDATAFROMEXCELSHEET(7, 1));
	       BOOK.clickbooknow();      
	    }
	    @Test(priority=3)
	    public void checkorderID() throws EncryptedDocumentException, IOException
	    {
	    	ORDERID.clickbookediternity();
	    	String actual=ORDERID.verifyorderid();
	    	String expected=Utility_Class.getDATAFROMEXCELSHEET(8, 1);
	    	
	    	Assert.assertEquals(actual, expected);
	    }
	    @AfterMethod
	    public void logoutAPP(ITestResult Result) throws IOException
	    {
	    	if(Result.getStatus()==ITestResult.FAILURE)
	    	{
	    		Utility_Class.captureSS(driver, TCID);
	    	}
	    	WELCOME.logout();
	        WELCOME.againlogin();
	    }
	    
	    @AfterClass
	    public void closeBROWSER()
	    {
	    	driver.quit();
	    }
	    
}
