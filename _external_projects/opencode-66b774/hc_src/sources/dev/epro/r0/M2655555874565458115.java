package dev.epro.r0;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class M2655555874565458115 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        a = unsafe.objectFieldOffset(M2655555874565458115.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(M2655555874565458115.class.getDeclaredField("_prev$volatile"));
    }

    public M2655555874565458115(X17453750288186724334 x17453750288186724334) {
        this._prev$volatile = x17453750288186724334;
    }

    public final void a() {
        T5284056093300834442.a.putObjectVolatile(this, b, (Object) null);
    }

    public final M2655555874565458115 c() {
        Object objectVolatile = T5284056093300834442.a.getObjectVolatile(this, a);
        if (objectVolatile == O4077903568229246.g) {
            return null;
        }
        return (M2655555874565458115) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        M2655555874565458115 m2655555874565458115;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = T5284056093300834442.a;
            long j = b;
            M2655555874565458115 m26555558745654581152 = (M2655555874565458115) unsafe2.getObjectVolatile(this, j);
            while (m26555558745654581152 != null && m26555558745654581152.d()) {
                m26555558745654581152 = (M2655555874565458115) T5284056093300834442.a.getObjectVolatile(m26555558745654581152, j);
            }
            M2655555874565458115 c2 = c();
            c2.getClass();
            do {
                m2655555874565458115 = c2;
                if (!m2655555874565458115.d()) {
                    break;
                } else {
                    c2 = m2655555874565458115.c();
                }
            } while (c2 != null);
            while (true) {
                Object objectVolatile = T5284056093300834442.a.getObjectVolatile(m2655555874565458115, j);
                M2655555874565458115 m26555558745654581153 = ((M2655555874565458115) objectVolatile) == null ? null : m26555558745654581152;
                do {
                    unsafe = T5284056093300834442.a;
                    if (unsafe.compareAndSwapObject(m2655555874565458115, b, objectVolatile, m26555558745654581153)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(m2655555874565458115, j) == objectVolatile);
            }
            if (m26555558745654581152 != null) {
                unsafe.putObjectVolatile(m26555558745654581152, a, m2655555874565458115);
            }
            if (!m2655555874565458115.d() || m2655555874565458115.c() == null) {
                if (m26555558745654581152 == null || !m26555558745654581152.d()) {
                    return;
                }
            }
        }
    }
}
