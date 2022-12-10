package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom9 {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement cvv;
	@FindBy(xpath = "(//span[@class='a-button-inner'])[7]")
	private WebElement use;
	public Pom9(WebDriver driver9) {
	this.driver = driver9;
	PageFactory.initElements(driver9, this);
	}
	
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getUse() {
		return use;
	}
	
}
