package com.bongz.config;

import com.bongz.config.converters.StringToBrowserTypeConverter;
import com.bongz.config.converters.StringToURLConverter;
import com.bongz.enums.BrowserRemoteModeType;
import com.bongz.enums.BrowserType;
import com.bongz.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

}
