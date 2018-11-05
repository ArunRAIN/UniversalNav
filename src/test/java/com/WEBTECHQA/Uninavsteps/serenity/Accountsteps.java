package com.WEBTECHQA.Uninavsteps.serenity;

import com.WEBTECHQA.Uninavpages.AccountPage;
import net.thucydides.core.annotations.Step;

public class Accountsteps 
{

    AccountPage AcPage;
	
    @Step
	public void is_the_home_page() 
	{
    	AcPage.open();
	}
    
    @Step
	public void is_logged_out() 
	{
    	AcPage.is_not_signedIn();
	}
    
    @Step
	public void hover_on_SignIn() 
	{
    	AcPage.hover_on_signIn();
	}
    
    
    
    @Step
	public void is_panel_option_displayed() 
	{
    	AcPage.is_panel_option_displayed();
	}
    
    @Step
	public void hover_on_signIn() 
	{
    	AcPage.hover_on_signIn();
	}
    
    @Step
	public void SignIn_account() 
	{
    	AcPage.click_on_signin();
    	AcPage.SignIn_account();
	}
	
    @Step
	public void hover_on_Account() 
	{
    	AcPage.hover_on_Account();
	}
    
    @Step
   	public void is_oracle_account_display() 
   	{
       	AcPage.is_oracle_account_display();
   	}
    
    @Step
   	public void is_oracle_account_options_display(String option) 
   	{
       	AcPage.link_option_displayed(option);
   	}
    
    @Step
   	public void is_signin_options_display(String option) 
   	{
       	AcPage.signin_option_displayed(option);
   	}
    
    
    
    
    
}
