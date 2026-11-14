package dev.epro.r0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N7436857706543593520 extends S12227320117525376577 {
    public final Method a = Class.class.getMethod("isRecord", null);
    public final Method b = Class.class.getMethod("getRecordComponents", null);
    public final Method c;
    public final Method d;

    public N7436857706543593520() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.c = cls.getMethod("getName", null);
        this.d = cls.getMethod("getType", null);
    }

    @Override // dev.epro.r0.S12227320117525376577
    public final Method k(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            Z3383101362411723454.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // dev.epro.r0.S12227320117525376577
    public final Constructor l(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.d.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            Z3383101362411723454.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // dev.epro.r0.S12227320117525376577
    public final String[] o(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.c.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            Z3383101362411723454.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // dev.epro.r0.S12227320117525376577
    public final boolean r(Class cls) {
        try {
            return ((Boolean) this.a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            Z3383101362411723454.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}
