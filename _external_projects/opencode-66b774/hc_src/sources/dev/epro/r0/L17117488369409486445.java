package dev.epro.r0;

import java.io.Closeable;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L17117488369409486445 implements Closeable {
    public static final G12238198644913880576 d;
    public final G12238198644913880576 a;
    public final ArrayDeque b = new ArrayDeque(4);
    public Throwable c;

    static {
        G12238198644913880576 g12238198644913880576;
        try {
            g12238198644913880576 = new H12843822278061842084(Throwable.class.getMethod("addSuppressed", Throwable.class), (byte) 18);
        } catch (Throwable unused) {
            g12238198644913880576 = null;
        }
        if (g12238198644913880576 == null) {
            g12238198644913880576 = T13350664027331345869.r;
        }
        d = g12238198644913880576;
    }

    public L17117488369409486445(G12238198644913880576 g12238198644913880576) {
        g12238198644913880576.getClass();
        this.a = g12238198644913880576;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.c;
        while (true) {
            ArrayDeque arrayDeque = this.b;
            if (arrayDeque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.a.g(closeable, th, th2);
                }
            }
        }
        if (this.c != null || th == null) {
            return;
        }
        C10846638092867753165.a(th);
        throw new AssertionError(th);
    }
}
