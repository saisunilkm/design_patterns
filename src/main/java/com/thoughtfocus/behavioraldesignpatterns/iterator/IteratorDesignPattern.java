package com.thoughtfocus.behavioraldesignpatterns.iterator;

public class IteratorDesignPattern {
    public static void main(String[] args) {
        NameAndAgeRepository nameAndAgeRepository = new NameAndAgeRepository();

        for(Iterator iterator = nameAndAgeRepository.getIterator();iterator.hasNext();){
            String nameAndAge = (String) iterator.next();
            System.out.println("Name And Age: "+ nameAndAge);
        }
    }
}
