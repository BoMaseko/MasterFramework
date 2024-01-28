package com.bongz.tests;

import com.bongz.config.factory.ConfigFactory;
import org.junit.Test;

public class DemoTest {

    @Test
    public void testLogin(){

        System.out.println(ConfigFactory.getConfig().browser());


    }

}
