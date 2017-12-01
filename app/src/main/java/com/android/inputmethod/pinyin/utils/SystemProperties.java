package com.android.inputmethod.pinyin.utils;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.lang.reflect.Method;

public final class SystemProperties {
    private static final String SYSTEM_PROPERTIES = "android.os.SystemProperties";
    private static final String GET = "get";
    private static final String SET = "set";
    private static final String GET_INT = "getInt";
    private static final String GET_BOOLEAN = "getBoolean";
    private static Class<?> systemProperties;

    public SystemProperties() {
    }

    public static void set(String key, String val) {
        Method set = ReflectUtils.getMethod(systemProperties, "set", new Class[]{String.class, String.class});
        if(set != null) {
            ReflectUtils.invokeStatic(set, new Object[]{key, val});
        }

    }

    public static String get(String key, String def) {
        Method get = ReflectUtils.getMethod(systemProperties, "get", new Class[]{String.class, String.class});
        return get != null?(String) ReflectUtils.invokeStatic(get, new Object[]{key, def}):def;
    }

    public static String get(String key) {
        Method get = ReflectUtils.getMethod(systemProperties, "get", new Class[]{String.class});
        return get != null?(String) ReflectUtils.invokeStatic(get, new Object[]{key}):"";
    }

    public static int getInt(String key, int def) {
        Method getInt = ReflectUtils.getMethod(systemProperties, "getInt", new Class[]{String.class, Integer.TYPE});
        return getInt != null?((Integer) ReflectUtils.invokeStatic(getInt, new Object[]{key, Integer.valueOf(def)})).intValue():def;
    }

    public static boolean getBoolean(String key, boolean def) {
        Method getBoolean = ReflectUtils.getMethod(systemProperties, "getBoolean", new Class[]{String.class, Boolean.TYPE});
        return getBoolean != null?((Boolean) ReflectUtils.invokeStatic(getBoolean, new Object[]{key, Boolean.valueOf(def)})).booleanValue():false;
    }

    static {
        try {
            systemProperties = Class.forName("android.os.SystemProperties");
        } catch (ClassNotFoundException var1) {
            var1.printStackTrace();
        }

    }
}
