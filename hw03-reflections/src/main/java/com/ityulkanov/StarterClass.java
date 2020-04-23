package com.ityulkanov;

import com.ityulkanov.annotations.After;
import com.ityulkanov.annotations.Before;
import com.ityulkanov.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StarterClass {

    private static int counter = 0;
    private static int exceptionCounter = 0;

    public static void processAnnotations(final Class<TestClass> testClassClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Method[] methods = testClassClass.getDeclaredMethods();
        for (final Method method : methods) {
            final Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            for (final Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof Test) {
                    counter++;
                    try {
                        method.invoke(testClassClass.newInstance(), new Object[0]);
                    } catch (Exception e) {
                        exceptionCounter++;

                    }

                }
            }
        }
        System.out.println("################################################");
        System.out.printf("We've runnned total of %d tests\n", counter);
        System.out.println("################################################");

        System.out.printf("Total tests successful: %d\n", counter - exceptionCounter);
        System.out.println("################################################");

        System.out.printf("Total tests failed:  %d\n", exceptionCounter);
        System.out.println("------------------------------------------------");

    }
}
