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
    public void secondMethod() throws Exception {
        throw new Exception();
    }

    @Before
    @Test
    @After
    public void thirdMethod() {
    }
}
