package com.bongz.driver;

import com.bongz.config.ConfigFactory;
import com.bongz.driver.manager.ChromeManager;
import com.bongz.driver.manager.FirefoxManager;
import com.bongz.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver = null;
        if (ConfigFactory.getConfig().browser() == BrowserType.CHROME){
            driver = ChromeManager.getDriver();
        }else{
            driver = FirefoxManager.getDriver();
        }

        return driver;
    }
}
