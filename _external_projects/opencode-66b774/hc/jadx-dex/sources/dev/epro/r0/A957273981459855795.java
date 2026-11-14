package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A957273981459855795 {
    public static final dev.epro.r0.V10300877997588547986 l = new dev.epro.r0.V10300877997588547986(new dev.epro.r0.W15213244012953673763((byte) 25), new dev.epro.r0.Y13361005827119333637((byte) 4), (byte) 20);
    public boolean a;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final dev.epro.r0.G14438155262350387569 c;
    public final java.util.concurrent.atomic.AtomicLong d;
    public dev.epro.r0.H285489298426063548 e;
    public dev.epro.r0.L14660234597990339555 f;
    public dev.epro.r0.H10076715707250891826 g;
    public dev.epro.r0.V10383417447826362791 h;
    public dev.epro.r0.H285489298426063548 i;
    public dev.epro.r0.H285489298426063548 j;
    public final dev.epro.r0.V697849047308847220 k;

    public A957273981459855795(long j) {
        dev.epro.r0.G14438155262350387569 g14438155262350387569 = dev.epro.r0.S11299071591039262705.a;
        this.c = new dev.epro.r0.G14438155262350387569();
        this.d = new java.util.concurrent.atomic.AtomicLong(j);
        dev.epro.r0.G14438155262350387569 g144381552623503875692 = dev.epro.r0.S11299071591039262705.a;
        g144381552623503875692.getClass();
        this.k = dev.epro.r0.V4416135141588678913.t(g144381552623503875692);
    }

    public final dev.epro.r0.G14438155262350387569 a() {
        return (dev.epro.r0.G14438155262350387569) this.k.getValue();
    }

    public final boolean b(dev.epro.r0.B1029012102904255937 b1029012102904255937, long j, long j2, dev.epro.r0.S6976414540931251790 s6976414540931251790, boolean z) {
        dev.epro.r0.H10076715707250891826 h10076715707250891826 = this.g;
        if (h10076715707250891826 == null) {
            return true;
        }
        dev.epro.r0.A15234621907337682254 a15234621907337682254 = h10076715707250891826.a;
        long jB = a15234621907337682254.b(b1029012102904255937, j);
        long jB2 = a15234621907337682254.b(b1029012102904255937, j2);
        a15234621907337682254.n(z);
        return a15234621907337682254.s(jB, jB2, false, s6976414540931251790);
    }

    public final void c() {
        dev.epro.r0.V10383417447826362791 v10383417447826362791 = this.h;
        if (v10383417447826362791 != null) {
            v10383417447826362791.invoke();
        }
    }

    public final void d(dev.epro.r0.B1029012102904255937 b1029012102904255937, long j, dev.epro.r0.S6976414540931251790 s6976414540931251790, boolean z) {
        dev.epro.r0.L14660234597990339555 l14660234597990339555 = this.f;
        if (l14660234597990339555 != null) {
            l14660234597990339555.i(java.lang.Boolean.valueOf(z), b1029012102904255937, new dev.epro.r0.L2216691091636065972(j), s6976414540931251790);
        }
    }

    public final java.util.ArrayList e(dev.epro.r0.B1029012102904255937 b1029012102904255937) {
        boolean z = this.a;
        java.util.ArrayList arrayList = this.b;
        if (!z) {
            dev.epro.r0.R4678422174699242737.m0(arrayList, new dev.epro.r0.K2977404645357369836(new dev.epro.r0.Q15027034467569330017(b1029012102904255937, (byte) 28), (byte) 1));
            this.a = true;
        }
        return arrayList;
    }
}
