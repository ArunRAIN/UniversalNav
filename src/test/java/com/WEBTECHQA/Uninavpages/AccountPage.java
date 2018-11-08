package com.WEBTECHQA.Uninavpages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WEBTECHQA.UniNav.Genric;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends PageObject
{
	
	@FindBy(id="sso_username")
    private WebElementFacade usrname;
	
	@FindBy(id="ssopassword")
    private WebElementFacade pwd;

    @FindBy(xpath="//a[contains(text(),'Sign In')]")
    private WebElementFacade signbtn;
    
 
    @FindBy(xpath="//input[@type='button']")
    private WebElementFacade signbtn2;

	
    
    public void maximize_browser()
	{
		waitABit(1000);
		getDriver().manage().window().maximize();
	}
	
    
	public void is_not_signedIn()
	{
		boolean ele = getDriver().findElement(By.xpath("//li[@class='u02mtool u02toolsloggedout']//span[text()='Sign In']")).isDisplayed();
	
			    if(ele)
			    { 	
					 Assert.assertTrue(true);
			    }
			    else
			    {
			    	WebElement ele2 = getDriver().findElement(By.xpath("//li[@class='u02mtool u02toolsloggedout']//span[text()='Account']"));
			    	Actions a=new Actions(getDriver());
	    			a.moveToElement(ele2).perform();
	    			
	    			
			        waitABit(3000);
			        
			        WebElement ele3 = getDriver().findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
					   JavascriptExecutor js2 = (JavascriptExecutor)getDriver();
				    	js2.executeScript("arguments[0].click();", ele3);
					   waitABit(3000);	
			    
			    }
	}
	
	
	public void hover_on_signIn()
	{
		waitABit(3000);
		WebElement ele2 = getDriver().findElement(By.xpath("//li[@class='u02mtool u02toolsloggedout']//span[text()='Sign In']"));
		String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript(mouseOverScript, ele2);
	}
	
	
	public void is_panel_option_displayed()
	{
		int le=getDriver().findElements(By.xpath("//div[@class='u02user u02toolpop']/div/div[position()>1]//h5")).size();

		for(int i=0;i<le;i++)
		{
			int j=i+1;
			boolean ele = getDriver().findElement(By.xpath("(//div[@class='u02user u02toolpop']/div/div[position()>1]//h5)["+j+"]")).isDisplayed();
			 if(ele)
			    { 	
					 Assert.assertTrue(true);
			    }
			    else
			    {
			    	 Assert.assertTrue(false);
			    }
		}
		
	}
	
	public void click_on_signin()
	{
		WebElement ele = getDriver().findElement(By.xpath("//div[@class='u02userinw1 u02userloggedout']//h5[text()='Oracle Account']/../div/a[text()='Sign in']"));
		JavascriptExecutor js2 = (JavascriptExecutor)getDriver();
	    js2.executeScript("arguments[0].click();", ele);
	    
	} 
	
    


public void SignIn_account()
{
	
	Genric.getPropertyValue("");
	WebDriverWait wait=new WebDriverWait(getDriver(),300);
	wait.until(ExpectedConditions.visibilityOf(usrname));
    usrname.type(Genric.getPropertyValue("UN"));
    pwd.type(Genric.getPropertyValue("PW"));
    //signbtn.click();
    System.out.println("hi");
    List<WebElement> count=getDriver().findElements(By.xpath("//input[@type='button']"));
    System.out.println(count.size());
    if(count.size()==1)
    {
        if(getDriver().findElement(By.xpath("//input[@type='button']")).isDisplayed())
        {
        		JavascriptExecutor js = (JavascriptExecutor)getDriver();
    	js.executeScript("arguments[0].click();", signbtn2);
    	waitABit(4000);
        }
        else
        {
        	JavascriptExecutor js = (JavascriptExecutor)getDriver();
        	js.executeScript("arguments[0].click();", signbtn);
        	waitABit(4000);
        }
    }
    else
    {
    	JavascriptExecutor js = (JavascriptExecutor)getDriver();
    	js.executeScript("arguments[0].click();", signbtn);
    	waitABit(4000);
    }
}


	public void hover_on_Account()
	{
		waitABit(8000);
		WebElement ele2 = getDriver().findElement(By.xpath("//li[@class='u02mtool u02toolsloggedin']//span[text()='Account']"));
		String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript(mouseOverScript, ele2);
		
	}
	
	public void is_oracle_account_display()
	{
		waitABit(3000);
		boolean ele = getDriver().findElement(By.xpath("//div[@class='u02userinw1 u02userloggedin']//h5[text()='Oracle Account']")).isDisplayed();
		if(ele)
	    { 	
			 Assert.assertTrue(true);
	    }
	    else
	    {
	    	 Assert.assertTrue(false);
	    }
	}
	
	public void link_option_displayed(String option)
	{
		int ele22 = getDriver().findElements(By.xpath("//div[@class='u02userinw1 u02userloggedin']//a[contains(text(),'"+option+"')]")).size();
   	    if(ele22==1)
   	    {
   	    	Assert.assertTrue(true);
   	    }
   	    else
   	    {
   	    	Assert.assertTrue(false);
   	    }
	
	}
	
	public void signin_option_displayed(String option)
	{
		int ele22 = getDriver().findElements(By.xpath("//h5[text()='Cloud Account']/../..//a[text()='"+option+"']")).size();
   	    if(ele22==1)
   	    {
   	    	Assert.assertTrue(true);
   	    }
   	    else
   	    {
   	    	Assert.assertTrue(false);
   	    }
	
	}
	
	
	
}

	