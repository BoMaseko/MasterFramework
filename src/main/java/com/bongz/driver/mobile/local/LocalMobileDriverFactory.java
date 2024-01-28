package com.bongz.driver.mobile.local;

import com.bongz.driver.manager.mobile.local.AndroidManager;
import com.bongz.driver.manager.mobile.local.IOSManager;
import com.bongz.driver.manager.web.local.ChromeManager;
import com.bongz.driver.manager.web.local.FirefoxManager;
import com.bongz.enums.BrowserType;
import com.bongz.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {

    private LocalMobileDriverFactory(){}

    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatformType.class);
    private static final Supplier<WebDriver> ANDROID = AndroidManager::getDriver;
    private static final Supplier<WebDriver> IOS = IOSManager::getDriver;

    static {
        MAP.put(MobilePlatformType.ANDROID, ANDROID);
        MAP.put(MobilePlatformType.IOS, IOS);
    }

        public static WebDriver getDriver(MobilePlatformType mobilePlatformType){
            return MAP.get(mobilePlatformType).get();
        }

}
