package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E5894962793985543966 implements dev.epro.r0.U6292466256832577288 {
    public final long a;
    public final /* synthetic */ dev.epro.r0.D3326514432585990587 b;

    public E5894962793985543966(dev.epro.r0.D3326514432585990587 d3326514432585990587, long j) {
        this.b = d3326514432585990587;
        this.a = j;
    }

    public final dev.epro.r0.N3331004317457690805 N0() {
        return dev.epro.r0.T3224757362656795885.e(this.b);
    }

    public final dev.epro.r0.S6349823729575121924 S0(dev.epro.r0.B1029012102904255937 b1029012102904255937) {
        return dev.epro.r0.E2166724654553415323.a(r0(b1029012102904255937), 0L);
    }

    public final long r0(dev.epro.r0.B1029012102904255937 b1029012102904255937) {
        dev.epro.r0.B1029012102904255937 b10290121029042559372 = (dev.epro.r0.B1029012102904255937) this.b.r.getValue();
        if (b10290121029042559372 != null) {
            if (b10290121029042559372.C()) {
                return b1029012102904255937.z(b10290121029042559372.b(this.a));
            }
            return 0L;
        }
        dev.epro.r0.Y16081827717826519461.d("Tried to open context menu before the anchor was placed.");
        dev.epro.r0.Z3383101362411723454.n();
        return 0L;
    }
}
