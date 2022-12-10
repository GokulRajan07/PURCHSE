package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom5 {
	public static WebDriver driver;
	@FindBy(xpath = "(//img[@class='s-image'])[1]")
	private WebElement image;

	public Pom5(WebDriver driver5) {
	this.driver = driver5;
	PageFactory.initElements(driver5, this);
	}

	public WebElement getImage() {
		return image;
	}
	

}
