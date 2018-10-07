package com.qa.stepdefinitions;

import java.io.IOException;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


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

	@Then("^user is on veltech home page$")
	public void user_is_on_veltech_login_page() throws IOException {

		login = new LoginPage();
		String logintitile = login.validateLoginPagetitle();
		org.junit.Assert.assertEquals("Where Experiences are Engineered - Valtech", logintitile);
		home = new HomePage();
		home.verifyRecentBlogsDisplayed();

		System.err.println("verification done ");
		home.clickOnfirstBlogArticlelink();
		System.err.println("verification done for click on blog artical link ");
	}


	@Then("^validate recent blogs page title$")
	public void validate_homepage_title() {


	}

	@Then("^User is on the recent blogs page$")
	public void userIsOnTheRecentBlogsPage() throws InterruptedException, IOException {

	}

	@Then("^validate homepage title$")
	public void validateHomepageTitle() {
		String homepagetitle = home.verifyHomePagetitle();
		org.junit.Assert.assertEquals("Where Experiences are Engineered - Valtech", homepagetitle);
	}
}
