package com.WEBTECHQA.Uninavpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CountryListPage extends PageObject
{
	@FindBy(id="u02menulink")
    private WebElementFacade country;

	
	public void hover_on(String country)
	{
		String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript(mouseOverScript, getDriver().findElement(By.xpath("//span[contains(text(),'"+country+"')]")));
//		Actions a=new Actions(getDriver());
//				a.moveToElement(getDriver().findElement(By.xpath("//span[contains(text(),'"+country+"')]"))).perform();
	    waitABit(1000);
	}
	
	public void region_panel_display()
	{
		int ele = getDriver().findElements(By.xpath("(//div[@id='u02countrymenu']/div/ul/li/following-sibling::li)[2]")).size();
		if(ele==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void countries_panel_display()
	{

		int ele = getDriver().findElements(By.xpath("//div[@id='u02countrymenu']/div/ul/li/following-sibling::li")).size();
		System.out.println(ele);
		for(int i=0;i<ele;i++)
		{
			int v=i+1;
		    int ele1 = getDriver().findElements(By.xpath("(//div[@id='u02countrymenu']/div/ul/li/following-sibling::li)["+v+"]")).size();
			if(ele1==1)
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
	}
	
	public void is_pin_appear()
	{

		int ele = getDriver().findElements(By.xpath("//div[@id='u02countrymenu']/div/ul/li/following-sibling::li")).size();
		System.out.println(ele);
		for(int i=0;i<ele;i++)
		{
			int v=i+1;
		    WebElement element = getDriver().findElement(By.xpath("(//div[@id='u02countrymenu']/div/ul/li/following-sibling::li/a)["+v+"]"));
		    JavascriptExecutor js = (JavascriptExecutor)getDriver();
		    js.executeScript("arguments[0].click();", element);
		    
		    
		    System.out.println("((//div[@id='u02countrymenu']/div/ul/li/following-sibling::li)["+v+"]/div/ul/li/a)[2]");
		    WebElement ele12 = getDriver().findElement(By.xpath("((//div[@id='u02countrymenu']/div/ul/li/following-sibling::li)["+v+"]/div/ul/li/a)[2]"));
//		    String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
//			JavascriptExecutor js11 = (JavascriptExecutor)getDriver();
//			js11.executeScript(mouseOverScript, ele12);
		    Actions a =new Actions(getDriver());
		    a.moveToElement(ele12).perform();
		    waitABit(3000);
//		    
//		    
//		   boolean result = getDriver().findElement(By.xpath("//a[@class='u02currentcc']")).isDisplayed();
//		   if(result)
//			{
//				Assert.assertTrue(true);
//			}
//			else
//			{
//				Assert.assertTrue(false);
//			}
		}
	}
}
