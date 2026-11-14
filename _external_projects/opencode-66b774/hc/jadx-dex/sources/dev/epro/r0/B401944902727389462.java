package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class B401944902727389462 implements dev.epro.r0.R4833348786910499294, dev.epro.r0.B10350247327218861320, java.io.Serializable {
    private final dev.epro.r0.R4833348786910499294 completion;

    public B401944902727389462(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        this.completion = r4833348786910499294;
    }

    public dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // dev.epro.r0.B10350247327218861320
    public dev.epro.r0.B10350247327218861320 getCallerFrame() {
        dev.epro.r0.B10350247327218861320 b10350247327218861320 = this.completion;
        if (b10350247327218861320 instanceof dev.epro.r0.B10350247327218861320) {
            return b10350247327218861320;
        }
        return null;
    }

    public final dev.epro.r0.R4833348786910499294 getCompletion() {
        return this.completion;
    }

    public java.lang.StackTraceElement getStackTraceElement() {
        int iIntValue;
        java.lang.String strC;
        java.lang.reflect.Method method;
        java.lang.Object objInvoke;
        java.lang.reflect.Method method2;
        java.lang.Object objInvoke2;
        dev.epro.r0.L12113412329036287927 annotation = getClass().getAnnotation(dev.epro.r0.L12113412329036287927.class);
        java.lang.String str = null;
        if (annotation == null || annotation.v() < 1) {
            return null;
        }
        try {
            java.lang.reflect.Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? annotation.l()[iIntValue] : -1;
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = dev.epro.r0.Q13169198992966610970.g;
        dev.epro.r0.Q7316561721656982910 q73165617216569829102 = dev.epro.r0.Q13169198992966610970.h;
        if (q73165617216569829102 == null) {
            try {
                dev.epro.r0.Q7316561721656982910 q73165617216569829103 = new dev.epro.r0.Q7316561721656982910(java.lang.Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), (byte) 28);
                dev.epro.r0.Q13169198992966610970.h = q73165617216569829103;
                q73165617216569829102 = q73165617216569829103;
            } catch (java.lang.Exception unused2) {
                dev.epro.r0.Q13169198992966610970.h = q7316561721656982910;
                q73165617216569829102 = q7316561721656982910;
            }
        }
        if (q73165617216569829102 != q7316561721656982910 && (method = (java.lang.reflect.Method) q73165617216569829102.b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (java.lang.reflect.Method) q73165617216569829102.c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            java.lang.reflect.Method method3 = (java.lang.reflect.Method) q73165617216569829102.d;
            java.lang.Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof java.lang.String) {
                str = (java.lang.String) objInvoke3;
            }
        }
        if (str == null) {
            strC = annotation.c();
        } else {
            strC = str + '/' + annotation.c();
        }
        return new java.lang.StackTraceElement(strC, annotation.m(), annotation.f(), i);
    }

    public java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final void resumeWith(java.lang.Object obj) {
        ?? r2 = this;
        while (true) {
            dev.epro.r0.B401944902727389462 b401944902727389462 = (dev.epro.r0.B401944902727389462) r2;
            dev.epro.r0.R4833348786910499294 r4833348786910499294 = b401944902727389462.completion;
            r4833348786910499294.getClass();
            try {
                obj = b401944902727389462.invokeSuspend(obj);
                if (obj == dev.epro.r0.Z3437138737604933638.a) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                obj = new dev.epro.r0.C10696704014433963524(th);
            }
            b401944902727389462.releaseIntercepted();
            if (!(r4833348786910499294 instanceof dev.epro.r0.B401944902727389462)) {
                r4833348786910499294.resumeWith(obj);
                return;
            }
            r2 = r4833348786910499294;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public void releaseIntercepted() {
    }
}
