package com.tenforce.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ArticlePage extends BasePage {

    public ArticlePage(WebDriver driver){

        super(driver);
    }

    public void scrollArticle(){

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "window.scrollTo(0, document.body.scrollHeight)");
        System.out.println("Scroll");
    }
}