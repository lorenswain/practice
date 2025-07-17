package main.java.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SearchPage {
	Actions act;
	WebDriver driver;
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		act= new Actions(driver);	
	}
	
	By SearchBar  = By.xpath("//input[@id=\"twotabsearchtextbox\" and @class =\"nav-input nav-progressive-attribute\"]");  //find search bar
	By primecheck = By.xpath("//a[@class=\"nav-logo-link nav-progressive-attribute\" and @aria-label =\"Amazon Prime\"]"); // check the primelogo
	                                 // select the Ssd filter
	

	public  boolean PrimecheckandSearchAsin()                                                 //check prime account or not
	{	
		boolean Prime_logo_displayed=driver.findElement(primecheck).isDisplayed();
		return Prime_logo_displayed;
		
	}
	
	public void languageSETbymoseover()
	{
		WebElement languagemouseover = driver.findElement(By.xpath("//div[@class='nav-div' and @id='icp-nav-flyout']"));
		act.moveToElement(languagemouseover).build().perform();
		WebElement languagemouseover_EN = driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//span[contains(@dir,'ltr')][normalize-space()='English']"));
		act.moveToElement(languagemouseover_EN).build().perform();
		languagemouseover_EN.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void search()                                                                     //search for one item
	{
		driver.findElement(SearchBar).sendKeys("lego");
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
	}
//......................................................................................................................	
	
	By SSD_FILTER = By.xpath("//div[@id='primeRefinements']");
	public void get_SSD__filter()
	{
		String SSD=driver.findElement(SSD_FILTER).getText();	
		System.out.println(SSD);
	}
	
	By SSD_Filter1= By.cssSelector("#p_101\\/19346685011 > span > a > div > label > i");   
	By SSD_Filter2= By.cssSelector("#p_101\\/19346686011 > span > a > div > label");
	
	
	
	public void select_SSD_Filter1()
	{	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(SSD_Filter1).click();
	}
	public void select_SSD_Filter2()
	{	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(SSD_Filter2).click();
	}
	
	

	
//........................................................................................................................	
	By DDS_Filter = By.xpath("//div[@id='deliveryRefinements']");
	public void get_DDS_filter()
	{	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String dds = driver.findElement(DDS_Filter).getText();		
		System.out.println(dds);
	}


By get_it_today = By.xpath("//span[contains(text(),'Get It Today')]");
By get_it_tomorrow= By.xpath("//span[contains(text(),'Get It by Tomorrow') ]");

public void get_it_today()
{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(get_it_today).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println("get_it_today clicked");
}
public void get_it_tomorrow()
{	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(get_it_tomorrow).click();
	System.out.println("get_it_tomorrow clicked");

}



}
