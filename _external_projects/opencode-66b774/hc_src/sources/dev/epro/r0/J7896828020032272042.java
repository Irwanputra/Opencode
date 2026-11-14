package dev.epro.r0;

import android.content.Context;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class J7896828020032272042 {
    public static final G14026964626121631668 a = G14026964626121631668.b;
    public static final Object b = new Object();
    public static P15471466588239973061 c = null;
    public static String d = "0";

    public static void a(Context context) {
        P15471466588239973061 p15471466588239973061;
        Object obj = b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    p15471466588239973061 = c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (p15471466588239973061 != null) {
            return;
        }
        M18113111391818111737.w("Context must not be null", context);
        ClassLoader classLoader = J7896828020032272042.class.getClassLoader();
        M18113111391818111737.v(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            G14026964626121631668 g14026964626121631668 = a;
            g14026964626121631668.getClass();
            Y2177079631878275493.a(context);
            try {
                P15471466588239973061 a2 = P15471466588239973061.a(context, P15471466588239973061.b);
                try {
                    Class<?> loadClass = a2.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() == J7896828020032272042.class.getClassLoader()) {
                        throw new D6397819829364700013();
                    }
                    Method method = loadClass.getMethod("getApiLevel", null);
                    Method method2 = loadClass.getMethod("getCronetVersion", null);
                    Integer num = (Integer) method.invoke(null, null);
                    M18113111391818111737.v(num);
                    int intValue = num.intValue();
                    String str = (String) method2.invoke(null, null);
                    M18113111391818111737.v(str);
                    d = str;
                    if (apiLevel <= intValue) {
                        c = a2;
                        return;
                    }
                    if (g14026964626121631668.a(context, 2, "cr") == null) {
                        throw new D6397819829364700013();
                    }
                    String str2 = d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                    sb.append("Google Play Services update is required. The API Level of the client is ");
                    sb.append(apiLevel);
                    sb.append(". The API Level of the implementation is ");
                    sb.append(intValue);
                    sb.append(". The Cronet implementation version is ");
                    sb.append(str2);
                    throw new S1166108694551160080(sb.toString());
                } catch (Exception e) {
                    throw ((D6397819829364700013) new D6397819829364700013().initCause(e));
                }
            } catch (X12272829955313241581 e2) {
                throw ((D6397819829364700013) new D6397819829364700013().initCause(e2));
            }
        } catch (ClassNotFoundException e3) {
            throw ((D6397819829364700013) new D6397819829364700013().initCause(e3));
        }
    }
}
