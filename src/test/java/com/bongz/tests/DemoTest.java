package com.bongz.tests;

import com.bongz.config.BrowserStackConfig;
import com.bongz.config.factory.BrowserStackConfigFactory;
import com.bongz.config.factory.ConfigFactory;
import com.bongz.driver.web.remote.BrowserStackFactory;
import org.junit.Test;

public class DemoTest {

    @Test
    public void testLogin(){

        System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());


    }

}
