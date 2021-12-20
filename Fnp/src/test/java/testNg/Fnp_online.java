package testNg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import project_object.Addtocartpage;
import project_object.Productselection;

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class Fnp_online 
{
	public static WebDriver driver;
	
  @Test(priority = 0)
  public void Productselect()  
  {
	  Productselection psl = PageFactory.initElements(driver,Productselection.class);
	  psl.searchbox("Chocolate cake");
	  psl.searchbutton();
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,300)");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  psl.selectproduct();
  }
  @Test(priority = 1)
  public void Addtocart()
  {
	  Addtocartpage acp = PageFactory.initElements(driver,Addtocartpage.class);
	  acp.zipcode("6000");
	  acp.autosug();
	  acp.Delivary();
	  acp.Day();
 }
  @BeforeClass
  public void beforeClass()
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
      driver.manage().window().maximize();
	  driver.get("https://www.fnp.com");
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  
  }

}
