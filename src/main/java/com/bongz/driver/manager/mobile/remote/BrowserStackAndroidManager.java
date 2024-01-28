package com.bongz.driver.manager.mobile.remote;

import com.bongz.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackAndroidManager {

    private BrowserStackAndroidManager(){}

    public static WebDriver getDriver() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
        desiredCapabilities.setCapability("device", "Google Pixel 3");
        desiredCapabilities.setCapability("os_version", "9.0");
        desiredCapabilities.setCapability("project", "First Java Project");
        desiredCapabilities.setCapability("build", "browserstack-build-1");
        desiredCapabilities.setCapability("name", "first_test");

        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), desiredCapabilities);

    }
}
