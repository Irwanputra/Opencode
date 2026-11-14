package dev.epro.r0;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y10288379321248498973 extends Q9039728214998424519 {
    public static final Y10288379321248498973 d;
    public Z8958134903007948842 c;

    static {
        int i = F13835057046869638895.c;
        int i2 = F13835057046869638895.d;
        long j = F13835057046869638895.e;
        String str = F13835057046869638895.a;
        Y10288379321248498973 y10288379321248498973 = new Y10288379321248498973();
        y10288379321248498973.c = new Z8958134903007948842(j, str, i, i2);
        d = y10288379321248498973;
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void A(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        Z8958134903007948842.d(this.c, runnable, 2);
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final D11883231851729262595 C(int i, String str) {
        E12775674050813925581.u(i);
        return i >= F13835057046869638895.c ? str != null ? new O1128333822239684917(this, str) : this : super.C(i, str);
    }

    @Override // dev.epro.r0.Q9039728214998424519
    public final Executor D() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // dev.epro.r0.D11883231851729262595
    public final void z(G8001132634698687269 g8001132634698687269, Runnable runnable) {
        Z8958134903007948842.d(this.c, runnable, 6);
    }
}
