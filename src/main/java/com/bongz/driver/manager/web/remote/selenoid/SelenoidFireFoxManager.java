package com.bongz.driver.manager.web.remote.selenoid;

import com.bongz.config.factory.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidFireFoxManager {

    private SelenoidFireFoxManager(){}

    public static RemoteWebDriver getDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("browserName", "firefox");
        capabilities.setCapability("browserVersion", "106.3");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), capabilities);
    }
}
