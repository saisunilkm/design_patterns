package com.thoughtfocus.behavioraldesignpatterns.cor;

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
    public int calculate(Numbers request) {
        if(request.getCalcWanted() == "add"){
            int result=request.getNumber1() + request.getNumber2();
            logger.info("Addition of {} + {} = {}", request.getNumber1(), request.getNumber2(), result);
            return result;
        }
        nextInChain.calculate(request);
        return 0;
    }
}
