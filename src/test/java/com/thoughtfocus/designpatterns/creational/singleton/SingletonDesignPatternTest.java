package com.thoughtfocus.designpatterns.creational.singleton;

import com.thoughtfocus.designpatterns.creational.singleton.EagerInitialization;
import com.thoughtfocus.designpatterns.creational.singleton.LazyInitialization;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SingletonDesignPatternTest {
    @Test
    void lazyInitialization() {
        LazyInitialization instance = LazyInitialization.getInstance();

        EagerInitialization instance1 = EagerInitialization.getInstance();
    }

}
