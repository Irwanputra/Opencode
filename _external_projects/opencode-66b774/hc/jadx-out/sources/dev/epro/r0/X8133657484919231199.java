package dev.epro.r0;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X8133657484919231199 implements T5398360193539863765 {
    public final int a;
    public final I1632105416032993715 b;
    public final F4096073349764486348 c;
    public I16980768508151520658 d;
    public N12973910657118401350 e;
    public O430429848373533625 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public O7746079100106269105 l;
    public boolean m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f577o;
    public long p = R13526224568477936896.a();
    public boolean q;
    public final /* synthetic */ T558270488962777544 r;

    public X8133657484919231199(T558270488962777544 t558270488962777544, int i, I1632105416032993715 i1632105416032993715, F4096073349764486348 f4096073349764486348) {
        this.r = t558270488962777544;
        this.a = i;
        this.b = i1632105416032993715;
        this.c = f4096073349764486348;
    }

    @Override // dev.epro.r0.T5398360193539863765
    public final void a() {
        this.m = true;
    }

    public final void b() {
        O430429848373533625 o430429848373533625 = this.f;
        if (o430429848373533625 != null) {
            switch (o430429848373533625.a) {
                case 0:
                    break;
                default:
                    C10361380324006518393 c10361380324006518393B = o430429848373533625.b();
                    if ((c10361380324006518393B != null ? c10361380324006518393B.f : null) != null) {
                        o430429848373533625.b.e(o430429848373533625.c);
                    }
                    break;
            }
        }
        this.f = null;
        N12973910657118401350 n12973910657118401350 = this.e;
        if (n12973910657118401350 != null) {
            n12973910657118401350.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(N5212948766656490716 n5212948766656490716) {
        boolean zD;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(n5212948766656490716);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(n5212948766656490716);
        }
        D1286559660607336098.E(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // dev.epro.r0.T5398360193539863765
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ed  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(dev.epro.r0.N5212948766656490716 r22) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X8133657484919231199.d(dev.epro.r0.N5212948766656490716):boolean");
    }

    public final boolean e() {
        O430429848373533625 o430429848373533625;
        return this.i || ((o430429848373533625 = this.f) != null && o430429848373533625.c());
    }

    public final void f(Object obj, Object obj2, U6606854693644295176 u6606854693644295176) {
        O430429848373533625 o430429848373533625;
        O430429848373533625 o4304298483735336252 = this.f;
        byte b = 0;
        if (o4304298483735336252 == null) {
            T558270488962777544 t558270488962777544 = this.r;
            L12639328004344855510 l12639328004344855510A = ((A8674383068150491476) t558270488962777544.b).a(this.a, obj, obj2);
            A12581365276667340144 a12581365276667340144A = ((Y4203361013804869221) t558270488962777544.c).a();
            if (a12581365276667340144A.a.H()) {
                a12581365276667340144A.k(obj, l12639328004344855510A, true);
                o430429848373533625 = new O430429848373533625(a12581365276667340144A, obj, (byte) 1);
            } else {
                o430429848373533625 = new O430429848373533625(a12581365276667340144A, obj, b);
            }
            o4304298483735336252 = o430429848373533625;
            this.f = o4304298483735336252;
            this.j = obj;
        }
        this.q = false;
        while (!o4304298483735336252.c() && !this.q) {
            A12732730042960812466 a12732730042960812466 = new A12732730042960812466(this, u6606854693644295176, (byte) 4);
            switch (o4304298483735336252.a) {
                case 0:
                    break;
                default:
                    C10361380324006518393 c10361380324006518393B = o4304298483735336252.b();
                    Y979168416190219423 y979168416190219423 = c10361380324006518393B != null ? c10361380324006518393B.f : null;
                    if (y979168416190219423 != null && !y979168416190219423.c()) {
                        M4722199849958580248 m4722199849958580248H = T8598786036980488824.h();
                        F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
                        M4722199849958580248 m4722199849958580248O = T8598786036980488824.o(m4722199849958580248H);
                        try {
                            y979168416190219423.e(a12732730042960812466);
                        } finally {
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.q;
        long j = this.f577o;
        if (z) {
            u6606854693644295176.b = U6606854693644295176.a(j, u6606854693644295176.b);
        } else {
            u6606854693644295176.a = U6606854693644295176.a(j, u6606854693644295176.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long jG;
        long jA = R13526224568477936896.a();
        long j = this.p;
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            jG = (1 | (jA - 1)) == Long.MAX_VALUE ? E18444280280170001567.G(jA) : E18444280280170001567.S(jA, j);
        } else if (jA == j) {
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            jG = 0;
        } else {
            jG = E17093345031926825464.m(E18444280280170001567.G(j));
        }
        long j3 = jG >> 1;
        E17149812035295265804 e171498120352952658042 = E17093345031926825464.b;
        if ((((int) jG) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
        }
        this.f577o = j2;
        long j4 = this.n - j2;
        this.n = j4;
        this.p = jA;
        D1286559660607336098.E(j4, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        I16980768508151520658 i16980768508151520658 = this.d;
        boolean zE = e();
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(i16980768508151520658);
        sb.append(", isComposed = ");
        E12098517352909843120.u(sb, zE, ", isMeasured = ", z, ", isCanceled = ");
        return E12098517352909843120.o(sb, z2, " }");
    }
}
