package com.WEBTECHQA.UninavDefinition;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.WEBTECHQA.Uninavsteps.serenity.Menupanelsteps;

import net.thucydides.core.annotations.Steps;

public class Menupaneldefinition 
{
	@Steps
	Menupanelsteps MPStep;

	@Given("Global Nav loads")
    public void GivenGlobalNavloads() 
	{
		 MPStep.is_the_home_page();
		 MPStep.global_nav_loads();
	}
	
	@When("user hovers over menu icon")
	public void Whenuserhoversovermenuicon()
	{
		MPStep.hover_on_menu();
	}
	
	@Then("panels must load progressively")
	public void Thenpanelsmustloadprogressively()
	{
		MPStep.hover_on_primary_panel_categories();
		MPStep.shows_primary_panel_with_categories();
		MPStep.hover_on_Secondary_panel_categories();
		MPStep.shows_Categories_with_direct_link();
	}

}
