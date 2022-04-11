package com.thoughtfocus.structuraldesignpatterns.proxy;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProxyDesignPatternTest {
    @Test
    public void shouldConnectWithServer(){
        List<String> proxyInternet = ProxyInternet.bannedSites;
        assertFalse(proxyInternet.contains("sunil.com"));
    }
    @Test
    public void shouldNotConnectWithServer(){
        List<String> proxyInternet = ProxyInternet.bannedSites;
        assertTrue(proxyInternet.contains("abc.com"));
    }

}