package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T11693019737995189368 {
    public final B1029012102904255937 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final U9803441765912152712 f = new U9803441765912152712();
    public final N27869097736109461 g = new N27869097736109461();
    public final G14438155262350387569 h = new G14438155262350387569(10);

    public T11693019737995189368(B1029012102904255937 b1029012102904255937) {
        this.a = b1029012102904255937;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r19, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T11693019737995189368.a(long, java.util.List, boolean):void");
    }

    public final boolean b(N10542843603712830247 n10542843603712830247, boolean z) {
        N27869097736109461 n27869097736109461 = this.g;
        D389890677992184566 d389890677992184566 = n27869097736109461.a;
        if (!n27869097736109461.a((A18377563779865231301) n10542843603712830247.b, this.a, n10542843603712830247, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((B7467881838773648178) objArr[i2]).e(n10542843603712830247, z) || z3;
        }
        Object[] objArr2 = d389890677992184566.a;
        int i3 = d389890677992184566.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((B7467881838773648178) objArr2[i4]).d(n10542843603712830247) || z4;
        }
        n27869097736109461.b(n10542843603712830247);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            U9803441765912152712 u9803441765912152712 = this.f;
            int i5 = u9803441765912152712.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((R15896830329318850690) u9803441765912152712.f(i6));
            }
            u9803441765912152712.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            n27869097736109461.a.i();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        N27869097736109461 n27869097736109461 = this.g;
        D389890677992184566 d389890677992184566 = n27869097736109461.a;
        Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((B7467881838773648178) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            n27869097736109461.a.i();
        }
    }

    public final void d(R15896830329318850690 r15896830329318850690) {
        if (this.b) {
            this.e = true;
            this.f.a(r15896830329318850690);
            return;
        }
        N27869097736109461 n27869097736109461 = this.g;
        U9803441765912152712 u9803441765912152712 = n27869097736109461.b;
        u9803441765912152712.d();
        u9803441765912152712.a(n27869097736109461);
        while (u9803441765912152712.i()) {
            N27869097736109461 n278690977361094612 = (N27869097736109461) u9803441765912152712.k(u9803441765912152712.b - 1);
            int i = 0;
            while (true) {
                D389890677992184566 d389890677992184566 = n278690977361094612.a;
                if (i < d389890677992184566.c) {
                    B7467881838773648178 b7467881838773648178 = (B7467881838773648178) d389890677992184566.a[i];
                    if (b7467881838773648178.c.equals(r15896830329318850690)) {
                        n278690977361094612.a.l(b7467881838773648178);
                        b7467881838773648178.c();
                    } else {
                        u9803441765912152712.a(b7467881838773648178);
                        i++;
                    }
                }
            }
        }
    }
}
