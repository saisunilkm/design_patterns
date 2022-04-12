package com.thoughtfocus.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;


class SingletonDesignPatternTest {
    @Test
    void lazyInitialization() {
        LazyInitialization instance = LazyInitialization.getInstance();

        EagerInitialization instance1 = EagerInitialization.getInstance();
    }
}
