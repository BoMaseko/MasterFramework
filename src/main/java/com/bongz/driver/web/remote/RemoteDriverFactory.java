package com.bongz.driver.web.remote;

import com.bongz.enums.BrowserRemoteModeType;
import com.bongz.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){

        if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM){
            return SeleniumGridFactory.getDriver(browserType);
        }else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID){
            return SelenoidFactory.getDriver(browserType);
        }else if(browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK){
            return BrowserStackFactory.getDriver(browserType);
        }
        return null;
    }
}
