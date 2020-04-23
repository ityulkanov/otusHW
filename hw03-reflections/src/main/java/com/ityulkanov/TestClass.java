package com.ityulkanov;

import com.ityulkanov.annotations.After;
import com.ityulkanov.annotations.Before;
import com.ityulkanov.annotations.Test;

public class TestClass {

    TestClass() {

    }

    @Before
    @Test
    @After
    public void firstMethod() {
        System.out.println("first method has been called \n");
    }

    @Before
    @Test
    @After
    public void secondMethod() {
        System.out.println("second method has been called \n");
    }

    @Before
    @Test
    @After
    public void thirdMethod() {
        System.out.println("third method has been called \n");
    }
}
