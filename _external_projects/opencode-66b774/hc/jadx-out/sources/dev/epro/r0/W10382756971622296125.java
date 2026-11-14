package dev.epro.r0;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W10382756971622296125 implements L6498280162989651404 {
    public final int a;
    public final A13573370436844979007 b;
    public final Y17131958419000606632 c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public boolean g;
    public final A6352962637471496627 h;
    public final K13582539523188875145 i;
    public final Z4393858248417481446 j;
    public final Z4393858248417481446 k;
    public N10274084507843431211 l;
    public IOException m;

    public W10382756971622296125(int i, A13573370436844979007 a13573370436844979007, boolean z, boolean z2, F12902864952249894497 f12902864952249894497) {
        a13573370436844979007.getClass();
        this.a = i;
        this.b = a13573370436844979007;
        this.c = new Y17131958419000606632(i);
        this.e = a13573370436844979007.r.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.h = new A6352962637471496627(this, a13573370436844979007.q.a(), z2);
        this.i = new K13582539523188875145(this, z);
        this.j = new Z4393858248417481446(this);
        this.k = new Z4393858248417481446(this);
        if (f12902864952249894497 == null) {
            if (h()) {
                return;
            }
            S10973172697741180971.m("remotely-initiated streams should have headers");
            throw null;
        }
        if (h()) {
            S10973172697741180971.m("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(f12902864952249894497);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = dev.epro.r0.C14766148968941961570.a
            monitor-enter(r2)
            dev.epro.r0.A6352962637471496627 r0 = r2.h     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            dev.epro.r0.K13582539523188875145 r0 = r2.i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.j()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            dev.epro.r0.N10274084507843431211 r0 = dev.epro.r0.N10274084507843431211.CANCEL
            r1 = 0
            r2.d(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            dev.epro.r0.A13573370436844979007 r0 = r2.b
            int r2 = r2.a
            r0.d(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W10382756971622296125.a():void");
    }

    public final void b() throws IOException {
        K13582539523188875145 k13582539523188875145 = this.i;
        if (k13582539523188875145.c) {
            Q11088980322693754445.h("stream closed");
            return;
        }
        if (k13582539523188875145.a) {
            Q11088980322693754445.h("stream finished");
            return;
        }
        if (g() != null) {
            IOException iOException = this.m;
            if (iOException != null) {
                throw iOException;
            }
            N10274084507843431211 n10274084507843431211G = g();
            n10274084507843431211G.getClass();
            throw new L12800179862900820669(n10274084507843431211G);
        }
    }

    @Override // dev.epro.r0.L6498280162989651404
    public final S7370861580758580261 c() {
        return this.h;
    }

    public final void d(N10274084507843431211 n10274084507843431211, IOException iOException) {
        if (e(n10274084507843431211, iOException)) {
            A13573370436844979007 a13573370436844979007 = this.b;
            a13573370436844979007.getClass();
            a13573370436844979007.w.j(this.a, n10274084507843431211);
        }
    }

    public final boolean e(N10274084507843431211 n10274084507843431211, IOException iOException) {
        TimeZone timeZone = C14766148968941961570.a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.l = n10274084507843431211;
            this.m = iOException;
            notifyAll();
            if (this.h.b) {
                if (this.i.a) {
                    return false;
                }
            }
            this.b.d(this.a);
            return true;
        }
    }

    public final void f(N10274084507843431211 n10274084507843431211) {
        if (e(n10274084507843431211, null)) {
            this.b.j(this.a, n10274084507843431211);
        }
    }

    public final N10274084507843431211 g() {
        N10274084507843431211 n10274084507843431211;
        synchronized (this) {
            n10274084507843431211 = this.l;
        }
        return n10274084507843431211;
    }

    public final boolean h() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    @Override // dev.epro.r0.L6498280162989651404
    public final U10510841700634832156 i() {
        return this.i;
    }

    public final boolean j() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                A6352962637471496627 a6352962637471496627 = this.h;
                if (a6352962637471496627.b || a6352962637471496627.e) {
                    K13582539523188875145 k13582539523188875145 = this.i;
                    if (k13582539523188875145.a || k13582539523188875145.c) {
                        if (this.g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(F12902864952249894497 f12902864952249894497, boolean z) {
        boolean zJ;
        f12902864952249894497.getClass();
        TimeZone timeZone = C14766148968941961570.a;
        synchronized (this) {
            try {
                if (this.g && f12902864952249894497.a(":status") == null && f12902864952249894497.a(":method") == null) {
                    this.h.getClass();
                } else {
                    this.g = true;
                    this.f.add(f12902864952249894497);
                }
                if (z) {
                    this.h.b = true;
                }
                zJ = j();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zJ) {
            return;
        }
        this.b.d(this.a);
    }
}
