package com.tenforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){

        super(driver);
    }
    
    private By aboutusLink =
            By.xpath(".//span[text()='About Us']");
    
    private By careerLink =
            By.xpath(".//a[text()='Career']");
    
    
    
    public void goToCareerPage(){
        
    	clickVisible(aboutusLink);
    	System.out.println("Clicked on About US link");

    	clickVisible(careerLink);
        System.out.println("Clicked on Career link");
    }
}