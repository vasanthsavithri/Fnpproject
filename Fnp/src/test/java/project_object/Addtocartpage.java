package project_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocartpage 
{
	@FindBy(xpath="//input[@id='destlookup']")private WebElement pincode;
	@FindBy(id="ui-id-0")private WebElement suggest;
	@FindBy(xpath="//a[@id='datetimelink']")private WebElement delivery;
	@FindBy(xpath="//a[contains(text(),'30')]")private WebElement date;
	

	public void zipcode(String s6)
	{
		pincode.sendKeys(s6);
	}
	public void autosug()
	{
		suggest.click();
	}
	public void Delivary()
	{
		delivery.click();
	}
	public void Day()
	{
		date.click();
	}
	

}
