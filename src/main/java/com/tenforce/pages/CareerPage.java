package com.tenforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareerPage extends BasePage {

    public CareerPage(WebDriver driver){

        super(driver);
    }

    private By lifeAtTenforce =
            By.xpath(".//a[@href='#people']");

    private By internsArticle =
            By.xpath(".//article[.//span[text()='Life of two interns']]/a/header/div/span");

    private By jobOpening =
            By.xpath(".//a[@href='#job']");

    private By cvText =
            By.xpath(".//span[text()='Feel free to send your CV to']");



    public void goToLifeAtTenforce(){

    	click(lifeAtTenforce);
    	System.out.println("Clicked on Life at Tenforce");
    }

    public void openInternArticle(){
    	
    	scrollIntoView(internsArticle);
        click(internsArticle);
        System.out.println("Clicked on Article");
    }

    public void goToJobOpenings(){

        scrollIntoView(jobOpening);
        System.out.println("Scroll to Job Opening");
        click(jobOpening);
        System.out.println("Clicked on Job Opening");
    }

    public String getCVText(){

        return getText(cvText);
    }
}