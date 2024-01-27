package com.bongz.config.converters;

import com.bongz.enums.BrowserRemoteModeType;
import com.bongz.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserRemoteModeTypeConverter implements Converter<BrowserRemoteModeType> {
    @Override
    public BrowserRemoteModeType convert(Method method, String remoteMode){
       return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}
