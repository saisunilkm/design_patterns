package com.thoughtfocus.designpatterns.behavioral.state;

public interface PackageState {
    public void next(Package pkg);
    public void prev(Package pkg);
    public String printStatus();
}
