package com.thoughtfocus.creationaldesignpatterns.singleton;

import com.thoughtfocus.creationaldesignpatterns.singleton.EagerInitialization;
import com.thoughtfocus.creationaldesignpatterns.singleton.LazyInitialization;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SingletonDesignPatternTest {
    @Test
    public void lazyInitialization() {
        LazyInitialization instance = LazyInitialization.getInstance();

    }
    @Test
    public void eagerInitialization () {
        EagerInitialization instance1 = EagerInitialization.getInstance();

    }
}
