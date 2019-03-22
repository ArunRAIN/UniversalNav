package com.WEBTECHQA.Uninavsteps.serenity;

import com.WEBTECHQA.Uninavpages.Searchpage;

import net.thucydides.core.annotations.Step;

public class searchsteps 
{
	Searchpage scpage;
	
	@Step
    public void is_the_home_page()
	{
		scpage.open();
    }
	
	@Step
    public void global_nav_loads()
	{
		scpage.is_page_loaded();
    }
	
	@Step
    public void maximize_browser()
	{
		scpage.maximize_browser();
    }
	
	@Step
	public void type_keyword(String option)
	{
		scpage.type_keyword(option);
	}
	
	@Step
	public void Autosuggestion_display()
	{
		scpage.verify_Autosuggestion_display();
	}
	
	@Step
	public void click_outside_searchbox()
    {
		scpage.click_outside_searchbox();
    }
	
	
	@Step
    public void is_search_icon_display()
	{
		scpage.is_search_icon_displayed();
    }
	
	@Step
    public void click_on_search_icon()
	{
		scpage.click_on_search_icon();
    }
	
	@Step
    public void is_search_field_open()
	{
		scpage.is_search_field_open();
    }
	
	@Step
    public void is_focus_on_searchbox()
	{
		scpage.is_focus_on_textbox();
    }
	
	
	@Step
    public void click_on_outside_searchbox()
	{
		scpage.click_on_outside_searchbox();
    }
	
	@Step
    public void is_search_inactive_state()
	{
		scpage.is_search_inactive_state();
    }
	
	@Step
    public void enter_keyword_in_searchbox()
	{
		scpage.enter_keyword_in_searchbox();
    }
	
	
	@Step
    public void is_page_navigated()
	{
		scpage.is_page_navigated();
    }

}
