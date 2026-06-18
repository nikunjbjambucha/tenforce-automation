package com.tenforce.base;

import org.testng.annotations.*;
import com.tenforce.base.*;
import com.tenforce.pages.*;
import com.tenforce.utils.*;

public class BaseTest {

    @BeforeMethod

    public void setup(){

        DriverFactory.initDriver();

        DriverFactory.getDriver()
                .get("https://www.tenforce.com/");
    }

    @AfterMethod

    public void tearDown(){

        DriverFactory.quitDriver();
    }
}