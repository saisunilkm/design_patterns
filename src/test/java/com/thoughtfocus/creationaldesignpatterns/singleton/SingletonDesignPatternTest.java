package com.thoughtfocus.creationaldesignpatterns.singleton;

import com.thoughtfocus.creationaldesignpatterns.singleton.EagerInitialization;
import com.thoughtfocus.creationaldesignpatterns.singleton.LazyInitialization;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SingletonDesignPatternTest {
    @Test
    void lazyInitialization() {
        LazyInitialization instance = LazyInitialization.getInstance();

        EagerInitialization instance1 = EagerInitialization.getInstance();
    }

}
