package com.ityulkanov;

import com.ityulkanov.annotations.After;
import com.ityulkanov.annotations.Before;
import com.ityulkanov.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class StarterClass {

    private static int counter = 0;
    private static int exceptionCounter = 0;

    public static void processAnnotations(final Class<TestClass> testClassClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Method[] methods = testClassClass.getDeclaredMethods();
        for (final Method method : methods) {
            final Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            for (final Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof Before) {
                }
            }
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

            for (final Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof After) {
                }
            }
        }
        System.out.printf("We've runnned total of %d tests\n", counter);
        System.out.printf("Total tests successfull %d\n", counter - exceptionCounter);
        System.out.printf("Total tests failed %d\n", exceptionCounter);
    }
}
