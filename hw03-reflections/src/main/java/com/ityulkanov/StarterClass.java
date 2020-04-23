package com.ityulkanov;

import com.ityulkanov.annotations.After;
import com.ityulkanov.annotations.Before;
import com.ityulkanov.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class StarterClass {

    public static void processAnnotations(Class<TestClass> testClassClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Method[] methods = testClassClass.getMethods();
        for (Method method : methods) {
            boolean testMethods = testClassClass.getMethod(method.getName()).isAnnotationPresent(Test.class);

        }
        for (Method method : methods) {
            final Constructor<?> constructor = testClassClass.getConstructor();
            final Object o = constructor.newInstance();
            System.out.println("Processing method" + method.getName());

            final Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof Before) {
                    System.out.println("We are starting Before method");
                }
            }
            for (Annotation declaredAnnotation : declaredAnnotations) {

                if (declaredAnnotation instanceof Test) {
                    System.out.println("Wea re starting Test method");
                }
            }

            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof After) {
                    System.out.println("Wea re stating after method");
                }
            }
        }
    }
}
