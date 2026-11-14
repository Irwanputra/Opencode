package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A9721492999439138426 implements dev.epro.r0.H3685497765029482167 {
    public long a = 0;
    public final /* synthetic */ dev.epro.r0.B13729205492206812220 b;
    public final /* synthetic */ dev.epro.r0.A957273981459855795 c;
    public final /* synthetic */ dev.epro.r0.B13729205492206812220 d;

    public A9721492999439138426(dev.epro.r0.I15373308283076409852 i15373308283076409852, dev.epro.r0.A957273981459855795 a957273981459855795, dev.epro.r0.B13729205492206812220 b13729205492206812220) {
        this.b = i15373308283076409852;
        this.c = a957273981459855795;
        this.d = b13729205492206812220;
    }

    public final void a() {
        this.c.c();
    }

    public final boolean b(long j) {
        dev.epro.r0.B1029012102904255937 b1029012102904255937 = (dev.epro.r0.B1029012102904255937) this.d.invoke();
        if (b1029012102904255937 == null) {
            return true;
        }
        if (!b1029012102904255937.C() || !f()) {
            return false;
        }
        if (!this.c.b(b1029012102904255937, j, this.a, dev.epro.r0.B14824868959299866349.n, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    public final boolean c(long j, dev.epro.r0.S6976414540931251790 s6976414540931251790, int i) {
        dev.epro.r0.B1029012102904255937 b1029012102904255937 = (dev.epro.r0.B1029012102904255937) this.d.invoke();
        if (b1029012102904255937 == null || !b1029012102904255937.C()) {
            return false;
        }
        this.c.d(b1029012102904255937, j, s6976414540931251790, false);
        this.a = j;
        return f();
    }

    public final boolean d(long j, dev.epro.r0.S6976414540931251790 s6976414540931251790) {
        dev.epro.r0.B1029012102904255937 b1029012102904255937 = (dev.epro.r0.B1029012102904255937) this.d.invoke();
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

    public final boolean e(long j) {
        dev.epro.r0.B1029012102904255937 b1029012102904255937 = (dev.epro.r0.B1029012102904255937) this.d.invoke();
        if (b1029012102904255937 == null || !b1029012102904255937.C()) {
            return false;
        }
        if (this.c.b(b1029012102904255937, j, this.a, dev.epro.r0.B14824868959299866349.n, false)) {
            this.a = j;
        }
        return f();
    }

    public final boolean f() {
        dev.epro.r0.B13729205492206812220 b13729205492206812220 = this.b;
        if (b13729205492206812220 == null) {
            return true;
        }
        return dev.epro.r0.E3933996248613761216.a(this.c, ((java.lang.Number) b13729205492206812220.invoke()).longValue());
    }
}
