package com.thoughtfocus.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    public static List<String> bannedSites;
    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("dfsd.com");
        bannedSites.add("ijkds.com");
        bannedSites.add("lnmdf.com");
    }
    @Override
    public void connectTo(String serverhost) throws Exception {
        if(bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("No Access");
        }
        internet.connectTo(serverhost);
    }
}
