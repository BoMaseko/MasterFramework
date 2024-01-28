package com.bongz.driver.web.remote;

import com.bongz.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.bongz.driver.manager.web.remote.selenium.SeleniumGridFireFoxManager;
import com.bongz.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){}

        public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? SeleniumGridChromeManager.getDriver() : SeleniumGridFireFoxManager.getDriver();
    }
}
