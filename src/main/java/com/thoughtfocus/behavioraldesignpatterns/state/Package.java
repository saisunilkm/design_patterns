package com.thoughtfocus.behavioraldesignpatterns.state;

public class Package {
    private PackageState state = new OrderedState();


    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public String printStatus() {
        return state.printStatus();
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }
}
