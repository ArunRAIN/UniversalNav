package com.WEBTECHQA.Uninavpages;

import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.pages.PageObject;

public class CarouselBannerPage extends PageObject
{
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
	
}