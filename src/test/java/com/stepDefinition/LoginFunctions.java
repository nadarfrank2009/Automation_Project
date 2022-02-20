package com.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.PageFactory.WebElementsPF;
import com.utilities.CommonUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctions extends BaseClass{

	WebElementsPF pf;

	@Given("User is able to open browser")
	public void user_is_able_to_open_browser() {
		pf = PageFactory.initElements(driver, WebElementsPF.class);

	}

	@Given("User is able to enter {string} url")
	public void user_is_able_to_enter_url(String url) {
		driver.get(url);

	}

	@When("User clicks on homepage Sign in button")
	public void user_clicks_on_homepage_sign_in_button() {
		CommonUtilities.getExplicitWait(pf.gethomepageSignInButton(),10);
		pf.gethomepageSignInButton().click();

	}

	@When("User enters their email {string} and password {string}")
	public void user_enters_their_email_and_password(String email, String password) throws IOException {
		CommonUtilities.getHighLighter(pf.getEmail());
		pf.getEmail().sendKeys(email);
		pf.getPassword().sendKeys(password);
		CommonUtilities.takeScreenShoot();

	}

	@When("User clicks on Sign In button")
	public void user_clicks_on_sign_in_button() {
		
		CommonUtilities.getJsClick(pf.getSignInButton()); //another way to click
		//CommonUtilities.actionsClick(pf.getSignInButton()); //alternate way to click
		//pf.getSignInButton().click();
		
		
	}

	@Then("User is taken to their hotwire account")
	public void user_is_taken_to_their_hotwire_account() {


	}

}
