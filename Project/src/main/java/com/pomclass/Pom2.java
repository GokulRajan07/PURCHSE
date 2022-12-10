package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement proceed;
	public Pom2(WebDriver driver2) {
	this.driver = driver2;
    PageFactory.initElements(driver2, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getProceed() {
		return proceed;
	}
	
	
	

}
