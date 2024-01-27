package com.bongz.driver;

import com.bongz.config.ConfigFactory;
import com.bongz.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    public static WebDriver getDriver(){
        BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode()
        if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM){

        }else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID){

        }else{

        }
        return null;
    }
}
