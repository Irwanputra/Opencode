package dev.epro.r0;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class A1090523267393268132 {
    public static final A1090523267393268132 a;

    static {
        A1090523267393268132 p12561857092474322565;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    p12561857092474322565 = new E18040702136674415662(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    p12561857092474322565 = new P12561857092474322565();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                p12561857092474322565 = new T10865398146470277742(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            p12561857092474322565 = new B6436937335542174498(iIntValue, declaredMethod3);
        }
        a = p12561857092474322565;
    }

    public Object a(Class cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
