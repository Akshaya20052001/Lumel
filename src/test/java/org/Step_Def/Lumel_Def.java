package org.Step_Def;

import static org.junit.Assert.assertEquals;

import org.Base_Class.Lumel_Base;
import org.Pom.Lumel_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lumel_Def extends Lumel_Base{
	Lumel_Page lumel_Page;
	
	
    
	
	@Given("User launch the url")
	public void user_launch_the_url() {
	   launchBrowser();
	   window_Maximize();
	   url("https://lumel.com/");
	}
	@When("User click on Explore our products")
	public void user_click_on_explore_our_products() {
		driver.findElement(Lumel_Page.exploreProducts).click();
	}
	@When("User click on Reference\\/ Meta Data Management")
	public void user_click_on_reference_meta_data_management() {
		driver.findElement(Lumel_Page.referenceMeta).click();
	   
	}
	@When("User click on Explore Writeback Matrix on planning")
	public void user_click_on_explore_writeback_matrix_on_planning() throws InterruptedException {
		  window_Handles();
		Thread.sleep(7000);
		driver.findElement(Lumel_Page.matrix).click();
		
	}
	@When("User click on Start trial to register")
	public void user_click_on_start_trial_to_register() throws InterruptedException {
		Thread.sleep(5000);
//		JavascriptExecutor Js = (JavascriptExecutor)driver;
//	    Js.executeScript("arguments[0].scrollIntoView()",Lumel_Page.startTrail);
		driver.findElement(Lumel_Page.startTrail).click();
	}
	@When("User enter the Fields and Register")
	public void user_enter_the_fields_and_register() throws InterruptedException {
	
		driver.findElement(Lumel_Page.firstName).sendKeys("Ramya");
		driver.findElement(Lumel_Page.lastName).sendKeys("Vasu");
		driver.findElement(Lumel_Page.microsoftEmail).sendKeys("username@domain.com");
		driver.findElement(Lumel_Page.company).sendKeys("EKO");
		driver.findElement(Lumel_Page.inforiverUser).sendKeys("2");
		driver.findElement(Lumel_Page.description).sendKeys("Hello");
		Thread.sleep(5000);
		driver.findElement(Lumel_Page.popup_Decline).click();
		driver.findElement(Lumel_Page.register).click();
		Thread.sleep(5000);
		
	}
	@Then("User verify the Registration Successful Message")
	public void user_verify_the_registration_successful_message() {
		WebElement element = driver.findElement(Lumel_Page.successful_Msg); // Locate the element
		String actualMessage = element.getText(); // Get the text from the element
		assertEquals("Registration Successful!", actualMessage);
		System.out.println("Registration Successful!");
	}


	


}
