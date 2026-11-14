package dev.epro.r0;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N11611180034702960692 extends Q9039728214998424519 implements Executor {
    public static final N11611180034702960692 c = new N11611180034702960692();
    public static final D11883231851729262595 d;

    static {
        F12425152080794183551 f12425152080794183551 = F12425152080794183551.c;
        int i = M9967499841304440286.a;
        if (64 >= i) {
            i = 64;
        }
        d = f12425152080794183551.C(G7713175901684004489.k(i, 12, "kotlinx.coroutines.io.parallelism"), null);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void A(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        d.A(g8001132634698687269, runnable);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final D11883231851729262595 C(int i, String str) {
        return F12425152080794183551.c.C(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z(I3826119971291161142.a, runnable);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void z(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        d.z(g8001132634698687269, runnable);
    }

    @Override // dev.epro.r0.Q9039728214998424519
    public final Executor D() {
        return this;
    }
}
