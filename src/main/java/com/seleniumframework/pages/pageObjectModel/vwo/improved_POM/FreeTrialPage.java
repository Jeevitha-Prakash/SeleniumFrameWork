package com.seleniumframework.pages.pageObjectModel.vwo.improved_POM;

import com.seleniumframework.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreeTrialPage extends CommonToAllPages
{
    //Defining Webdriver
    WebDriver driver;

    //creating the constructor for receiving webdriver
    public FreeTrialPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //  Step 1- Page Locators
   private By free_trial_link =  By.linkText("Start a free trial");

    //Step2 - Page Actions
    public String VWOFreeTrialCreationLink()
    {
        openVWOUrl();
        clickElement(free_trial_link);
        return getCUrrentUrl();
    }




}
