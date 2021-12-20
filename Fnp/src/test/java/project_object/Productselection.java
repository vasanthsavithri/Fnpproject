package project_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productselection 
{

	@FindBy(xpath="//input[@id='header-search-input']")private WebElement Searchbox;
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/button[2]")private WebElement Search;
	@FindBy(xpath="//div[contains(text(),'Fudge Brownie Cake')]")private WebElement Selecting;
	
	public void searchbox(String v)
	{
		Searchbox.sendKeys(v);
	}
	
	public void searchbutton()
	{
		Search.click();
	}
	
	public void selectproduct()
	{
		Selecting.click();
	}

}
