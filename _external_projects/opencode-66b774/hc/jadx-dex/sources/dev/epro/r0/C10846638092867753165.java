package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C10846638092867753165 {
    public static final java.lang.Object a;

    static {
        java.lang.Object objInvoke;
        java.lang.reflect.Method method = null;
        try {
            objInvoke = java.lang.Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (java.lang.ThreadDeath e) {
            throw e;
        } catch (java.lang.Throwable unused) {
            objInvoke = null;
        }
        a = objInvoke;
        if (objInvoke != null) {
            try {
                java.lang.Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", java.lang.Throwable.class, java.lang.Integer.TYPE);
            } catch (java.lang.ThreadDeath e2) {
                throw e2;
            } catch (java.lang.Throwable unused2) {
            }
        }
        if (objInvoke == null) {
            return;
        }
        try {
            try {
                method = java.lang.Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", java.lang.Throwable.class);
            } catch (java.lang.ThreadDeath e3) {
                throw e3;
            } catch (java.lang.Throwable unused3) {
            }
            if (method == null) {
                return;
            }
            method.invoke(objInvoke, new java.lang.Throwable());
        } catch (java.lang.IllegalAccessException | java.lang.UnsupportedOperationException | java.lang.reflect.InvocationTargetException unused4) {
        }
    }

    public static void a(java.lang.Throwable th) throws java.lang.Throwable {
        if (java.io.IOException.class.isInstance(th)) {
            throw ((java.lang.Throwable) java.io.IOException.class.cast(th));
        }
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
    }
}
