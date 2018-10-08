package com.qa.pages;

import com.qa.base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ServicesPage extends TestBase {

	@FindBy(xpath = "/html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[3]/a/span")
	WebElement servicesHyperLink;

	@FindBy(xpath = "/html/body/div[1]/main/section/header/h1")
	WebElement servicePageHeader;


	public ServicesPage() throws IOException {
		// super();
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateWorkPagetitle() {
		return driver.getTitle();
	}

	public boolean validateWorkHdader() throws InterruptedException {
		Thread.sleep(2000);
		return servicePageHeader.isDisplayed();
	}

	public void validateTitalH1()throws InterruptedException{
		Assert.assertEquals("Services",servicePageHeader.getText());
	}

	public void clickOnServicesHyperLink(){
		servicesHyperLink.click();
	}
}
