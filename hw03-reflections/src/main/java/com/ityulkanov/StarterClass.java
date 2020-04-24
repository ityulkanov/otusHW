package com.ityulkanov;

import com.ityulkanov.annotations.After;
import com.ityulkanov.annotations.Before;
import com.ityulkanov.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StarterClass {

    private static int counter = 0;
    private static int exceptionCounter = 0;

    public static void processAnnotations(final Class<TestClass> testClassClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        final Method[] methods = testClassClass.getDeclaredMethods();
        final TestClass testClass = testClassClass.newInstance();
        for (final Method method : methods) {
            if (method.isAnnotationPresent(Before.class)) {
                method.invoke(testClass, new Object[0]);
            }
        }
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                method.invoke(testClass, new Object[0]);
            }
        }

        for (Method method : methods) {
            if (method.isAnnotationPresent(After.class)) {
                method.invoke(testClass, new Object[0]);
            }
        }
        System.out.println("################################################");
        System.out.printf("We've runnned total of %d tests\n", counter);
        System.out.println("################################################");

        System.out.printf("Total tests were successful: %d\n", counter - exceptionCounter);
        System.out.println("################################################");

        System.out.printf("Total tests failed:  %d\n", exceptionCounter);
        System.out.println("------------------------------------------------");

    }
}
