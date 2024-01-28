package com.bongz.config.converters;

import com.bongz.enums.MobilePlatformType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToMobilePlatformTypeConverter implements Converter<MobilePlatformType> {

    @Override
    public MobilePlatformType convert(Method method, String mobilePlatformType){
        Map<String, MobilePlatformType> stringMobilePlatformTypeMap = Map.of("ANDROID", MobilePlatformType.ANDROID, "IOS", MobilePlatformType.IOS);

        return stringMobilePlatformTypeMap.getOrDefault(mobilePlatformType.toUpperCase(), MobilePlatformType.ANDROID);
    }

}
