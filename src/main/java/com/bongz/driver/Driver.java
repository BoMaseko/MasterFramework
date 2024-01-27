package com.bongz.driver;

import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver(){}

    public static void initDriver(){
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://google.com");
    }

    public void quitDriver(){
        WebDriver driver = LocalDriverFactory.getDriver();
    }
}
