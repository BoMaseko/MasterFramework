package com.bongz.driver.web.remote;

import com.bongz.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.bongz.driver.manager.web.remote.selenoid.SelenoidFireFoxManager;
import com.bongz.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {

    private SelenoidFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? SelenoidChromeManager.getDriver() : SelenoidFireFoxManager.getDriver();
    }
}
