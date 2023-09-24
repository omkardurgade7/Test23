package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Order_Id {

	
	   @FindBy(xpath="//*[text()='Booked Itinerary']") private WebElement BOOKEDITERNITY;
	   @FindBy(xpath="//*[@id='order_id_912069']") private WebElement ORDER;
	   
	   public Check_Order_Id(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void clickbookediternity()
	   {
		   BOOKEDITERNITY.click();
	   }
	   
	   public String verifyorderid()
	   {
		   String s1=ORDER.getText();
		   return s1;
	   }
	   
}
