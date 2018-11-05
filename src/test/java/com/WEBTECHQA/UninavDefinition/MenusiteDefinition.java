package com.WEBTECHQA.UninavDefinition;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.WEBTECHQA.Uninavsteps.serenity.Menusitesteps;
import net.thucydides.core.annotations.Steps;

public class MenusiteDefinition
{
	@Steps
	Menusitesteps msStep;
	

	@Given("Menu panel opened")
    public void userisontheOCOMpage() 
	{
		msStep.is_the_home_page();
	}

	@When("user clicks on a link")
	public void whenUserClicksOnALink()
	{
	   msStep.click_on_link();
	}

	@Then("user must navigate to that page")
	public void thenUserMustNavigateToThatPage() 
	{
	    msStep.is_page_navigated();
	}
}
