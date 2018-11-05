package com.WEBTECHQA.Uninavpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Menusitepage extends PageObject
{
	@FindBy(xpath="//div[text()='Menu']")
    private WebElementFacade menu;
	
	
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

	public void hover_on_menu()
	{
		//waitFor(ExpectedConditions.visibilityOf(menu));
    	
		waitABit(5000);
		String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript(mouseOverScript, menu);
//		waitABit(5000);
//		//WebElement element = driver.findElement(By.id('button'));
//		JavascriptExecutor js = (JavascriptExecutor)getDriver();
//		js.executeScript("arguments[0].click();", menu);
		
		
	}
	
	 public void hover_on_primary_panel_categories()
	    {
	    	//int num = randomnumber();
			
	    	WebElement ele = getDriver().findElement(By.xpath("//div[@class='u02menu-l1 u02menuwrap u02mheight u02menu-nomn']/ul/li[2]"));
	    	String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			JavascriptExecutor js = (JavascriptExecutor)getDriver();
			js.executeScript(mouseOverScript, ele);
	    	waitABit(2000);
	    }
	    
	 public void hover_on_secondary_panel_catagories()
	    {
	    	WebElement hover = getDriver().findElement(By.xpath("(//div[@class='u02menu-l1 u02menuwrap u02mheight u02menu-nomn']//li/a[text()='Products'])[1]/../div/ul/li/a[text()='IT Infrastructure']"));
	    	Actions a1=new Actions(getDriver());
	    	a1.moveToElement(hover).perform();
	    	
	    	waitABit(1500);
	    
	    
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
