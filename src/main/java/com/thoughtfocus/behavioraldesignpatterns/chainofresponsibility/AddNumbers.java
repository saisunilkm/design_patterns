package com.thoughtfocus.behavioraldesignpatterns.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddNumbers implements Chain {
    private static Logger logger = LoggerFactory.getLogger(AddNumbers.class);
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public short calculate(Numbers request) {
        if(request.getCalcWanted() == "add"){
            logger.info(request.getNumber1()+ " + " + request.getNumber2()+ " = "+(request.getNumber1()) + request.getNumber2());
        }else{
            nextInChain.calculate(request);
        }

        return 0;
    }
}
