package com.WEBTECHQA.UninavDefinition;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.WEBTECHQA.Uninavsteps.serenity.CountryListSteps;

import net.thucydides.core.annotations.Steps;

public class CountryListDefinition
{
	    @Steps
	    CountryListSteps Cuser;

	   
	    @When("user hovers over '$country'")
	    public void whenUserHoversOverCountryregion(String country)
	    {
	    	Cuser.hover_on(country);
	    }
	    
	    
	    @Then("panel must show Regions in the 1st panel and their countries in the 2nd panel")
	    public void thenPanelMustShowRegionsInThe1stPanelAndTheirCountriesInThe2ndPanel()
	    {
	    	 Cuser.region_panel_display();
		    	
		    	Cuser.countries_panel_display();
	    }
	    
	    
	    @Then("based on country site pin must appear against it")
	    public void thenBasedOnCountrySitePinMustAppearAgainstIt()
	    {
	    	Cuser.is_pin_appear();
	    }
	    
	   	
}
