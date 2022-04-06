package com.thoughtfocus.structuraldesignpatterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyDesignPattern {
    private static Logger logger = LoggerFactory.getLogger(ProxyDesignPattern.class);
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("sunil.org");
            internet.connectTo("abc.com");
        }catch (Exception e){
            logger.info(e.getMessage());
        }
    }
}
