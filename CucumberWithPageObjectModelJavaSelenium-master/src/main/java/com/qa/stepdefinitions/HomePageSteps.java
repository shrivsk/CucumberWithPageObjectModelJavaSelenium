package com.qa.stepdefinitions;

import java.io.IOException;

import com.qa.base.TestBase;
import com.qa.pages.*;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageSteps extends TestBase {

    BlogPage blog;
    HomePage home;
    AboutPage about;
    ServicesPage service;
    WorkPage work;
    ContactPage contact;

    public HomePageSteps() throws IOException {

    }


    @Given("^user opens browser$")
    public void user_opens_browser() throws IOException {
        initialization();
    }

    @When("^user is on veltech home page$")
    public void user_is_on_veltech_home_page() throws IOException {
        home = new HomePage();
        String homepagetitile = home.verifyHomePagetitle();
        org.junit.Assert.assertEquals("Where Experiences are Engineered - Valtech", homepagetitile);
        home.verifyRecentBlogsDisplayed();
        home.clickOnfirstBlogArticlelink();

    }

    @Then("^validate homepage title$")
    public void validateHomepageTitle() {
        String homepagetitle = home.verifyHomePagetitle();
        org.junit.Assert.assertEquals("Where Experiences are Engineered - Valtech", homepagetitle);
    }

    @When("^User is on the recent blogs page$")
    public void userIsOnTheRecentBlogsPage() throws InterruptedException, IOException {
        home.verifyRecentBlogePage();
    }

    @Then("^validate recent blogs page title$")
    public void validateBlogPageTitle() throws IOException {
        blog = new BlogPage();
        String blogpagetitile = blog.validateBlogPagetitle();
        org.junit.Assert.assertEquals("Where Experiences are Engineered - Valtech", blogpagetitile);
    }


    @And("^count the total number of office$")
    public void countTheTotalNumberOfOffice() throws IOException {
        contact = new ContactPage();
        contact.openContactPage();
        contact.countValtechOffice();

    }

    @And("^validate about page header h(\\d+)$")
    public void validateAboutPageHeaderH(int arg0) throws IOException, InterruptedException {
        about = new AboutPage();
        about.clickOnAboutHyperLink();
        about.validateWorkHdader();
    }

    @And("^validate work page header h(\\d+)$")
    public void validateWorkPageHeaderH(int arg0) throws IOException, InterruptedException {
        work = new WorkPage();
        work.clickOnWorkHyperLink();
        work.validateTitalH1();
    }

    @And("^validate service page header h(\\d+)$")
    public void validateServicePageHeaderH(int arg0) throws IOException, InterruptedException {
        service = new ServicesPage();
        service.clickOnServicesHyperLink();
        service.validateTitalH1();

    }
}
