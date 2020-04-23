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

    public static void processAnnotations(final Class<TestClass> testClassClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Method[] methods = testClassClass.getDeclaredMethods();
        for (final Method method : methods) {
            final Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            for (final Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof Before) {
                    System.out.println("We are starting Before method");
                }
            }
            for (final Annotation declaredAnnotation : declaredAnnotations) {

                if (declaredAnnotation instanceof Test) {
                    System.out.println("Wea re starting Test method");
                    method.invoke(testClassClass.newInstance(), new Object[0]);
                }
            }

            for (final Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof After) {
                    System.out.println("Wea re stating after method");
                }
            }
        }
    }
}
