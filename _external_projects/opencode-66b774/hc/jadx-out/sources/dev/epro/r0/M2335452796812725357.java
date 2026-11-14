package dev.epro.r0;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class M2335452796812725357 {
    public final /* synthetic */ byte a;
    public final Unsafe b;

    public /* synthetic */ M2335452796812725357(Unsafe unsafe, byte b) {
        this.a = b;
        this.b = unsafe;
    }

    public abstract boolean a(long j, Object obj);

    public abstract byte b(long j, Object obj);

    public abstract double c(long j, Object obj);

    public abstract float d(long j, Object obj);

    public abstract void e(Object obj, long j, boolean z);

    public abstract void f(long j, Object obj, byte b);

    public abstract void g(Object obj, long j, double d);

    public abstract void h(Object obj, long j, float f);

    public boolean i() {
        byte b = this.a;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                if (unsafe != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        cls3.getMethod("getInt", Object.class, cls2);
                        cls3.getMethod("putInt", Object.class, cls2, cls);
                        cls3.getMethod("getLong", Object.class, cls2);
                        cls3.getMethod("putLong", Object.class, cls2, cls2);
                        cls3.getMethod("getObject", Object.class, cls2);
                        cls3.getMethod("putObject", Object.class, cls2, Object.class);
                    } catch (Throwable th) {
                        Z3287610729711297369.k(th);
                    }
                }
                break;
            case 1:
                if (unsafe != null) {
                    try {
                        Class<?> cls4 = unsafe.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls2);
                        cls4.getMethod("putInt", Object.class, cls2, cls);
                        cls4.getMethod("getLong", Object.class, cls2);
                        cls4.getMethod("putLong", Object.class, cls2, cls2);
                        cls4.getMethod("getObject", Object.class, cls2);
                        cls4.getMethod("putObject", Object.class, cls2, Object.class);
                    } catch (Throwable th2) {
                        J3288146055636008296.k(th2);
                    }
                }
                break;
            default:
                if (unsafe != null) {
                    try {
                        Class<?> cls5 = unsafe.getClass();
                        cls5.getMethod("objectFieldOffset", Field.class);
                        cls5.getMethod("arrayBaseOffset", Class.class);
                        cls5.getMethod("arrayIndexScale", Class.class);
                        cls5.getMethod("getInt", Object.class, cls2);
                        cls5.getMethod("putInt", Object.class, cls2, cls);
                        cls5.getMethod("getLong", Object.class, cls2);
                        cls5.getMethod("putLong", Object.class, cls2, cls2);
                        cls5.getMethod("getObject", Object.class, cls2);
                        cls5.getMethod("putObject", Object.class, cls2, Object.class);
                    } catch (Throwable th3) {
                        P4046997492550522548.i(th3);
                    }
                }
                break;
        }
        return false;
    }

    public abstract boolean j();

    public abstract double k(long j, Object obj);

    public abstract float l(long j, Object obj);

    public abstract void m(Object obj, long j, boolean z);

    public abstract void n(long j, Object obj, byte b);

    public abstract void o(Object obj, long j, double d);

    public abstract void p(Object obj, long j, float f);

    public abstract boolean q(long j, Object obj);
}
