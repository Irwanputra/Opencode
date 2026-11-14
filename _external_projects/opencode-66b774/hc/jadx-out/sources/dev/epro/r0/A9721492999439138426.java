package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A9721492999439138426 implements H3685497765029482167 {
    public long a = 0;
    public final /* synthetic */ B13729205492206812220 b;
    public final /* synthetic */ A957273981459855795 c;
    public final /* synthetic */ B13729205492206812220 d;

    public A9721492999439138426(I15373308283076409852 i15373308283076409852, A957273981459855795 a957273981459855795, B13729205492206812220 b13729205492206812220) {
        this.b = i15373308283076409852;
        this.c = a957273981459855795;
        this.d = b13729205492206812220;
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final void a() {
        this.c.c();
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final boolean b(long j) {
        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) this.d.invoke();
        if (b1029012102904255937 == null) {
            return true;
        }
        if (!b1029012102904255937.C() || !f()) {
            return false;
        }
        if (!this.c.b(b1029012102904255937, j, this.a, B14824868959299866349.n, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final boolean c(long j, S6976414540931251790 s6976414540931251790, int i) {
        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) this.d.invoke();
        if (b1029012102904255937 == null || !b1029012102904255937.C()) {
            return false;
        }
        this.c.d(b1029012102904255937, j, s6976414540931251790, false);
        this.a = j;
        return f();
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final boolean d(long j, S6976414540931251790 s6976414540931251790) {
        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) this.d.invoke();
        if (b1029012102904255937 == null) {
            return true;
        }
        if (!b1029012102904255937.C() || !f()) {
            return false;
        }
        if (!this.c.b(b1029012102904255937, j, this.a, s6976414540931251790, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    @Override // dev.epro.r0.H3685497765029482167
    public final boolean e(long j) {
        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) this.d.invoke();
        if (b1029012102904255937 == null || !b1029012102904255937.C()) {
            return false;
        }
        if (this.c.b(b1029012102904255937, j, this.a, B14824868959299866349.n, false)) {
            this.a = j;
        }
        return f();
    }

    public final boolean f() {
        B13729205492206812220 b13729205492206812220 = this.b;
        if (b13729205492206812220 == null) {
            return true;
        }
        return E3933996248613761216.a(this.c, ((Number) b13729205492206812220.invoke()).longValue());
    }
}
