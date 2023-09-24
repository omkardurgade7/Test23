package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login_Page {

	
	
	   @FindBy(xpath="//*[@id='username']") private WebElement USERNAME;
	   @FindBy(xpath="//*[@id='password']") private WebElement PASSWORD;
	   @FindBy(xpath="//*[@type='Submit']") private WebElement LOGINBUTTON;
	   
	     public Adactin_Login_Page(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	     
	     
	     public void enterun(String un)
	     {
	    	 USERNAME.sendKeys(un);
	     }
	     
	     public void enterps(String psw)
	     {
	    	 PASSWORD.sendKeys(psw);
	     }
	     
	     public void clickbtn()
	     {
	    	 LOGINBUTTON.click();
	     }
	     
}
