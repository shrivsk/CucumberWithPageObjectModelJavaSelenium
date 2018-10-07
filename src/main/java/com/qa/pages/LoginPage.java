package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitbutton;

	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signupbutton;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;

	public LoginPage() throws IOException {
		// super();
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPagetitle() {
		return driver.getTitle();
	}

	public boolean validateCRMImage() throws InterruptedException {
		Thread.sleep(2000);
		return crmlogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) throws InterruptedException, IOException {
		username.sendKeys(un);
		password.sendKeys(pwd);

		Thread.sleep(2000);
		submitbutton.click();

		return new HomePage();
	}

}
