package com.qa.pages;

import com.qa.base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class AboutPage extends TestBase {

    @FindBy(xpath = "/html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[1]/a/span")
    WebElement abouthyperLink;

    @FindBy(xpath = "//*[@id='container']/div[1]/h1")
    WebElement aboutPageHeader;


    public AboutPage() throws IOException {
        // super();
        PageFactory.initElements(driver, this);
    }

    // Actions
    public String validateWorkPagetitle() {
        return driver.getTitle();
    }

    public boolean validateWorkHdader() throws InterruptedException {
        Thread.sleep(2000);
        return aboutPageHeader.isDisplayed();
    }
    public void validateTitalH1()throws InterruptedException{
        Assert.assertEquals("About",aboutPageHeader);
    }

    public void clickOnAboutHyperLink(){
        abouthyperLink.click();
    }

}
