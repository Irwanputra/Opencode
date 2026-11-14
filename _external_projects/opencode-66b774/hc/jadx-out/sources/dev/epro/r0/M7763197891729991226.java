package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M7763197891729991226 implements H3685497765029482167 {
    public final L17554200096564731241 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public boolean d = true;
    public final /* synthetic */ D2717688760023469083 e;

    public M7763197891729991226(D2717688760023469083 d2717688760023469083, L17554200096564731241 l17554200096564731241) {
        this.e = d2717688760023469083;
        this.a = l17554200096564731241;
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final void a() {
        A9296802071731955712 a9296802071731955712 = A9296802071731955712.a;
        D2717688760023469083 d2717688760023469083 = this.e;
        d2717688760023469083.q.setValue(a9296802071731955712);
        if (this.d) {
            d2717688760023469083.r();
        }
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final boolean b(long j) {
        return true;
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final boolean c(long j, S6976414540931251790 s6976414540931251790, int i) {
        D2717688760023469083 d2717688760023469083 = this.e;
        Q17957571128037780363 q17957571128037780363C = d2717688760023469083.b.c();
        if (!d2717688760023469083.i || q17957571128037780363C == null || d2717688760023469083.a.d().c.length() == 0) {
            return false;
        }
        this.d = i >= 2;
        d2717688760023469083.q.setValue(A9296802071731955712.c);
        this.a.invoke();
        d2717688760023469083.v = -1;
        this.b = -1;
        this.c = j;
        this.b = (int) (f(j, s6976414540931251790, q17957571128037780363C, true) >> 32);
        return true;
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final boolean d(long j, S6976414540931251790 s6976414540931251790) {
        D2717688760023469083 d2717688760023469083 = this.e;
        I12071840179596922896 i12071840179596922896 = d2717688760023469083.b;
        N1420218926656397722 n1420218926656397722 = d2717688760023469083.a;
        Q17957571128037780363 q17957571128037780363C = i12071840179596922896.c();
        if (!d2717688760023469083.i || q17957571128037780363C == null || n1420218926656397722.d().c.length() == 0) {
            return false;
        }
        if (F12478849263529740365.c(n1420218926656397722.d().d, f(j, s6976414540931251790, q17957571128037780363C, false))) {
            return true;
        }
        this.d = false;
        return true;
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final boolean e(long j) {
        D2717688760023469083 d2717688760023469083 = this.e;
        Q17957571128037780363 q17957571128037780363C = d2717688760023469083.b.c();
        if (!d2717688760023469083.i || q17957571128037780363C == null || d2717688760023469083.a.d().c.length() == 0) {
            return false;
        }
        this.d = false;
        this.a.invoke();
        f(j, B14824868959299866349.n, q17957571128037780363C, false);
        return true;
    }

    public final long f(long j, S6976414540931251790 s6976414540931251790, Q17957571128037780363 q17957571128037780363, boolean z) {
        int length = q17957571128037780363.a.a.b.length();
        int iD = this.b;
        D2717688760023469083 d2717688760023469083 = this.e;
        if (iD < 0 || iD > length) {
            iD = d2717688760023469083.b.d(this.c, false);
        }
        int i = iD;
        long jB = d2717688760023469083.B(d2717688760023469083.a.d(), i, d2717688760023469083.b.d(j, false), false, s6976414540931251790, false, z, null);
        if (this.b == -1 && !F12478849263529740365.d(jB)) {
            this.b = (int) (jB >> 32);
        }
        if (F12478849263529740365.h(jB)) {
            jB = T1335862270807194835.d((int) (4294967295L & jB), (int) (jB >> 32));
        }
        d2717688760023469083.a.j(jB);
        d2717688760023469083.x(S5779100572589057142.c);
        return jB;
    }
}
