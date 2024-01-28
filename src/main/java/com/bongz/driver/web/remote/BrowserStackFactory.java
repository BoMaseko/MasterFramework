package com.bongz.driver.web.remote;

import com.bongz.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.bongz.driver.manager.web.remote.browserstack.BrowserStackFireFoxManager;
import com.bongz.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {

    private BrowserStackFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? BrowserStackChromeManager.getDriver() : BrowserStackFireFoxManager.getDriver();
    }


}
