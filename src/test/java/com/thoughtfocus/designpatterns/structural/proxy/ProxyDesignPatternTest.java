package com.thoughtfocus.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProxyDesignPatternTest {
    @Test
    void proxyTest() {
        List<String> proxyInternet = ProxyInternet.bannedSites;
        assertFalse(proxyInternet.contains("sunil.com"));
        assertTrue(proxyInternet.contains("abc.com"));
    }
}