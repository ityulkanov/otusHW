package com.ityulkanov;

import com.ityulkanov.annotations.After;
import com.ityulkanov.annotations.Before;
import com.ityulkanov.annotations.Test;

public class TestClass {
    private BaseClass baseClass;
    private static final int sampleForFirstMethod = 5;
    private static final int sampleForSecondMethod = 3;


    @Test
    public void calculateFromStartToTen() {
        baseClass.calculateFactorial(sampleForFirstMethod);
    }

    @Test
    public void calcualteFactorial() {
        baseClass.calculateFactorial(sampleForSecondMethod);
    }

    @Before
    void setUp() {
        System.out.println("setting up the environment");
        BaseClass baseClass = new BaseClass();
    }

    @After
    void tearDown() {
        System.out.println("Finishing up our test class excecution");
    }
}
