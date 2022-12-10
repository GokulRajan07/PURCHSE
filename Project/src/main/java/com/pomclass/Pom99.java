package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom99 {
	public static WebDriver driver;
	@FindBy(xpath = "//img[@alt='Website is secured with SSL']")
	private WebElement logOut;

	public Pom99(WebDriver driver10) {
		this.driver = driver10;
		PageFactory.initElements(driver10, this);
	}

	public WebElement getLogOut() {
		return logOut;
	}
	

}
