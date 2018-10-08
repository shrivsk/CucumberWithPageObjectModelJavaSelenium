package com.qa.pages;

import com.qa.base.TestBase;
import com.sun.media.jfxmedia.logging.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ByChained;

import javax.swing.text.AsyncBoxView;
import java.io.IOException;
import java.rmi.ServerError;
import java.util.List;
import java.util.Properties;
import java.util.logging.LogManager;

public class ContactPage extends TestBase {

    @FindBy(xpath = "//*[@id='container']/header/h1")
    WebElement contactPageHeader;


    @FindBy(className = "office__map")
    List<WebElement> valtechOfficeCount;

    @FindBy(className = "office-country__heading")
    List<WebElement> valtechOfficeCountryCountry;

    public ContactPage() throws IOException {
        // super();
        PageFactory.initElements(driver, this);
    }

    public void openContactPage(){
        driver.navigate().to(prop.getProperty("contactUs"));
//        driver.get(prop.getProperty("contactUs"));
    }

    // Actions
    public String validateWorkPagetitle() {
        return driver.getTitle();
    }

    public boolean validateWorkHdader() throws InterruptedException {
        Thread.sleep(2000);
        return contactPageHeader.isDisplayed();
    }

    public void countValtechOffice(){
        System.out.println("Total Office Location Count is >> "+ valtechOfficeCount.size());
        Assert.assertEquals(37,valtechOfficeCount.size());
        System.out.println("Total Office Country Count is >> "+ valtechOfficeCountryCountry.size());
        Assert.assertEquals(16,valtechOfficeCountryCountry.size());
    }

}
