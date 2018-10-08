package com.qa.pages;

import com.qa.base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class BlogPage extends TestBase {

    @FindBy(xpath = "//*[@id='container']/article/header/h1")
	WebElement BlogPageTitle;

//    /html/head/meta[5]

	public BlogPage() throws IOException {
		//super();
		PageFactory.initElements(driver, this);
	}
	// Actions
	public String validateBlogPagetitle() {
		Assert.assertEquals("The future for DevOps",BlogPageTitle.getText());
		return driver.getTitle();
	}


}
