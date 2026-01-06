package com.seleniumframework.tests.pageObjectModel_Test.vwo;

import com.seleniumframework.base.CommonToAllTest;
import com.seleniumframework.driver.DriverManager;
import com.seleniumframework.pages.pageObjectModel.vwo.improved_POM.FreeTrialPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.seleniumframework.driver.DriverManager.driver;

public class TestVWOFreeTrailLink extends CommonToAllTest
{
    private static final Logger logger = LogManager.getLogger(TestVWOLogin_02_PropertyReader_DriverManager_POM_CommonToAll.class);

    @Description("Verify vwo free trial link")
    @Owner("Jeevitha")
    @Test
    public void testVWOFreeTrailLink()
    {
        logger.info("Starting the Testcases Page Object Model");
        //creating the instance of freetrail page for acessing the methods of freetrial
        FreeTrialPage freeTrialPage = new FreeTrialPage(DriverManager.getDriver());

        logger.info("Clicking on free trail link and fetching the Current Url");
        //Action performing
       String currentUrl =  freeTrialPage.VWOFreeTrialCreationLink();

        logger.info("Current url is" + currentUrl + "Performing Assertion");
        //Assertions
        Assert.assertEquals(currentUrl,"https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");


    }

}
