package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Z17471428274427141949 {
    public int a;
    public int b;
    public long c = 0;
    public long d = T7887780890365754025.b;
    public long e = 0;

    public abstract int c0(P777117574205674816 p777117574205674816);

    public int d0() {
        return (int) (this.c & 4294967295L);
    }

    public int j0() {
        return (int) (this.c >> 32);
    }

    public Object k() {
        return null;
    }

    public final void l0() {
        this.a = W7808703833045379622.q((int) (this.c >> 32), I16980768508151520658.k(this.d), I16980768508151520658.i(this.d));
        int iQ = W7808703833045379622.q((int) (this.c & 4294967295L), I16980768508151520658.j(this.d), I16980768508151520658.h(this.d));
        this.b = iQ;
        int i = this.a;
        long j = this.c;
        this.e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iQ - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void n0(long j, float f, F4096073349764486348 f4096073349764486348);

    public void o0(long j, float f, B9692660393722135472 b9692660393722135472) {
        n0(j, f, null);
    }

    public final void q0(long j) {
        if (Q13254524308163418711.a(this.c, j)) {
            return;
        }
        this.c = j;
        l0();
    }

    public final void r0(long j) {
        if (I16980768508151520658.c(this.d, j)) {
            return;
        }
        this.d = j;
        l0();
    }
}
