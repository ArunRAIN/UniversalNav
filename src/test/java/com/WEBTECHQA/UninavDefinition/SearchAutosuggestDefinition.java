package com.WEBTECHQA.UninavDefinition;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.WEBTECHQA.Uninavsteps.serenity.Contactsteps;
import com.WEBTECHQA.Uninavsteps.serenity.SearchAutosuggestSteps;

import net.thucydides.core.annotations.Steps;

public class SearchAutosuggestDefinition
{
	@Steps
	SearchAutosuggestSteps sastep;
	

	@Given("user clicked in the search field")
	public void Givenuserclickedinthesearchfield()
	{
		sastep.is_the_home_page();
		sastep.click_searchIcon();
	}
	
	
	@When("user begins to type keyword '$option'")
	public void Whenuserbeginstotypekeyword(String option) 
	{
		sastep.type_keyword(option);
	}

	@Then("auto suggestion must appear")
	public void Thenautosuggestionmustappear() 
	{
		sastep.Autosuggestion_display();
	}

	
	@Given("autosuggest appears")
	public void Givenautosuggestappears()
	{
		sastep.is_the_home_page();
		sastep.click_searchIcon();
		sastep.type_keyword("ora");
		sastep.Autosuggestion_display();
	}
	
	@When("user clicks outside the search field")
	public void Whenuserclicksoutsidethesearchfield()
	{
		sastep.click_outside_searchbox();
	}
	
	@Then("autosuggest must retract")
	public void Thenautosuggestmustretract()
	{
		sastep.verify_Autosuggestion_not_display();
	}

	@Given("autosuggestion retracted")
	public void Givenautosuggestionretracted()
	{
	   sastep.is_the_home_page();
	   sastep.click_searchIcon();
	   sastep.type_keyword("ora");
	   sastep.Autosuggestion_display();
	   sastep.click_outside_searchbox();
	   sastep.verify_Autosuggestion_not_display();
	}
	
	@When("user continues to enterkeyword")
	public void Whenusercontinuestoenterkeyword()
	{
		sastep.type_keyword("man");
	}
	
	
	@Then("autosuggest must reappear")
	public void Thenautosuggestmustreappear()
	{
		sastep.Autosuggestion_display();
	}
	
	@Given("search field shows autosuggestions")
	public void Givensearchfieldshowsautosuggestions()
	{
		   sastep.is_the_home_page();
		   sastep.click_searchIcon();
		   sastep.type_keyword("ora");
		   sastep.Autosuggestion_display();
	}
	
	@When("user selects an option and clickssearch icon")
	public void Whenuserselectsanoptionandclickssearchicon()
	{
		sastep.click_on_option();
	}
	
	@Then("results must be displayed on Oracle search page")
	public void ThenresultsmustbedisplayedonOraclesearchpage()
	{
		sastep.Expected_page("Oracle.com Search");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Then("User Enters keyword '$data' and hit enter results must be displayed in '$title' page")
//	public void thenUserEnterAKeywordoracleSelectOneOfTheOptionsFromAutosuggestAndHitEnterResultsMustBeDisplayedInOraclecomSearchPage(String data,String title)
//	{
//	 
//		sastep.type_keyword(data);
//		
//		sastep.press_Enter();
//		
//		sastep.Expected_page(title);
//	}
//
//	@Then("User Enters keyword '$data' and click search icon results must be displayed in '$title' page")
//	public void thenUserEnterAKeywordoracleOrSelectOneOfTheOptionsFromAutosuggestAndClickSearchIconResultsMustBeDisplayedInOraclecomSearchPage(String data,String title)
//	{
//	  
//		
//		sastep.type_keyword(data);
//		
//		sastep.click_searchIcon();
//		
//		sastep.Expected_page(title);
//		
//	}
//	
//
//	@Then("User Enters keyword '$option' and once autosuggestion appears, click outside the search field and verify that the autosuggest retracts")
//	public void thenUserContinuationFromPreviousStepStartEnteringKeywordAgainAndAutosuggestMustReappear(String option) 
//	{
//		sastep.type_keyword(option);
//		
//
//		sastep.click_outside_searchbox();
//		
//		sastep.is_Autosuggestion_not_display();
//		
//	}

}
