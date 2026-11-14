package dev.epro.r0;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z4393858248417481446 extends Y7327269104420830054 {
    public final /* synthetic */ W10382756971622296125 n;

    public Z4393858248417481446(W10382756971622296125 w10382756971622296125) {
        this.n = w10382756971622296125;
    }

    @Override // dev.epro.r0.Y7327269104420830054
    public final void j() {
        this.n.f(N10274084507843431211.CANCEL);
        A13573370436844979007 a13573370436844979007 = this.n.b;
        synchronized (a13573370436844979007) {
            long j = a13573370436844979007.n;
            long j2 = a13573370436844979007.m;
            if (j < j2) {
                return;
            }
            a13573370436844979007.m = j2 + 1;
            a13573370436844979007.f150o = System.nanoTime() + 1000000000;
            Z9658010704151025794.b(a13573370436844979007.h, G6547577305291411977.u(new StringBuilder(), a13573370436844979007.c, " ping"), new W2269277550458425547(a13573370436844979007, (byte) 3));
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
