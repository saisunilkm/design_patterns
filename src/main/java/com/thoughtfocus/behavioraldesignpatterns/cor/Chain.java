package com.thoughtfocus.behavioraldesignpatterns.cor;

public interface Chain {
    public void setNextChain(Chain nextChain);
    public int calculate(Numbers request);

}
