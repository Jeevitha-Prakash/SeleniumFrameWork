package com.seleniumframework.tests.pageObjectModel_Test.vwo;

import com.seleniumframework.base.CommonToAllTest;
import com.seleniumframework.driver.DriverManager;
import com.seleniumframework.pages.pageObjectModel.vwo.improved_POM.DashBoardPage;
import com.seleniumframework.pages.pageObjectModel.vwo.improved_POM.LoginPage;
import com.seleniumframework.utils.PropertiesReader;
import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.seleniumframework.driver.DriverManager.driver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVWO_Login_03_using_improvedPOM extends CommonToAllTest
{

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_02_PropertyReader_DriverManager_POM_CommonToAll.class);


    @Description("TC#1- Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception
    {

        logger.info("Starting the Testcases Page Object Model");

        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));

        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));

    }

    @Description("TC#2-Verify that valid creds dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO() {

        logger.info("Starting the Testcases Page Object Model");

        LoginPage loginPage_VWO = new LoginPage(DriverManager.getDriver());
        loginPage_VWO.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));

        logger.info("Login Done, Now moving to the dashboard!");

        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        String usernameLoggedIn = dashBoardPage.loggedInUserName();

        logger.info("Username I got -> "+usernameLoggedIn);

        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn, PropertiesReader.readKey("expected_username"));
    }
}
