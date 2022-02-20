package com.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class WebElementsPF extends BaseClass{

	public WebElementsPF() {
		PageFactory.initElements(driver, this);
	}
	
	/////////////////////////////////////////////
	@FindBy(xpath = "//*[text()='Sign in']")
	private WebElement homepageSignInButton;
	public WebElement gethomepageSignInButton()
	{
		return homepageSignInButton;
	}
	//////////////////////////////////////////////
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}
	///////////////////////////////////////////////
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	private WebElement password;
	public WebElement getPassword()
	{
		return password;
	}
	//////////////////////////////////////////////
	@FindBy(xpath = "//*[contains(text(),'Sign In')]")
	private WebElement SignInButton;
	public WebElement getSignInButton()
	{
		return SignInButton;
	}
	
}
