package com.thoughtfocus.designpatterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IteratorDesignPatternTest {
    @Test
    void nameAndAge() {
        NameAndAgeRepository nameAndAgeRepository = new NameAndAgeRepository();
        StringBuilder allNamesAndAge = new StringBuilder();
        for (Iterator iterator = nameAndAgeRepository.getIterator(); iterator.hasNext(); ) {
            String nameAndAge = (String) iterator.next();
            allNamesAndAge.append(nameAndAge).append(", ");
        }
        allNamesAndAge.replace(allNamesAndAge.length() - 2, allNamesAndAge.length(), "");
        assertEquals("Sunil 21, Sreekanth 25, Niyati 21, Vignesh 29", allNamesAndAge.toString());
    }

}