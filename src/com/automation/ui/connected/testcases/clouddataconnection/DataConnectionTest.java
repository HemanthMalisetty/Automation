
package com.automation.ui.connected.testcases.clouddataconnection;

/**
 * @author Manjusha Saju
 */

import com.automation.ui.connected.pageobjectsfactory.pageobject.login.LoginPage;
import com.automation.ui.connected.testcases.base.ConnectedBaseTest;
import com.automation.ui.connected.pageobjectsfactory.pageobject.clouddataconnection.*;
import com.automation.ui.connected.testcases.login.LoginTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.automation.ui.base.common.constants.*;
public class DataConnectionTest extends ConnectedBaseTest {

    private static Logger logger = Logger.getLogger(DataConnectionTest.class);


    public DataConnectionTest() {
         super();

    }

    /*
     * Test Case 1
     * 1.Log into  Automation

     * */

        @Test(enabled = true, priority = 3, groups = {"validcase"}, description = "home page ")

        public void addConnection() throws Throwable {

            logger.info("Entering addConnection");
            Reporter.log("Entering addConnection");


            data_page = new AddCloudDataConnection();
            data_page.addConnection();
            data_page.waitForPageLoad();

            logger.info("Exiting addConnection and going to  add"+data_page.getUrl());
    }


}
