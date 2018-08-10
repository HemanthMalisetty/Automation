package com.automation.ui.base.common.core.element.link;


import com.automation.ui.base.pageobjectsfactory.pageobject.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.ui.base.common.core.element.*;



public class LinkHelper implements IHTMLComponent {

    private WebDriver driver;
    private BasePageObject basePageObject;

    private static Logger logger = Logger.getLogger(LinkHelper.class);

    public LinkHelper(WebDriver driver,BasePageObject basePageObject) {

        this.driver = driver;
      }

    public void clickLink(String linkText)
    {
        basePageObject.getElement(By.linkText(linkText)).click();
    }

    public void clickPartialLink(String partialLinkText) {
        basePageObject.getElement(By.partialLinkText(partialLinkText)).click();
    }

    public String getHyperLink(By locator){
         return getHyperLink(basePageObject.getElement(locator));
    }

    public String getHyperLink(WebElement element) {
        String link = element.getAttribute("href");
        logger.info("Element : " + element + " Value : " + link);
        return link;
    }
}
