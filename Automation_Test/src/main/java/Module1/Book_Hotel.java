package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Book_Hotel {

	   @FindBy(xpath="//*[@id='location']") private WebElement LOCATION;
	   @FindBy(xpath="//*[@id='hotels']") private WebElement HOTELS;
	   @FindBy(xpath="//*[@id='room_type']") private WebElement ROOMTYPE;
	   @FindBy(xpath="//*[@id='room_nos']") private WebElement NOR;
	   @FindBy(xpath="//*[@id='datepick_in']") private WebElement CID;
	   @FindBy(xpath="//*[@id='datepick_out']") private WebElement COD;
	   @FindBy(xpath="//*[@id='adult_room']") private WebElement APROOM;
	   @FindBy(xpath="//*[@id='child_room']") private WebElement CPROOM;
	   @FindBy(xpath="//*[@id='Submit']") private WebElement SEARCH;
	   
	   @FindBy(xpath="//*[@id='radiobutton_0']") private WebElement CHECKBOX;
	   @FindBy(xpath="//*[@id='continue']") private WebElement CONTINUE;
	   
	   @FindBy(xpath="//*[@id='first_name']") private WebElement FIRSTNAME;
	   @FindBy(xpath="//*[@id='last_name']") private WebElement LASTNAME;
	   @FindBy(xpath="//*[@id='address']") private WebElement ADDRESS;
	   @FindBy(xpath="//*[@id='cc_num']") private WebElement CCNUMBER;
	   @FindBy(xpath="//*[@id='cc_type']") private WebElement CCTYPE;
	   @FindBy(xpath="//*[@id='cc_exp_month']") private WebElement MONTH;
	   @FindBy(xpath="//*[@id='cc_exp_year']") private WebElement YEAR;
	   @FindBy(xpath="//*[@id='cc_cvv']") private WebElement CVV;
	   @FindBy(xpath="//*[@id='book_now']") private WebElement BOOKNOW;
	   
	   
	   public Book_Hotel(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void selectloc(String loc)
	   {
		   Select locc=new Select(LOCATION);
		   locc.selectByVisibleText(loc);
	   }
	   
	   public void selecthotels(String hotel)
	   {
		   Select hotell=new Select(HOTELS);
		   hotell.selectByVisibleText(hotel);
	   }
	   
	   public void selectroomtype(String room)
	   {
		   Select hotell=new Select(ROOMTYPE);
		   hotell.selectByVisibleText(room);
	   }
	   
	   public void selectnoofrooms(String rooms)
	   {
		   Select hotell=new Select(NOR);
		   hotell.selectByVisibleText(rooms);
	   }
	   
	   public void entercheckindate(String cdate)
	   {
		   CID.sendKeys(cdate);
	   }
	   
	   public void entercheckoutdate(String codate)
	   {
		   COD.sendKeys(codate);
	   }
	   
	   public void selectadaultsperroom(String adaultper)
	   {
		   Select hotell=new Select(APROOM);
		   hotell.selectByVisibleText(adaultper);
	   }
	   
	   public void selectchildrenperroom(String children)
	   {
		   Select hotell=new Select(CPROOM);
		   hotell.selectByVisibleText(children);
	   }
	   
	   public void clicksearch()
	   {
		   SEARCH.click();
	   }
	   
	   public void clickcheckbox()
	   {
		   CHECKBOX.click();
	   }
	   
	   public void clickcontinue()
	   {
		   CONTINUE.click();
	   }
	   
	   public void enterfirstname(String fn)
	   {
		   FIRSTNAME.sendKeys(fn);
	   }
	   
	   public void enterlastname(String ln)
	   {
		   LASTNAME.sendKeys(ln);
	   }
	   
	   public void enteraddress(String address)
	   {
		   ADDRESS.sendKeys(address);
	   }
	   
	   public void entercreditcardnumber(String ccno)
	   {
		   CCNUMBER.sendKeys(ccno);
	   }
	   
	   public void selectcreditcardtype(String cctype)
	   {
		   Select cct=new Select(CCTYPE);
		   cct.selectByVisibleText(cctype);
	   }
	   
	   public void selectexpirymonth(String expmonth)
	   {
		   Select exp=new Select(MONTH);
		   exp.selectByVisibleText(expmonth);
	   }
	   
	   public void selectexpiryyear(String expyear)
	   {
		   Select exp=new Select(YEAR);
		   exp.selectByVisibleText(expyear);
	   }
	   
	   public void entercvvnumber(String cvvno)
	   {
		   CVV.sendKeys(cvvno);
	   }
	   
	   public void clickbooknow()
	   {
		   BOOKNOW.click();
	   }
	   
}
