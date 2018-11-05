package com.WEBTECHQA.UninavDefinition;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;

import com.WEBTECHQA.Uninavsteps.serenity.Accountsteps;

import net.thucydides.core.annotations.Steps;

public class AccountDefinition 
{

	 @Steps
	 Accountsteps ACstep;
	
	@Given("user is logged out")
	public void Givenuserisloggedout()
	{
		ACstep.is_the_home_page();
		
	}
	
	@When("user hovers over SignIn")
	public void WhenuserhoversoverSignIn()
	{
		ACstep.hover_on_SignIn();
	}
	
	@Then("Oracle and Cloud Sign In panel must be stacked")
	public void ThenOracleandCloudSignInpanelmustbestacked()
	{
		ACstep.is_panel_option_displayed();
	}
	
	
	@Given("user is logged in Oracle account")
	public void GivenuserisloggedinOracleaccount()
	{
		ACstep.is_the_home_page();
		ACstep.hover_on_signIn();
		ACstep.SignIn_account();
		
	}
	
	@When("user hovers over Account")
	public void WhenuserhoversoverAccount()
	{
		ACstep.hover_on_Account();
	}
	
	
	@Then("user name and heading Oracle account must be displayed")
	public void ThenusernameandheadingOracleaccountmustbedisplayed()
	{
		ACstep.is_oracle_account_display();
	}
	
	@Then("User verify Oracle account must have links: $table")
	public void ThenUserverifyOracleaccountmusthavelinks(ExamplesTable activityTable)
	{
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
			 String option = row.valueAs("Option", String.class);
            
          
             ACstep.is_oracle_account_options_display(option);
           
           
            
    	 }
	}
	
	@Then("User verify Oracle signin must have links: $table")
	public void thenCloudAccountMustDisplayCTALinkToFreeCloudPlatformTrial(ExamplesTable activityTable)
	{
	  
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
			 String option = row.valueAs("Option", String.class);
            
          
             ACstep.is_signin_options_display(option);
           
           
            
    	 }
		
	}
	
	
}
