package com.WEBTECHQA.Uninavsteps.serenity;

import com.WEBTECHQA.Uninavpages.Menupanelpage;

import net.thucydides.core.annotations.Step;

public class Menupanelsteps 
{

    Menupanelpage mppage;
	
	@Step
    public void is_the_home_page()
	{
		mppage.open();
    }
	
	@Step
    public void maximize_browser()
	{
		mppage.maximize_browser();
		mppage.hover_on_menu();
    }
	
	@Step
    public void global_nav_loads()
	{
		mppage.is_page_loaded();
    }
	
	@Step
    public void hover_on_menu()
	{
		mppage.hover_on_menu();
    }
	
	  @Step
	   public void shows_primary_panel_with_categories()
	   {
	     
		  mppage.verify_primarypanel_with_categories();
		   
		  
	     
	   }
	   
	   @Step
	   public void hover_on_primary_panel_categories()
	   {
		   mppage.hover_on_primary_panel_categories();

	   }
	   
	   
	   @Step
	   public void shows_secondary_panel()
	   {
		   mppage.verify_secondary_panel_displays();
	     
	   }
	   
	   
	   @Step
	   public void hover_on_Secondary_panel_categories()
	   {
		   mppage.hover_on_secondary_panel_catagories();
		   
		   

	   }
	   
	   @Step
	   public void shows_Categories_with_direct_link()
	   {
		   mppage.shows_categories_with_direct_link();
		   

	   }
	   
	   @Step
	    public void is_home_page()
		{
		   mppage.open();
		   mppage.hover_on_menu();
		   mppage.menu_opened();
	    }
		

		
		
		@Step
	    public void click_on_link()
		{
			mppage.hover_on_primary_panel_categories();
			mppage.hover_on_secondary_panel_catagories();
			mppage.click_on_link();
			
	    }
		
		@Step
	    public void is_page_navigated()
		{
			mppage.is_page_navigated();
			
	    }
	   
		   @Step
		   public void menu_display_on_left()
		   {
			  
		   }
		
		@Step
	    public void is_page_loaded()
		{
			mppage.is_page_loaded();
	    }
	
}
