package com.WEBTECHQA.UninavDefinition;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.WEBTECHQA.Uninavsteps.serenity.Contactsteps;
import com.WEBTECHQA.Uninavsteps.serenity.Menupanelsteps;

import net.thucydides.core.annotations.Steps;

public class Contactdefinition 
{
	@Steps
	Contactsteps ctStep;
	
	@Given("user has contact in the nav")
	public void givenUserHascontactInTheNav()
	{
	  ctStep.is_the_home_page();
	}

	@When("user clicks on the link")
	public void whenUserClicksOnTheLink() 
	{
	   ctStep.click_on_contact();
	}

	@Then("contact list must open")
	public void thenContactListMustOpen()
	{
	  ctStep.is_contact_list_display();
	}


}
