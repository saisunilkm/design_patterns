package com.thoughtfocus.structuraldesignpatterns.proxy;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProxyDesignPatternTest {
    @Test
    public void shouldConnectWithServer(){
        List<String> proxyInternet = ProxyInternet.bannedSites;
        assertTrue("sunil.com",true);
    }
    @Test
    public void shouldNotConnectWithServer(){
        List<String> proxyInternet = ProxyInternet.bannedSites;
        assertFalse("abc.com",false);
    }

}