package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Welcome_Page {

	
	    @FindBy(xpath="//input[@value='Hello Omkar12345!']") private WebElement VFNAME;
	    @FindBy(xpath="//td[text()='Welcome to Adactin Group of Hotels']") private WebElement VERIFYTEXT;
	    @FindBy(xpath="//a[text()='Logout']") private WebElement LOGOUTBUTTON;
	    @FindBy(xpath="//*[text()='Click here to login again']") private WebElement AGAINLOGIN;
	  
	    public Adactin_Welcome_Page(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	   
	   public String verify()
	   {
		   String d1=VFNAME.getAttribute("value");
		   
		   String a1[]=d1.split(" ");
		   
		   String z1=a1[0];
		   String actual=a1[1];
		   
		   return actual;   
	   }
	   
	   public String verify2()
	   {
		  String s1=VERIFYTEXT.getText();
		  
		  return s1;
	   }
	   
	   public void logout()
	   {
		   LOGOUTBUTTON.click();
	   }
	   public void againlogin()
	   {
		   AGAINLOGIN.click();
	   }
}
