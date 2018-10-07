package com.qa.stepdefinitions;

import java.io.IOException;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {

	LoginPage login;
	HomePage home;

	public HomePageSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^user opens browser$")
	public void user_opens_browser() throws IOException {

		initialization();
//		home.setAcceptCookies();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws IOException {

		login = new LoginPage();
		String logintitile = login.validateLoginPagetitle();
		Assert.assertEquals("Where Experiences are Engineered - Valtech", logintitile);
		home = new HomePage();
		home.verifyRecentBlogsDisplayed();

		System.err.println("verification done ");
	}

	@Then("^user logs into app$")
	public void user_enters_username_and_password() throws InterruptedException, IOException {

		home = new HomePage();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate homepage title$")
	public void validate_homepage_title() {

		String homepagetitle = home.verifyHomePagetitle();
		Assert.assertEquals("CRMPRO", homepagetitle);
	}

	/*
	 * @Then("^validate logged in username$") public void
	 * validate_logged_in_username() {
	 * 
	 * Assert.assertTrue(home.verifyCorrectUserName()); }
	 */

}
