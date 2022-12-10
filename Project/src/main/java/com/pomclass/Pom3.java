package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement submit;
	public Pom3(WebDriver driver3) {
    this.driver = driver3;
    PageFactory.initElements(driver3, this);
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	

}
