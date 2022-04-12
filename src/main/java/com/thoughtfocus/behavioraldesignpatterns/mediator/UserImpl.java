package com.thoughtfocus.behavioraldesignpatterns.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserImpl extends User{
    Logger logger = LoggerFactory.getLogger(UserImpl.class);
    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public String send(String msg){
        logger.info(this.name+": Sending Message="+msg);
        mediator.sendMessage(msg, this);
        return "Sending Message";
    }
    @Override
    public String receive(String msg) {
        logger.info(this.name+": Received Message:"+msg);
        return "Received Message";
    }
}
