package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M17763053376652541107 implements N235339945877347053 {
    public final L17554200096564731241 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public long d = 0;
    public V8323072410254082725 e = V8323072410254082725.c;
    public boolean f = true;
    public S6976414540931251790 g = B14824868959299866349.n;
    public final /* synthetic */ D2717688760023469083 h;

    public M17763053376652541107(D2717688760023469083 d2717688760023469083, L17554200096564731241 l17554200096564731241) {
        this.h = d2717688760023469083;
        this.a = l17554200096564731241;
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void b(long j, S6976414540931251790 s6976414540931251790) {
        D2717688760023469083 d2717688760023469083 = this.h;
        boolean z = d2717688760023469083.i;
        N1420218926656397722 n1420218926656397722 = d2717688760023469083.a;
        I12071840179596922896 i12071840179596922896 = d2717688760023469083.b;
        if (z) {
            d2717688760023469083.A(this.e, j);
            d2717688760023469083.w(false);
            d2717688760023469083.q.setValue(A9296802071731955712.b);
            this.c = j;
            this.d = 0L;
            d2717688760023469083.v = -1;
            this.f = true;
            this.g = s6976414540931251790;
            if (i12071840179596922896.c() == null) {
                return;
            }
            if (i12071840179596922896.f(j)) {
                if (n1420218926656397722.d().c.length() == 0) {
                    return;
                }
                int iD = i12071840179596922896.d(j, true);
                long jB = d2717688760023469083.B(new C8185053590072587931(d2717688760023469083.a.d(), F12478849263529740365.b, null, null, null, null, null, 124), iD, iD, false, this.g, false, false, new U11239405163472986846(0));
                n1420218926656397722.j(jB);
                d2717688760023469083.x(S5779100572589057142.c);
                this.b = (int) (jB >> 32);
                return;
            }
            int iD2 = i12071840179596922896.d(j, true);
            I16162375839174538453 i16162375839174538453 = d2717688760023469083.j;
            if (i16162375839174538453 != null) {
                ((D1743966822371805936) i16162375839174538453).a(0);
            }
            n1420218926656397722.getClass();
            n1420218926656397722.j(T1335862270807194835.d(iD2, iD2));
            d2717688760023469083.w(true);
            this.f = false;
            d2717688760023469083.x(S5779100572589057142.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff A[PHI: r16
      0x00ff: PHI (r16v4 long) = (r16v3 long), (r16v5 long) binds: [B:60:0x0113, B:56:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // dev.epro.r0.N235339945877347053
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r19) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M17763053376652541107.d(long):void");
    }

    public final void e() {
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            D2717688760023469083 d2717688760023469083 = this.h;
            d2717688760023469083.b();
            this.b = -1;
            this.c = 9205357640488583168L;
            this.d = 0L;
            d2717688760023469083.v = -1;
            this.g = B14824868959299866349.n;
            d2717688760023469083.q.setValue(A9296802071731955712.a);
            this.a.invoke();
            if (this.f) {
                d2717688760023469083.r();
            }
        }
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void onCancel() {
        e();
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void onStop() {
        e();
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void a() {
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void c() {
    }
}
