package com.WEBTECHQA.Uninavsteps.serenity;

import com.WEBTECHQA.Uninavpages.Contactpage;
import net.thucydides.core.annotations.Step;

public class Contactsteps 
{
    Contactpage ctpage;
	
    @Step
    public void is_the_home_page()
	{
    	ctpage.open();
		
    }
	
    @Step
    public void maximize_browser()
	{
    	ctpage.maximize_browser();
    }
	
	@Step
    public void click_on_contact()
	{
		ctpage.click_on_contact();
    }
	
	
	@Step
    public void is_contact_list_display()
	{
		ctpage.is_contact_list_display();
    }

}
