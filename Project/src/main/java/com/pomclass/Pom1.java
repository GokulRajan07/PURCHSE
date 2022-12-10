package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	public static WebDriver driver;
	
	public Pom1(WebDriver driver1) {
	this.driver = driver1;
	PageFactory.initElements(driver1, this);
	}

	public WebElement getAcccounts() {
		return acccounts;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement acccounts;
			
	@FindBy(xpath = "(//span[text()='Sign in'])[2]")
	private WebElement signIn;
	
	
	

	
	
	
	
	
}
