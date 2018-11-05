package com.WEBTECHQA.Uninavsteps.serenity;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.WEBTECHQA.Uninavpages.SearchAutosuggestPage;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

public class SearchAutosuggestSteps 
{
	SearchAutosuggestPage SaPage;
	
	
	 @Step
	    public void is_the_home_page()
		{
	    	SaPage.open();
			
	    }
		
	 
	@Step
	public void type_keyword(String option)
	{
		SaPage.type_keyword(option);
	}
	
	@Step
	public void Autosuggestion_display()
	{
		SaPage.verify_Autosuggestion_display();
	}
	
	@Step
	public void click_outside_searchbox()
    {
    	SaPage.click_outside_searchbox();
    }
	
	@Step
	public void verify_Autosuggestion_not_display()
    {
		SaPage.verify_Autosuggestion_not_display();
    }
	
	@Step
	public void click_on_option()
	{
		SaPage.click_on_option();
	}
//	
//	@Step
//	public void click_outside_searchbox()
//	{
//		
//		SaPage.click_outside_searchbox();
//	}
//	
//	@Step
//	public void press_Enter()
//	{
//		SaPage.hit_Enter();
//	}
//	
	@Step
	public void Expected_page(String title)
	{
		SaPage.is_page(title);
	}
//	
	@Step
	public void click_searchIcon()
	{
		SaPage.click_serch_Icon();
	}
//	
//	@Step
//	public void navigate_page()
//	{
//		
//		SaPage.click_outside_searchbox();
//	}
}
