package com.bongz.driver.web.local;

import com.bongz.driver.manager.web.local.ChromeManager;
import com.bongz.driver.manager.web.local.FirefoxManager;
import com.bongz.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(BrowserType browserType){

        return isBrowserChrome(browserType) ? ChromeManager.getDriver() : FirefoxManager.getDriver();
    }

    private static boolean isBrowserChrome(BrowserType browserType){
        return browserType == BrowserType.CHROME;
    }
}
