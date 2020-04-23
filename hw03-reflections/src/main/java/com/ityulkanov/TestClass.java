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
    }

    @Before
    @Test
    @After
    public void secondMethod() {
    }

    @Before
    @Test
    @After
    public void thirdMethod() {
    }
}
