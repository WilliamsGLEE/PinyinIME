package com.android.inputmethod.pinyin.utils;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ReflectUtils {
    private ReflectUtils() {
        throw new RuntimeException();
    }

    public static Method getMethod(Class<?> clazz, String name, Class... params) {
        Method method = null;

        try {
            method = clazz.getMethod(name, params);
            method.setAccessible(true);
        } catch (NoSuchMethodException var5) {
            var5.printStackTrace();
        }

        return method;
    }

    public static <T> T invoke(Method method, Object receiver, Object... args) {
        if(method == null) {
            return null;
        } else {
            try {
                return (T)method.invoke(receiver, args);
            } catch (IllegalAccessException var4) {
                var4.printStackTrace();
            } catch (InvocationTargetException var5) {
                var5.printStackTrace();
            }

            return null;
        }
    }

    public static <T> T invokeStatic(Method method, Object... args) {
        return invoke(method, (Object)null, args);
    }
}
