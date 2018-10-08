package com.qa.pages;

import com.qa.base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class WorkPage extends TestBase {

	@FindBy(xpath = "/html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[2]/a")
	WebElement workHyperLink;


	@FindBy(xpath = "/html/body/div[1]/main/header/h1")
	WebElement workPageHeader;


	public WorkPage() throws IOException {
		// super();
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateWorkPagetitle() {
		return driver.getTitle();
	}

	public boolean validateWorkHdader() throws InterruptedException {
		Thread.sleep(2000);
		return workPageHeader.isDisplayed();
	}
	public void validateTitalH1()throws InterruptedException{
		Assert.assertEquals("Work",workPageHeader.getText());
	}

	public void clickOnWorkHyperLink(){
		workHyperLink.click();
	}

}
