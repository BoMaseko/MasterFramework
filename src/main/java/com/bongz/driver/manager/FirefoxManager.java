package com.bongz.driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public final class FirefoxManager {

    private FirefoxManager(){}

    public static WebDriver getDriver(){
        WebDriverManager.firefoxdriver().setup();

        return new org.openqa.selenium.firefox.FirefoxDriver();
    }
}
