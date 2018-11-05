package com.WEBTECHQA.Uninavsteps.serenity;


import com.WEBTECHQA.Uninavpages.CarouselBannerPage;

import net.thucydides.core.annotations.Step;


public class CarouselBannerSteps 
{

	CarouselBannerPage CBpage;
	
	@Step
    public void is_the_home_page()
	{
		CBpage.open();
		
		
    }
	
	@Step
    public void is_page_loaded()
	{
		CBpage.is_page_loaded();
    }
	
	   @Step
	   public void menu_display_on_left()
	   {
		  
	   }
	
}