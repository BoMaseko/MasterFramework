package com.bongz.driver;

import com.bongz.config.factory.ConfigFactory;
import com.bongz.driver.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver(){}

    public static void initDriver(){
        WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        driver.get("https://google.com");
    }

    public void quitDriver(){
        /**
         *
         * Code to be implemented
         *
         */

    }
}
