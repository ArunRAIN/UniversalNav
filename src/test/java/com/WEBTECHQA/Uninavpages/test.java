package com.WEBTECHQA.Uninavpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.By;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        
        driver.get("https://www.oracle.com/index.html?betamode=17.5.0");
        
        
        //int a1=20;
         //System.out.println(a1);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String name=js.executeScript("return navigator.appCodeName").toString();
        System.out.println(name);
        
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("//li[@class='u02mtool u02toolsloggedout']//span[text()='Sign In']"));
//		String mouseOverScript ="if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript(mouseOverScript, ele2);
		
        

		
		Actions a=new Actions(driver);
		a.moveToElement(ele2).perform();
	}

}
