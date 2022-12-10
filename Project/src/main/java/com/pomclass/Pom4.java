package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {
	public static WebDriver driver;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement text;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search;
	public Pom4(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver4, this);
	}
	public WebElement getText() {
		return text;
	}
	public WebElement getSearch() {
		return search;
	}
	

}
