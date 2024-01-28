package com.bongz.config.converters;

import com.bongz.enums.BrowserRemoteModeType;
import com.bongz.enums.MobileRemoteModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobileRemodeModeType implements Converter<MobileRemoteModeType> {

    @Override
    public MobileRemoteModeType convert(Method method, String remoteMode){
        return MobileRemoteModeType.valueOf(remoteMode.toUpperCase());
    }

}
