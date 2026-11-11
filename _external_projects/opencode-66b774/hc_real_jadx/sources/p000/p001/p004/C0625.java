package p000.p001.p004;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0625<T> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f4327;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Class[] f4328;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Class<?> f4329;

    public C0625(Class<?> cls, String str, Class... clsArr) {
        this.f4329 = cls;
        this.f4327 = str;
        this.f4328 = clsArr;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Object m1796(T t, Object... objArr) {
        Method m1798 = m1798(t.getClass());
        if (m1798 == null) {
            StringBuilder m4207 = C2098.m4207("Method ");
            m4207.append(this.f4327);
            m4207.append(" not supported for object ");
            m4207.append(t);
            throw new AssertionError(m4207.toString());
        }
        try {
            return m1798.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + m1798);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Object m1797(T t, Object... objArr) {
        try {
            Method m1798 = m1798(t.getClass());
            if (m1798 == null) {
                return null;
            }
            try {
                return m1798.invoke(t, objArr);
            } catch (IllegalAccessException unused) {
                return null;
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if ((r4.getModifiers() & 1) == 0) goto L9;
     */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Method m1798(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f4327
            r1 = 0
            if (r0 == 0) goto L26
            java.lang.Class[] r2 = r3.f4328
            java.lang.reflect.Method r4 = r4.getMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L13
            int r0 = r4.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L14
            r0 = r0 & 1
            if (r0 != 0) goto L14
        L13:
            r4 = r1
        L14:
            if (r4 == 0) goto L25
            java.lang.Class<?> r0 = r3.f4329
            if (r0 == 0) goto L25
            java.lang.Class r2 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L25
            goto L26
        L25:
            r1 = r4
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p001.p004.C0625.m1798(java.lang.Class):java.lang.reflect.Method");
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Object m1799(T t, Object... objArr) {
        try {
            return m1796(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
