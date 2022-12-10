package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom6 {
	public static WebDriver driver;
	@FindBy(xpath = "//div[@id='nav-tools']//following-sibling::a[@aria-label='1 item in cart']")
	private WebElement addToCart;

	public Pom6(WebDriver driver6) {
	this.driver = driver6;
	PageFactory.initElements(driver6, this);
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	

}
