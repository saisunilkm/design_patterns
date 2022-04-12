package com.thoughtfocus.designpatterns.behavioral.strategy;

public class Operations {
    private ArithmeticOperations arithmeticOperations;


    public Operations(ArithmeticOperations arithmeticOperations) {
        this.arithmeticOperations = arithmeticOperations;
    }

    public int executeOperation(int num1,int num2){
        return arithmeticOperations.doOperation(num1,num2);
    }
}
