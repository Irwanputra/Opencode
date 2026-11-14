package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O16293483527628663156 implements N235339945877347053 {
    public long a = 9205357640488583168L;
    public long b = 9205357640488583168L;
    public long c = 0;
    public S6976414540931251790 d = B14824868959299866349.n;
    public final /* synthetic */ I15373308283076409852 e;
    public final /* synthetic */ I15373308283076409852 f;
    public final /* synthetic */ A957273981459855795 g;

    public O16293483527628663156(I15373308283076409852 i15373308283076409852, I15373308283076409852 i153733082830764098522, A957273981459855795 a957273981459855795) {
        this.e = i15373308283076409852;
        this.f = i153733082830764098522;
        this.g = a957273981459855795;
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void b(long j, S6976414540931251790 s6976414540931251790) {
        this.d = s6976414540931251790;
        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) this.f.invoke();
        if (b1029012102904255937 != null) {
            if (!b1029012102904255937.C()) {
                return;
            }
            this.g.d(b1029012102904255937, j, this.d, true);
            this.a = j;
            this.b = b1029012102904255937.O(0L);
        }
        if (E3933996248613761216.a(this.g, ((Number) this.e.invoke()).longValue())) {
            this.c = 0L;
        }
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void d(long j) {
        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) this.f.invoke();
        if (b1029012102904255937 == null || !b1029012102904255937.C()) {
            return;
        }
        long longValue = ((Number) this.e.invoke()).longValue();
        A957273981459855795 a957273981459855795 = this.g;
        if (E3933996248613761216.a(a957273981459855795, longValue)) {
            this.c = L2216691091636065972.f(this.c, j);
            long e = L2216691091636065972.e(L2216691091636065972.f(this.a, this.c), L2216691091636065972.e(b1029012102904255937.O(0L), this.b));
            if (a957273981459855795.b(b1029012102904255937, e, this.a, this.d, true)) {
                this.a = e;
                this.b = b1029012102904255937.O(0L);
                this.c = 0L;
            }
        }
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void onCancel() {
        long longValue = ((Number) this.e.invoke()).longValue();
        A957273981459855795 a957273981459855795 = this.g;
        if (E3933996248613761216.a(a957273981459855795, longValue)) {
            a957273981459855795.c();
        }
        this.a = 9205357640488583168L;
        this.b = 9205357640488583168L;
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void onStop() {
        long longValue = ((Number) this.e.invoke()).longValue();
        A957273981459855795 a957273981459855795 = this.g;
        if (E3933996248613761216.a(a957273981459855795, longValue)) {
            a957273981459855795.c();
        }
        this.a = 9205357640488583168L;
        this.b = 9205357640488583168L;
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void a() {
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void c() {
    }
}
