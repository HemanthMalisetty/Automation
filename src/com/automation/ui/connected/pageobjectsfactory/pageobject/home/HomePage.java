package com.automation.ui.connected.pageobjectsfactory.pageobject.home;

import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.configuration.EnvType;
import com.automation.ui.connected.common.prpreader.AssertDataReader;
import com.automation.ui.connected.pageobjectsfactory.pageobject.base.SiteBasePageObject;
import com.automation.ui.connected.pageobjectsfactory.pageobject.login.LoginCONSTANTS;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends SiteBasePageObject {


    private static Logger logger = Logger.getLogger(HomePage.class);

    @FindBy(xpath = HomeConstants.LOGOUTBUTTON)
    @CacheLookup
    private WebElement logout;

    @FindBy(xpath = HomeConstants.MENUBUTTON)
    @CacheLookup
    private WebElement menubutton;


    /*public com.automation.ui.connected.pageobjectsfactory.pageobject.home.HomePage open() {
        return open(Configuration.getSiteName());
    }

    public com.automation.ui.connected.pageobjectsfactory.pageobject.home.HomePage open(String siteName) {
        getUrl(UrlBuilder.createUrlBuilderForSite(siteName).getUrl());
        waitForPageLoad();

        return this;
    }

    public com.automation.ui.connected.pageobjectsfactory.pageobject.home.HomePage openAndWaitForGlobalShortcuts() {
        open();
        waitFor.until((Function<WebDriver, Boolean>) arg0 -> driver
                .executeScript(
                        "return typeof window.wgGlobalShortcutsLoaded !== 'undefined' && window.wgGlobalShortcutsLoaded")
                .equals(true));

        return this;
    }*/

    public HomePage() {
        super();
    }


    public void home() throws InterruptedException {

    }

    public HomePage open() {

        logger.info("open the URL");
        if (Configuration.getEnvType().equals(EnvType.DEV)) {

            logger.info(getCurrentUrl());
             getUrl("http://localhost:9000");
             // getUrl(getCurrentUrl());
        } else {
            logger.info(getCurrentUrl());
            getUrl("http://localhost:9000");
            //  getUrl(getCurrentUrl() + " ");
           // getUrl(getCurrentUrl());
        }
       // waitForPageLoad();




        return this;
    }


    //Go to LoginPage
    public void goToLogoutPage() {

         try {
            logger.info("Logging out of the URL ");
            Reporter.log("Logging out of the URL");
            logout.click();

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail( AssertDataReader.readProperty().getValue("OPCUA_LOGOUT_LOGOUTMSG"));
            Reporter.log("Logged out of the URL successfully");

        }


    }

}