package com.WEBTECHQA.Uninavsteps.serenity;

import com.WEBTECHQA.Uninavpages.Menupanelpage;
import com.WEBTECHQA.Uninavpages.Menusitepage;

import net.thucydides.core.annotations.Step;

public class Menusitesteps 
{
	
Menusitepage mspage;

	
	@Step
    public void is_the_home_page()
	{
		mspage.open();
		mspage.hover_on_menu();
		mspage.menu_opened();
    }
	
	
	@Step
    public void click_on_link()
	{
		mspage.hover_on_primary_panel_categories();
		mspage.hover_on_secondary_panel_catagories();
		mspage.click_on_link();
		
    }
	
	@Step
    public void is_page_navigated()
	{
		mspage.is_page_navigated();
		
    }

}
