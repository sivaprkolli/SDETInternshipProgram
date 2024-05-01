package com.sip.AutomationFrameworkUsingTestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends SIPBase {

    @Test
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAsAdmin("performance_glitch_user","secret_sauce");
        Assert.assertEquals(loginPage.getProductsTitleText(), "Products");
    }
}

