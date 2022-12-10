package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;
import com.helper.FileReaderManager;
import com.pomclass.PageObjectManager;
import com.pomclass.Pom1;
import com.pomclass.Pom2;
import com.pomclass.Pom3;
import com.pomclass.Pom4;
import com.pomclass.Pom5;
import com.pomclass.Pom6;
import com.pomclass.Pom7;
import com.pomclass.Pom8;
import com.pomclass.Pom9;
import com.pomclass.Pom99;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
    PageObjectManager POM = new PageObjectManager(driver);

	@Given("User wants to open the website")
	public void user_wants_to_open_the_website() throws InterruptedException, IOException {
		Thread.sleep(2000);
		String url = FileReaderManager.getInstance().getIntanceCr().getUrl();
		getUrl(url);

	}

	@When("User wants to click the Sigin Button")
	public void user_wants_to_click_the_sigin_button() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom1().getAcccounts());

	}

	@Then("User can proceed to next page")
	public void user_can_proceed_to_next_page() throws InterruptedException {
		System.out.println("USER PROCEED TO SIGN IN PAGE");

	}

	@Given("User should enter the vaild email id or mobile number")
	public void user_should_enter_the_vaild_email_id_or_mobile_number() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom2().getEmail());
		sendkeys(POM.getInstancePom2().getEmail(), "kiruthika1515@gmail.com");

	}

	@When("User wants to click the continue button")
	public void user_wants_to_click_the_continue_button() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom2().getProceed());

	}

	@Then("User can get into the next page")
	public void user_can_get_into_the_next_page() throws InterruptedException {
		System.out.println("USER PROCEED TO NEXT PAGE");

	}

	@Given("User should enter the valid passcode")
	public void user_should_enter_the_valid_passcode() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom3().getPassword());
		sendkeys(POM.getInstancePom3().getPassword(), "kirthi@1505");

	}

	@When("User wants to click the signIn button")
	public void user_wants_to_click_the_sign_in_button() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom3().getSubmit());

	}

	@Then("User will get into the amazon website")
	public void user_will_get_into_the_amazon_website() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("USER GET INTO AMAZON WEBSITE");

	}

	@Given("User wants to enter iphone13 in the searchbox")
	public void user_wants_to_enter_iphone13_in_the_searchbox() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom4().getText());
		sendkeys(POM.getInstancePom4().getText(), "iphone13");

	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom4().getSearch());

	}

	@Then("User can show the results")
	public void user_can_show_the_results() throws InterruptedException {
		System.out.println("USER WILL PROCEED TO NEXT PAGE");

	}

	@Given("User should click the desired item")
	public void user_should_click_the_desired_item() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom5().getImage());
	}

	@When("User will directed to next page")
	public void user_will_directed_to_next_page() {
		System.out.println("USER GETS INTO NEXT PAGE");
	}

	@Given("User wants to click the buy now option")
	public void user_wants_to_click_the_buy_now_option() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		clickOnElement(POM.getInstancePom6().getAddToCart());

	}

	@When("User can get into the payment page")
	public void user_can_get_into_the_payment_page() {
		System.out.println("USER WILL BE DIRECTED TO PAYMENT PAGE");
	}

	@Given("User wants to click the procced to payment button")
	public void user_wants_to_click_the_procced_to_payment_button() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.grtInstancePom7().getCheckOut());

	}

	@Then("User will get into next page")
	public void user_will_get_into_next_page() {
		System.out.println("USER ABLE TO SEE PAYMENT PAGE");
	}

	@Given("User should select the use this address button")
	public void user_should_select_the_use_this_address_button() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom8().getAddress());

	}

	@Then("User will directed to payment page")
	public void user_will_directed_to_payment_page() {
		System.out.println("USER WILL DIRECTED TO PAYMENT PAGE");
	}

	@Given("User want to click cvv button")
	public void user_want_to_click_cvv_button() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom9().getCvv());

	}

	@When("User should enter the cvv number")
	public void user_should_enter_the_cvv_number() throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(POM.getInstancePom9().getCvv(), "847");
	}

	@Then("User will proceed to confirm the order")
	public void user_will_proceed_to_confirm_the_order() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom9().getUse());
	}

	@Given("User shoul click the logout icon")
	public void user_shoul_click_the_logout_icon() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(POM.getInstancePom99().getLogOut());
	}

	@Then("User logged out successfully")
	public void user_logged_out_successfully() {
		System.out.println("USER LOGGED OUT SUCCEESSFULLY");
	}

}
