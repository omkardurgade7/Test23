package Library_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utility_Class {

	
	  public static String getDATAFROMPF(String key) throws IOException
	  {
		  
		  FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Automation_Test\\Propertyfile.properties");
		  
		  Properties prop=new Properties();
		  
		  prop.load(file);
		  
		  String value=prop.getProperty(key);
		  return value;
	  }
	  
	 
	  public static String getDATAFROMEXCELSHEET(int rowINDEX, int celINDEX) throws EncryptedDocumentException, IOException
	  {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Automation_Test\\TestData\\Test_Data_Excel_Sheet.xlsx");
		
		String s1=WorkbookFactory.create(file).getSheet("Sheet11").getRow(rowINDEX).getCell(celINDEX).getStringCellValue();
		
		return s1;
	  }
	  
	  
	  public static void captureSS(WebDriver driver, String TCID) throws IOException
	  {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		
		File dest=new File("C:\\Users\\Compaid_Asus\\eclipse-workspace\\Automation_Test\\Screenshot"+TCID+".jpg");
		
		FileHandler.copy(source, dest);
	  }
	  
	  
	  
}
