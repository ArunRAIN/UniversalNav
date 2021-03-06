package com.WEBTECHQA.Uninavpages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Searchpage extends PageObject
{

	  @FindBy(id="txtSearch")
	    private WebElementFacade searchbox;
	  
	public void is_page_loaded()
	{
		while(true)
		{
			
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		String str = js.executeScript("return document.readyState").toString();
		
		if(str.equals("complete"))
		{
			break;
		}
		
		}
	}
	
	public void maximize_browser()
	{
		waitABit(2000);
		getDriver().manage().window().maximize();
	}
	
	public void is_search_icon_displayed()
	{
		int ele = getDriver().findElements(By.xpath("//input[@class='u02searchbttn']")).size();

    	if(ele==1)
    	{
    		Assert.assertTrue(true);
    	}
    	else
    	{
    		Assert.assertTrue(false);
    	}
	}
	
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
//	    	searchIcon.sendKeys(Keys.TAB);
//	    	searchIcon.sendKeys(Keys.TAB);
	    	WebElement cont = getDriver().findElement(By.xpath("//li[@class='u02mtool']/a/span[contains(text(),'Contact')]"));
	    	waitABit(5000);
			String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			JavascriptExecutor js = (JavascriptExecutor)getDriver();
			js.executeScript(mouseOverScript, cont);
	    	
	    }
	
	public void click_on_search_icon()
	{
		WebElement element = getDriver().findElement(By.xpath("//input[@class='u02searchbttn']"));
//		JavascriptExecutor js = (JavascriptExecutor)getDriver();
//		js.executeScript("arguments[0].click();", element);
		element.click();
	}
	
	
	public void is_search_field_open()
	{
		waitABit(3000);
//		WebElement ele = getDriver().switchTo().activeElement();
//    	Assert.assertEquals(ele, getDriver().findElement(By.id("txtSearch")));
//    	waitABit(1000);
		getDriver().findElement(By.id("txtSearch")).sendKeys("ora");
		waitABit(2000);
		List<WebElement> ele = getDriver().findElements(By.xpath("//div[contains(@class,'u02search')]/ul/li[1]"));
		  
	    if(ele.size()==1)
	    {
	    	Assert.assertTrue(true);
	    	getDriver().findElement(By.id("txtSearch")).clear();
	    	
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	}
	
	
	 public void is_focus_on_textbox()
	    {
//	    	WebElement ele = getDriver().switchTo().activeElement();
//	    	System.out.println(ele);
//	    	Assert.assertEquals(ele, getDriver().findElement(By.id("txtSearch")));
	    	waitABit(1000);
	    
	    }
	
	 
	 
	 
	 public void click_on_outside_searchbox()
	 {
		 WebElement cont = getDriver().findElement(By.xpath("//li[@class='u02mtool']/a/span[contains(text(),'Contact')]"));
//		 waitABit(5000);
//		 getDriver().findElement(By.id("txtSearch")).sendKeys(Keys.TAB);
//		 getDriver().findElement(By.id("txtSearch")).sendKeys(Keys.TAB);
		 waitABit(1000);
//			String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
//			JavascriptExecutor js = (JavascriptExecutor)getDriver();
//			js.executeScript(mouseOverScript, cont);
			WebElement element = getDriver().findElement(By.xpath("//input[@class='u02searchbttn']"));
			JavascriptExecutor js = (JavascriptExecutor)getDriver();
			js.executeScript("arguments[0].click();", cont);
		 
	 }
	 
	 public void is_search_inactive_state()
	 {
		 waitABit(6000);
		 int ele = getDriver().findElements(By.xpath("//div[@id='u02search']//ul[@hidden]")).size();
		 if(ele==1)
	    	{
	    		Assert.assertTrue(true);
	    	}
	    	else
	    	{
	    		Assert.assertTrue(false);
	    	}
	 }
	
	 
	 public void enter_keyword_in_searchbox()
	 {
		     waitABit(3000);
			getDriver().findElement(By.id("txtSearch")).sendKeys("ora");
	 }
	
	 
	 public void is_page_navigated()
		{
			waitABit(4000);
			String actualtitle=getDriver().getTitle();
	    	
	    	if(actualtitle.contains("404"))
	    	{
	    		Assert.assertTrue(false);
	    	}
	    	else
	    	{
	    		
		     Assert.assertTrue(true);
		    	  
	    	}
		}
	 
}
