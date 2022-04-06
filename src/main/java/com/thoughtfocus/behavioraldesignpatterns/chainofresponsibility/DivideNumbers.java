package com.thoughtfocus.behavioraldesignpatterns.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DivideNumbers implements Chain {
    private static Logger logger = LoggerFactory.getLogger(DivideNumbers.class);
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }
    @Override
    public short calculate(Numbers request) {
        if(request.getCalcWanted() == "div"){
            logger.info(request.getNumber1()+ " / " + request.getNumber2()+ " = "+(request.getNumber1()) / request.getNumber2());
        }else{
            logger.info("Only works for add, mult and div");
        }

        return 0;
    }
}
