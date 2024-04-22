package com.sip.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScriptExecutorTests {
    WebDriver driver;

    @Test
    public void clickUsingJSE(){
        driver = new ChromeDriver();

        JavascriptExecutor javascriptExecutor;
        javascriptExecutor = (JavascriptExecutor) driver;

        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement usernameInputBox = driver.findElement(By.cssSelector("#user-name"));
        WebElement passwordInputBox = driver.findElement(By.cssSelector("#password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        //String usernameScript = "arguments[0].value='standard_user'";
        String usernameScript = "document.getElementById('user-name').value='standard_user'";
        String passwordScript = "arguments[0].value='secret_sauce'";
        String loginButtonScript = "arguments[0].click();";


        javascriptExecutor.executeScript(usernameScript, usernameInputBox);
        javascriptExecutor.executeScript(passwordScript, passwordInputBox);
        javascriptExecutor.executeScript(loginButtonScript,loginButton);
        //loginButton.click();
    }

    @Test
    public void changeAttributes(){
        driver = new ChromeDriver();

        JavascriptExecutor javascriptExecutor;
        javascriptExecutor = (JavascriptExecutor) driver;

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement clickHereLink = driver.findElement(By.cssSelector("[href='/windows/new']"));
        String changeAttributeScript = "arguments[0].setAttribute('target','_self')";

        javascriptExecutor.executeScript(changeAttributeScript, clickHereLink);
        clickHereLink.click();
        System.out.println();
    }

    @Test
    public void getTextFromWebElement(){
        driver = new ChromeDriver();

        JavascriptExecutor javascriptExecutor;
        javascriptExecutor = (JavascriptExecutor) driver;

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement clickHereLink = driver.findElement(By.cssSelector("[href='/windows/new']"));
        String changeAttributeScript = "arguments[0].setAttribute('target','_self')";

        javascriptExecutor.executeScript(changeAttributeScript, clickHereLink);
        clickHereLink.click();

        WebElement heading = driver.findElement(By.tagName("h3"));
        String textScript = "return arguments[0].innerText";
        String querySelectorScript = "return document.querySelector('.example > h3').innerText";
        String message = javascriptExecutor.executeScript(querySelectorScript).toString();
        System.out.println(message);

        System.out.println();
    }

    @Test
    public void scrollToElement(){
        driver = new ChromeDriver();
        JavascriptExecutor javascriptExecutor;
        javascriptExecutor = (JavascriptExecutor) driver;
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement lastElement = driver.findElement(By.cssSelector("[href='/tinymce']"));
        String scrollScript = "arguments[0].scrollIntoView(true)";

        javascriptExecutor.executeScript(scrollScript, lastElement);

        String highlightElement = "arguments[0].setAttribute('style','color: #008000')";
        javascriptExecutor.executeScript(highlightElement, lastElement);
    }
}
