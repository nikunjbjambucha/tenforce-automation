package com.tenforce.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class BasePage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    public BasePage(WebDriver driver){

        this.driver = driver;

        wait = new WebDriverWait(driver,
                Duration.ofSeconds(10));
    }

    public void click(By locator){

        wait.until(
                ExpectedConditions
                .elementToBeClickable(locator))
                .click();
    }

    public void scrollIntoView(By locator){

        WebElement element =
                wait.until(
                ExpectedConditions
                .visibilityOfElementLocated(locator));

        ((JavascriptExecutor)driver)
                .executeScript(
                        "arguments[0].scrollIntoView(true)",
                        element);
    }

    public String getText(By locator){

        return wait.until(
                ExpectedConditions
                .visibilityOfElementLocated(locator))
                .getText();
    }
    
    public void clickVisible(By locator) {
        List<WebElement> elements = driver.findElements(locator);

        for (WebElement element : elements) {
            if (element.isDisplayed()) {
                element.click();
                break;
            }
        }
    }
    
    public void hover(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).perform();
    }
}