package com.WEBTECHQA.UninavDefinition;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.WEBTECHQA.Uninavsteps.serenity.Menupanelsteps;
import com.WEBTECHQA.Uninavsteps.serenity.searchsteps;

import net.thucydides.core.annotations.Steps;

public class searchdefinition 
{
	
	@Steps
	searchsteps scStep;
	

	@Given("user is on the OCOM  page")
    public void userisontheOCOMpage() 
	{
		 scStep.is_the_home_page();
	}

	@When("Global Nav loads")
    public void GivenGlobalNavloads() 
	{
		 
		 scStep.global_nav_loads();
	}
	
	@Then("Search text must be followed with a search icon")
	public void ThenSearchtextmustbefollowedwithasearchicon()
	{ 
		scStep.is_search_icon_display();
	}
	
	@When("user clicks on the search icon")
	public void whenUserClicksOnTheSearchIcon() 
	{
	  scStep.click_on_search_icon();
	}

	@Then("search field must open")
	public void thenSearchFieldMustOpen()
	{
	   scStep.is_search_field_open();
	}
	
	
	
	@Given("user clicked onsearch icon")
	public void givenUserClickedOnsearchIcon() 
	{
		scStep.is_the_home_page();
	  scStep.click_on_search_icon();
	}

	@When("search field opens")
	public void whenSearchFieldOpens() 
	{
	  //scStep.is_search_field_open();
	}

	@Then("text search and cursor must appear in the field")
	public void thenTextSearchAndCursorMustAppearInTheField()
	{
	  scStep.is_focus_on_searchbox();
	}
	
	
	@Given("search box in open")
	public void givenSearchBoxInOpen() {
		scStep.is_the_home_page();
		scStep.click_on_search_icon();
	    scStep.is_search_field_open();
	}

	@When("user clicks away from search field")
	public void whenUserClicksAwayFromsearchField() 
	{
	  
		scStep.click_on_outside_searchbox();
	}

	@Then("search must show inactive state")
	public void thenSearchMustShowinactiveState()
	{
	    scStep.is_search_inactive_state();
	}

	
	@Given("user entered a keyword")
	public void givenUserEnteredAKeyword()
	{
		scStep.is_the_home_page();
	  scStep.enter_keyword_in_searchbox();
	}

	@When("user clicks onsearch icon")
	public void whenUserClicksOnsearchIcon()
	{
	  scStep.click_on_search_icon();
	}

	@Then("user must navigate to site search page")
	public void thenUserMustNavigateToSiteSearchPage()
	{
	   scStep.is_page_navigated();
	}


}