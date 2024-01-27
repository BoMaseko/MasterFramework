package com.bongz.config.converters;

import com.bongz.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeBrowserType> {
    @Override
    public RunModeBrowserType convert(Method method, String runMode){
       return RunModeBrowserType.valueOf(runMode.toUpperCase());
    }
}
