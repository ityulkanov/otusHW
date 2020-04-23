package com.ityulkanov;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        StarterClass.processAnnotations(TestClass.class);

    }
}
