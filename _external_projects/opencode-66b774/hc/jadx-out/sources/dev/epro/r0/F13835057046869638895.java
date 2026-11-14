package dev.epro.r0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F13835057046869638895 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final P2382941533350862833 f;

    static {
        String property;
        int i = M9967499841304440286.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = G7713175901684004489.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = M9967499841304440286.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = G7713175901684004489.k(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = G7713175901684004489.k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(G7713175901684004489.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = P2382941533350862833.q;
    }
}
