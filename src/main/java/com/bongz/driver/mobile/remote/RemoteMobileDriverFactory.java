package com.bongz.driver.mobile.remote;

import com.bongz.driver.manager.mobile.local.AndroidManager;
import com.bongz.driver.manager.mobile.local.IOSManager;
import com.bongz.enums.BrowserRemoteModeType;
import com.bongz.enums.MobilePlatformType;
import com.bongz.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory(){}

    private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP = new EnumMap<>(MobileRemoteModeType.class);
    private static final Function<MobilePlatformType, WebDriver> SAUCE_LABS = SauceLabsMobileFactory::getDriver;
    private static final Function<MobilePlatformType, WebDriver> BROWSER_STACK = BrowserStackMobileFactory::getDriver;

    static {
        MAP.put(MobileRemoteModeType.SAUCE_LABS, SAUCE_LABS);
        MAP.put(MobileRemoteModeType.BROWSER_STACK, BROWSER_STACK);
    }

    public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatformType mobilePlatformType){
        return MAP.get(mobileRemoteModeType).apply(mobilePlatformType);
    }


}
