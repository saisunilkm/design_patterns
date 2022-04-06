package com.thoughtfocus.behavioraldesignpatterns.chainofresponsibility;

public interface Chain {
    public void setNextChain(Chain nextChain);
    public short calculate(Numbers request);

}
