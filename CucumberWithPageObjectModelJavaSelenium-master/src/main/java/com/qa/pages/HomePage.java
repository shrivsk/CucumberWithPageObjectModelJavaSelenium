package com.qa.pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

    @FindBy(xpath="//*[@id='CybotCookiebotDialogBodyButtonAccept']")
    WebElement acceptCookies;

    @FindBy(xpath = "//*[@id='container']/div[2]/div[3]/section/div/div[1]/header")
	WebElement recentBlogs;

    @FindBy(xpath = "//*[@id='container']/div[2]/div[3]/section/div/div[2]/article/div/h3/a")
	WebElement firstBlogArticle;

    @FindBy(xpath = "//*[@id='container']/article")
	WebElement recentBlogsPage;

	public HomePage() throws IOException {
		//super();
		PageFactory.initElements(driver, this);
		acceptCookies.click();
	}

	public String verifyHomePagetitle()	{
		return driver.getTitle();
	}

	public String verifyRecentBlogsDisplayed()	{
		Assert.assertEquals(recentBlogs.getText(),"RECENT BLOGS");
		return recentBlogs.getText();
	}

	public void clickOnfirstBlogArticlelink(){
		Assert.assertEquals(firstBlogArticle.isDisplayed(),true);
		Assert.assertEquals(firstBlogArticle.getText(),"The future for DevOps");
		firstBlogArticle.click();
	}

	public void verifyRecentBlogePage(){
		recentBlogsPage.isDisplayed();
	}

}
