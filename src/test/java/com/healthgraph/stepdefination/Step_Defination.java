package com.healthgraph.stepdefination;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.healthgraph.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defination {
		
	
     public static WebDriver driver1 = Test_Runner.driver;
	 Robot r;
	
	
	@SuppressWarnings("deprecation")
	@Given("^user Launch the Application$")
	public void user_Launch_the_Application() throws Throwable {
		
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

	@When("^user Buying the Desired Property$")
	public void user_Buying_the_Desired_Property() throws Throwable {
		
	    WebElement buybutton = driver1.findElement(By.xpath("(//div[@class='nb__17yFj'])[1]"));
	    buybutton.click();
	    
	}

	@When("^user Select the City$")
	public void user_Select_the_City() throws Throwable {
		
		WebElement city = driver1.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']"));
		city.click();
		
		 r = new Robot();
		 r.keyPress(KeyEvent.VK_UP);
		 r.keyRelease(KeyEvent.VK_UP);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	@When("^user Enter Locality in Search Box$")
	public void user_Enter_Locality_in_Search_Box() throws Throwable {
		
		WebElement searchbox = driver1.findElement(By.xpath("//input[@id='listPageSearchLocality']"));
		searchbox.sendKeys("malad");
		
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 searchbox.sendKeys("malad");
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 
	    
	}

	@When("^user Select the Apartment Types$")
	public void user_Select_the_Apartment_Types() throws Throwable {
		
		WebElement apartmentType = driver1.findElement(By.xpath("(//div[@class='css-v2nw5i-control nb-select__control'])[2]"));
		apartmentType.click();
		
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
	   
	}

	@When("^user Click Search button and Navigates To Property Listing Page$")
	public void user_Click_Search_button_and_Navigates_To_Property_Listing_Page() throws Throwable {
		
		WebElement searchbutton = driver1.findElement(By.xpath("//button[@class='prop-search-button btn btn-default btn-lg btn-block']"));
	    searchbutton.click();
	    
	    WebElement info = driver1.findElement(By.xpath("//div[@class='leave-intent-close-icon']"));
	    info.click();
	    
	}

	@When("^user ScrollDown the Property Page into Desired Property$")
	public void user_ScrollDown_the_Property_Page_into_Desired_Property() throws Throwable {

		WebElement property = driver1.findElement(By.xpath("(//span[@class='overflow-hidden overflow-ellipsis whitespace-nowrap max-w-80pe po:max-w-full'])[4]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver1;
		js.executeScript("arguments[0].scrollIntoView();", property);
		
	}

	@When("^user Click The Desired Property and Navigates To Property Description Page$")
	public void user_Click_The_Desired_Property_and_Navigates_To_Property_Description_Page() throws Throwable {
	
		WebElement property = driver1.findElement(By.xpath("(//span[@class='overflow-hidden overflow-ellipsis whitespace-nowrap max-w-80pe po:max-w-full'])[4]"));
		property.click();
		
	    
	}

	@When("^user ScrollDown the Selected Property Page into Description Section$")
	public void user_ScrollDown_the_Selected_Property_Page_into_Description_Section() throws Throwable {
		
		WebElement description = driver1.findElement(By.xpath("(//div[@class='nb__zmA_z nb__9LNOV'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver1;
		js.executeScript("arguments[0].scrollIntoView();", description);
	   
	}

	@Then("^user Confirm Whether The Description Present Or Not$")
	public void user_Confirm_Whether_The_Description_Present_Or_Not() throws Throwable {
		
		WebElement description = driver1.findElement(By.xpath("(//div[@class='nb__zmA_z nb__9LNOV'])[1]"));
		String text = description.getText();
		System.out.println(text);
		
		if (text.equalsIgnoreCase("Description")) {
			
			WebElement descriptionContent = driver1.findElement(By.xpath("//div[@id='description']"));
			System.out.println("Description available, as shown in below");
			String text2 = descriptionContent.getText();
			System.out.println(text2);
		}
		
		else {
			
			System.out.println("Desription not available");
		}
	    
	}

	@Then("^user Validating the TestCases$")
	public void user_Validating_the_TestCases() throws Throwable {
		
		WebElement descriptionContent = driver1.findElement(By.xpath("//div[@id='description']"));
		
		Assert.assertNotNull(descriptionContent);
		System.out.println("Description available, as shown in below");
		String conentText = descriptionContent.getText();
		System.out.println(conentText);
	   
	}
	
}

