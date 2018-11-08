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
	
	@Given("user is on the ocom page")
    public void Givenuserisontheocompage() 
	{
		MPStep.is_the_home_page();
		MPStep.maximize_browser();
	}
	
	@When("the page load")
	public void Whenthepageload()
	{
		MPStep.is_page_loaded();
	}

	@Then("menu must appear on the left of the Oracle Badge")
	public void ThenmenumustappearontheleftoftheOracleBadge()
	{
		MPStep.menu_display_on_left();
	}
	@Given("Global Nav loads")
    public void GivenGlobalNavloads() 
	{
		 MPStep.is_the_home_page();
		 MPStep.maximize_browser();
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
	
	@Given("Menu panel opened")
    public void userisontheOCOMpage() 
	{
		MPStep.is_the_home_page();
		MPStep.maximize_browser();
		
	}

	@When("user clicks on a link")
	public void whenUserClicksOnALink()
	{
		MPStep.click_on_link();
	}

	@Then("user must navigate to that page")
	public void thenUserMustNavigateToThatPage() 
	{
		MPStep.is_page_navigated();
	}

}
