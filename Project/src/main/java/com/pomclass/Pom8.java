package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom8 {
	public static WebDriver driver;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement address;

	public Pom8(WebDriver driver8) {
		this.driver = driver8;
		PageFactory.initElements(driver8, this);
	}

	public WebElement getAddress() {
		return address;
	}
	

}
