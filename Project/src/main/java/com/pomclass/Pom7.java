package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom7 {
	public static WebDriver driver;
	@FindBy(xpath = "//span[@class='celwidget']")
	private WebElement checkOut;

	public Pom7(WebDriver driver7) {
		this.driver = driver7;
		PageFactory.initElements(driver7, this);
	}

	public WebElement getCheckOut() {
		return checkOut;
	}
	

}
