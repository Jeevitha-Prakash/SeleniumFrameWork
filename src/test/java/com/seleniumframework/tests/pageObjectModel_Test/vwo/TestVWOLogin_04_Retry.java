package com.seleniumframework.tests.pageObjectModel_Test.vwo;

import com.seleniumframework.base.CommonToAllTest;
import com.seleniumframework.listeners.RetryAnalyzer;
import com.seleniumframework.listeners.ScreenshotListener;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.seleniumframework.driver.DriverManager.getDriver;

@Listeners(value = ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)

public class TestVWOLogin_04_Retry extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_04_Retry.class);

        @Owner("Jeevitha")
        @Description("Verify that invalid creds give error message")

        public void testFail() {
            getDriver().get("https://app.vwo.com");
            logger.info("Starting the Testcases Page Object Model");
            Allure.addAttachment("Log output", "text/plain", "This is some log text");
            Assert.assertTrue(false);
        }

        @Owner("Jeevitha")
        @Description("Verify that invalid creds give error message")
        @Test
        public void testPass() {
            getDriver().get("https://app.vwo.com");
            logger.info("Starting the Testcases Page Object Model");
            Assert.assertTrue(true);
        }
    }
