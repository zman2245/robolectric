package com.xtremelabs.robolectric.bytecode;

import javassist.CtClass;

public interface ClassHandler {
    void instrument(CtClass ctClass);

    void beforeTest();

    void afterTest();

    void classInitializing(Class clazz);

    Object methodInvoked(Class clazz, String methodName, Object instance, String[] paramTypes, Object[] params) throws Throwable;
}