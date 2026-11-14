package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class A1090523267393268132 {
    public static final dev.epro.r0.A1090523267393268132 a;

    static {
        dev.epro.r0.A1090523267393268132 p12561857092474322565;
        try {
            try {
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("sun.misc.Unsafe");
                    java.lang.reflect.Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    p12561857092474322565 = new dev.epro.r0.E18040702136674415662(cls.getMethod("allocateInstance", java.lang.Class.class), declaredField.get(null));
                } catch (java.lang.Exception unused) {
                    p12561857092474322565 = new dev.epro.r0.P12561857092474322565();
                }
            } catch (java.lang.Exception unused2) {
                java.lang.reflect.Method declaredMethod = java.io.ObjectInputStream.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Class.class);
                declaredMethod.setAccessible(true);
                p12561857092474322565 = new dev.epro.r0.T10865398146470277742(declaredMethod);
            }
        } catch (java.lang.Exception unused3) {
            java.lang.reflect.Method declaredMethod2 = java.io.ObjectStreamClass.class.getDeclaredMethod("getConstructorId", java.lang.Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((java.lang.Integer) declaredMethod2.invoke(null, java.lang.Object.class)).intValue();
            java.lang.reflect.Method declaredMethod3 = java.io.ObjectStreamClass.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Integer.TYPE);
            declaredMethod3.setAccessible(true);
            p12561857092474322565 = new dev.epro.r0.B6436937335542174498(iIntValue, declaredMethod3);
        }
        a = p12561857092474322565;
    }

    public java.lang.Object a(java.lang.Class cls) {
        throw new java.lang.UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}
