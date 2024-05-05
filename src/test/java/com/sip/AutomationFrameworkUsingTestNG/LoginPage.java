package com.sip.AutomationFrameworkUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#user-name")
    private WebElement userNameInputField;

    @FindBy(css = "#password")
    private WebElement passwordInputField;

    @FindBy(css = "#login-button")
    private WebElement loginButton;

    @FindBy(css = ".title")
    private WebElement productsTitle;

    private By usernameInputBox = By.cssSelector("#user-name");
    private By passwordInputBox = By.cssSelector("#user-name");
    private By submitButton = By.cssSelector("#user-name");


    public void loginAsAdmin(String username, String password) {
//        driver.findElement(usernameInputBox).sendKeys("performance_glitch_user");
//        driver.findElement(passwordInputBox).sendKeys("secret_sauce");
//        driver.findElement(submitButton).click();
//
        userNameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);
        loginButton.click();
    }

    public String getProductsTitleText(){
        return productsTitle.getText();
    }
}
