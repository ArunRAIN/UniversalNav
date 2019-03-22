package com.WEBTECHQA.Uninavpages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class SearchAutosuggestPage extends PageObject
{
	@FindBy(id="sso_username")
    private WebElementFacade usrname;

    @FindBy(id="ssopassword")
    private WebElementFacade pwd;

    @FindBy(xpath="//a[contains(text(),'Sign In')]")
    private WebElementFacade signbtn;
    
    @FindBy(id="txtSearch")
    private WebElementFacade searchbox;
    
    @FindBy(xpath="//input[@class='u02searchbttn']")
    private WebElementFacade searchIcon;
    
    @FindBy(xpath="//div[text()='Menu']")
    private WebElementFacade menu;
    
   
   
    public void maximize_browser()
	{
		waitABit(1000);
		getDriver().manage().window().maximize();
	}
//    public void navigate_page()
//    {
//    	getDriver().navigate().back();
//    }
    public void type_keyword(String option)
    {
    	searchbox.clear();
    	searchbox.type(option);
    	waitABit(3000);
    }
    
    public void verify_Autosuggestion_display()
    {
    	waitABit(5000);
	    List<WebElement> ele = getDriver().findElements(By.xpath("//div[contains(@class,'u02search')]/ul/li[1]"));
	  
	    if(ele.size()==1)
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
    
    }
    
    public void click_outside_searchbox()
    {
    	searchbox.clear();
    	
    	WebElement cont = getDriver().findElement(By.xpath("//li[@class='u02mtool']/a/span[contains(text(),'Contact')]"));
    	waitABit(5000);
		String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript(mouseOverScript, cont);
    	
    }
    
    public void verify_Autosuggestion_not_display()
    {
    	waitABit(3000);
	    WebElement ele = getDriver().findElement(By.xpath("//div[contains(@class,'u02search')]/ul/li[1]"));
	  
	    if(ele.isDisplayed())
	    {
	    	Assert.assertTrue(false);
	    }
	    else
	    {
	    	Assert.assertTrue(true);
	    }
    
    }
    
    
//    public void verify_Autosuggestion_not_display()
//    {
//    	waitABit(2000);
//	    WebElement ele = getDriver().findElement(By.xpath("//div[contains(@class,'u02search')]/ul/li[1]"));
//	  
//	    if(ele.isDisplayed())
//	    {
//	    	Assert.assertTrue(false);
//	    }
//	    else
//	    {
//	    	Assert.assertTrue(true);
//	    }
//    
//    }
    
//    public void click_outside_searchbox()
//    {
//    	searchIcon.sendKeys(Keys.TAB);
//    }
//    
    public void click_on_option()
    {
    	
    	searchbox.sendKeys(Keys.DOWN);
    	searchbox.sendKeys(Keys.ENTER);
    	waitABit(3000);
    }
//    
    public void is_page(String expectedtitle)
    {
    	waitABit(37000);
    	String actualtitle=getDriver().getTitle();
    	
    	Assert.assertEquals(expectedtitle, actualtitle);
    	
    }
    
    public void click_serch_Icon()
    {
    	waitABit(3000);
    	WebElement element = getDriver().findElement(By.xpath("//input[@class='u02searchbttn']"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
    	
    	
    }
}
