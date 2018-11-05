package com.WEBTECHQA.UninavDefinition;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.WEBTECHQA.Uninavsteps.serenity.CarouselBannerSteps;

import net.thucydides.core.annotations.Steps;


public class CarouselBannerDefinition 
{
	@Steps
	CarouselBannerSteps CBStep;

	@Given("user is on the OCOM  page")
    public void userisontheOCOMpage() 
	{
		 CBStep.is_the_home_page();
	}
	
	@When("the page loads")
	public void Whenthepageloads()
	{
		CBStep.is_page_loaded();
	}
	
	@Then("menu must appear on the left of the Oracle Badge")
	public void ThenmenumustappearontheleftoftheOracleBadge()
	{
		CBStep.menu_display_on_left();
	}
    
}