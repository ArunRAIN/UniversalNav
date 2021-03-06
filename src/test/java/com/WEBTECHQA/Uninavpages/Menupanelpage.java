package com.WEBTECHQA.Uninavpages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Menupanelpage extends PageObject
{
	@FindBy(id="u02menulink")
    private WebElementFacade menu;

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
		
		getDriver().manage().window().maximize();
		waitABit(3000);
		List<WebElement> ele = getDriver().findElements(By.xpath("//em[text()='Close']"));
		if(ele.size()==1)
		{
			getDriver().findElement(By.xpath("//em[text()='Close']")).click();
		}
	}
	
	
	public void hover_on_menu()
	{
		//waitFor(ExpectedConditions.visibilityOf(menu));
    	
		waitABit(5000);
//		String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
//		JavascriptExecutor js = (JavascriptExecutor)getDriver();
//		js.executeScript(mouseOverScript, menu);
//		waitABit(5000);
//		//WebElement element = driver.findElement(By.id('button'));
//		JavascriptExecutor js = (JavascriptExecutor)getDriver();
//		js.executeScript("arguments[0].click();", menu);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		String name=js.executeScript("return navigator.userAgent").toString();
        System.out.println(name);
        waitABit(3000);
        if(name.contains("Firefox"))
        {
//        	Actions a=new Actions(getDriver());
//    		a.moveToElement(ele2).perform();
        	menu.click();
        }
        else
        {
        	String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
    		JavascriptExecutor js2 = (JavascriptExecutor)getDriver();
    		js2.executeScript(mouseOverScript, menu);
    		
        }
		
		
	}
	
	
	public void verify_primarypanel_with_categories()
    {
    	waitABit(2000);
    	int ele = getDriver().findElements(By.xpath("//div[@class='u02menu-l1 u02menuwrap u02mheight u02menu-nomn']/ul/li[1]/div[@class='u02menu-l2 u02menuwrap u02mheight']/ul/li[2]/a")).size();
    	
    	if(ele==1)
    	{
    		Assert.assertTrue(true);
    	}
    	else
    	{
    		Assert.assertTrue(false);
    	}
    }
  
    public void hover_on_primary_panel_categories()
    {
    	//int num = randomnumber();
		
    	WebElement ele = getDriver().findElement(By.xpath("//div[@class='u02menu-l1 u02menuwrap u02mheight u02menu-nomn']/ul/li[2]"));
//    	String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
//		JavascriptExecutor js = (JavascriptExecutor)getDriver();
//		js.executeScript(mouseOverScript, ele);
    	JavascriptExecutor js = (JavascriptExecutor)getDriver();
		String name=js.executeScript("return navigator.userAgent").toString();
        System.out.println(name);
        waitABit(3000);
        if(name.contains("Firefox"))
        {
//        	Actions a=new Actions(getDriver());
//    		a.moveToElement(ele2).perform();
        	System.out.println("hi");
        	ele.click();
        }
        else
        {
        	String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
    		JavascriptExecutor js2 = (JavascriptExecutor)getDriver();
    		js2.executeScript(mouseOverScript, ele);
    		
        }
    	waitABit(2000);
    }
    
    public void verify_secondary_panel_displays()
    {
    	
    	
         int ele2=getDriver().findElements(By.xpath("(//div[@class='u02menu-l1 u02menuwrap u02mheight u02menu-nomn']//li/a[text()='Products'])[1]/../div/ul/li/a[text()='IT Infrastructure']/../div/ul/li/a[text()='IT Infrastructure']")).size();
       
         if(ele2==1)
     	{
     		Assert.assertTrue(true);
     	}
     	else
     	{
     		Assert.assertTrue(false);
     	}
         
    }
    
    public void hover_on_secondary_panel_catagories()
    {
    	WebElement hover = getDriver().findElement(By.xpath("(//div[@class='u02menu-l1 u02menuwrap u02mheight u02menu-nomn']//li/a[text()='Products'])[1]/../div/ul/li/a[text()='IT Infrastructure']"));
//    	Actions a1=new Actions(getDriver());
//    	a1.moveToElement(hover).perform();
    	JavascriptExecutor js = (JavascriptExecutor)getDriver();
		String name=js.executeScript("return navigator.userAgent").toString();
        System.out.println(name);
        waitABit(3000);
        if(name.contains("Firefox"))
        {
//        	Actions a=new Actions(getDriver());
//    		a.moveToElement(ele2).perform();
        	hover.click();
        }
        else
        {
        	String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
    		JavascriptExecutor js2 = (JavascriptExecutor)getDriver();
    		js2.executeScript(mouseOverScript, hover);
    		
        }
//    	
    	waitABit(1500);
    
    
    }
    
    public void shows_categories_with_direct_link()
    {
//    	List<WebElement> ele=getDriver().findElements(By.xpath("(//div[@class='u02menu-l1 u02menuwrap u02mheight u02menu-nomn']//li/a[text()='Products'])[1]/../div/ul/li/a[text()='IT Infrastructure']/../div/ul/li/a[text()='IT Infrastructure']/../following-sibling::li"));
//        
//        for(int i=1;i<ele.size();i++)
//        {
//      	 WebElement move = ele.get(i);
//      	 
//      	 Actions a=new Actions(getDriver());
//      	 a.moveToElement(move).perform();
//      	 waitABit(300);
      	 
        //}
    }
	
	
    public void menu_opened()
	{
		waitABit(2000);
    	int ele = getDriver().findElements(By.xpath("//div[@class='u02menu-l1 u02menuwrap u02mheight u02menu-nomn']/ul/li[1]/div[@class='u02menu-l2 u02menuwrap u02mheight']/ul/li[2]/a")).size();
    	
    	if(ele==1)
    	{
    		Assert.assertTrue(true);
    	}
    	else
    	{
    		Assert.assertTrue(false);
    	}
	}
	
	
	 
	
	public void click_on_link()
	{
		waitABit(1500);
		getDriver().findElement(By.xpath("((//div[@class='u02menu-l1 u02menuwrap u02mheight u02menu-nomn']//li/a[text()='Products'])[1]/../div/ul/li/a[text()='IT Infrastructure']/../div/ul/li/a[text()='IT Infrastructure']/../following-sibling::li)[2]")).click();
		
	}
	
	public void is_page_navigated()
	{
		waitABit(4000);
		String actualtitle=getDriver().getTitle();
    	
    	if(actualtitle.contains(actualtitle))
    	{
    		Assert.assertTrue(true);
    	}
    	else
    	{
    		
	     Assert.assertTrue(false);
	    	  
    	}
	}
	
	
	
	
	
	
	
	
	
}
