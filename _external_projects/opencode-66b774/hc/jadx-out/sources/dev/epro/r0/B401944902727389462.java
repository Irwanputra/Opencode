package dev.epro.r0;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class B401944902727389462 implements R4833348786910499294, B10350247327218861320, Serializable {
    private final R4833348786910499294 completion;

    public B401944902727389462(R4833348786910499294 r4833348786910499294) {
        this.completion = r4833348786910499294;
    }

    public R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public B10350247327218861320 getCallerFrame() {
        R4833348786910499294 r4833348786910499294 = this.completion;
        if (r4833348786910499294 instanceof B10350247327218861320) {
            return (B10350247327218861320) r4833348786910499294;
        }
        return null;
    }

    public final R4833348786910499294 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        L12113412329036287927 l12113412329036287927 = (L12113412329036287927) getClass().getAnnotation(L12113412329036287927.class);
        String str = null;
        if (l12113412329036287927 == null || l12113412329036287927.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? l12113412329036287927.l()[iIntValue] : -1;
        Q7316561721656982910 q7316561721656982910 = Q13169198992966610970.g;
        Q7316561721656982910 q73165617216569829102 = Q13169198992966610970.h;
        if (q73165617216569829102 == null) {
            try {
                Q7316561721656982910 q73165617216569829103 = new Q7316561721656982910((Object) Class.class.getDeclaredMethod("getModule", null), (Object) getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), (Object) getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), (byte) 28);
                Q13169198992966610970.h = q73165617216569829103;
                q73165617216569829102 = q73165617216569829103;
            } catch (Exception unused2) {
                Q13169198992966610970.h = q7316561721656982910;
                q73165617216569829102 = q7316561721656982910;
            }
        }
        if (q73165617216569829102 != q7316561721656982910 && (method = (Method) q73165617216569829102.b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) q73165617216569829102.c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) q73165617216569829102.d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = l12113412329036287927.c();
        } else {
            strC = str + '/' + l12113412329036287927.c();
        }
        return new StackTraceElement(strC, l12113412329036287927.m(), l12113412329036287927.f(), i);
    }

    public Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // dev.epro.r0.R4833348786910499294
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            B401944902727389462 b401944902727389462 = (B401944902727389462) r2;
            R4833348786910499294 r4833348786910499294 = b401944902727389462.completion;
            r4833348786910499294.getClass();
            try {
                obj = b401944902727389462.invokeSuspend(obj);
                if (obj == Z3437138737604933638.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C10696704014433963524(th);
            }
            b401944902727389462.releaseIntercepted();
            if (!(r4833348786910499294 instanceof B401944902727389462)) {
                r4833348786910499294.resumeWith(obj);
                return;
            }
            r2 = r4833348786910499294;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public void releaseIntercepted() {
    }
}
