package com.WEBTECHQA.Uninavpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Contactpage extends PageObject
{
	@FindBy(xpath="//div[text()='Menu']")
    private WebElementFacade menu;
	
	
	public void click_on_contact()
	{
		WebElement element = getDriver().findElement(By.xpath("//li[@class='u02mtool']/a/span[contains(text(),'Contact')]"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
	}

	public void maximize_browser()
	{
		waitABit(1000);
		getDriver().manage().window().maximize();
	}
	
	public void is_contact_list_display()
	{
		waitABit(3000);
		boolean ele = getDriver().findElement(By.xpath("//div[@id='u02contactmenu']//h6[text()='Contact Oracle']")).isDisplayed();
		if(ele==true)
    	{
    		Assert.assertTrue(true);
    	}
    	else
    	{
    		Assert.assertTrue(false);
    	}
		
	}
	
	
}
