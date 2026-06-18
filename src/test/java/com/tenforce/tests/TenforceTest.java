package com.tenforce.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tenforce.base.*;
import com.tenforce.pages.*;
import com.tenforce.utils.*;

public class TenforceTest extends BaseTest {

    @Test

    public void verifyLifeOfTwoInternsArticle(){

        WebDriver driver =
                DriverFactory.getDriver();

        HomePage homePage =
                new HomePage(driver);

        CareerPage careerPage =
                new CareerPage(driver);

        ArticlePage articlePage =
                new ArticlePage(driver);


        // Go to career page

        homePage.goToCareerPage();

        // Life at Tenforce

        careerPage.goToLifeAtTenforce();

        // Open article

        careerPage.openInternArticle();

        // Scroll article

        articlePage.scrollArticle();

        // Back

        driver.navigate().back();

        // Job openings

        careerPage.goToJobOpenings();

        // Assertion

        Assert.assertTrue(

                careerPage
                .getCVText()
                .contains("Feel free to send your CV to"),

                "CV text not found"
        );
        System.out.println("Verified Text Feel free to send your CV");
    }
}