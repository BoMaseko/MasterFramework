package com.bongz.driver.web.local;

import com.bongz.driver.manager.web.local.ChromeManager;
import com.bongz.driver.manager.web.local.FirefoxManager;
import com.bongz.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}


    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);
    private static final Supplier<WebDriver> CHROME = ChromeManager::getDriver;
    private static final Supplier<WebDriver> FIREFOX = FirefoxManager::getDriver;

    static {
        MAP.put(BrowserType.CHROME, CHROME);
        MAP.put(BrowserType.FIREFOX, FIREFOX);
    }

    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }

}
