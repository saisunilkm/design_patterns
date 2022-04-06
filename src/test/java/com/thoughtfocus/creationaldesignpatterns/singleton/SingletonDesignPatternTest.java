package com.thoughtfocus.creationaldesignpatterns.singleton;

import com.thoughtfocus.creationaldesignpatterns.singleton.EagerInitialization;
import com.thoughtfocus.creationaldesignpatterns.singleton.LazyInitialization;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonDesignPatternTest {
    @Test
    public void lazyInitialization() {
        LazyInitialization instance = LazyInitialization.getInstance();
        assertEquals("com.thoughtfocus.creationaldesignpatterns.singleton.LazyInitialization@27f723", instance.toString());
    }
    @Test
    public void eagerInitialization () {
        EagerInitialization instance1 = EagerInitialization.getInstance();
        assertEquals("com.thoughtfocus.creationaldesignpatterns.singleton.EagerInitialization@27f723",instance1.toString());

    }
}
