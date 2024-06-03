package org.testingCode;

import org.baseclass.BaseClass;
import org.pojo.HomePagePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage extends BaseClass {
	HomePagePojo hp;
	
	@Given("open web browser")
	public void open_web_browser() {
		chromeBrowser();
		maximizePage();
	    
	}

	@When("pass webpage url to open website")
	public void pass_webpage_url_to_open_website() {
		launchUrl("https://www.flipkart.com/");
	}

	@When("click login button")
	public void click_login_button() {
		hp=new HomePagePojo();
		clickItem(hp.getLog());
		
	   
	}

	@When("pass valid email id")
	public void pass_valid_email_id() {
		passValue(hp.getEmail(), "saji@gmail.com");
	   
	}

	@When("click get otp button")
	public void click_get_otp_button() {
		clickItem(hp.getReqOtp());
	    
	}

	@Then("close the Browser")
	public void close_the_Browser() {
		
	   
	}


}
