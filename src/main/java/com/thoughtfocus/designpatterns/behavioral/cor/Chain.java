package com.thoughtfocus.designpatterns.behavioral.cor;

public interface Chain {
    public void setNextChain(Chain nextChain);
    public int calculate(Numbers request);

}
