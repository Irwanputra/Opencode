package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class F18165119615291114631 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ W10506740848038723587 b;

    public /* synthetic */ F18165119615291114631(W10506740848038723587 w10506740848038723587, byte b) {
        this.a = b;
        this.b = w10506740848038723587;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        W10506740848038723587 w10506740848038723587 = this.b;
        switch (b) {
            case 0:
                w10506740848038723587.j1();
                return O9245300239821758723.a;
            case 1:
                return new L2216691091636065972(w10506740848038723587.C);
            default:
                B1029012102904255937 b1029012102904255937 = (B1029012102904255937) w10506740848038723587.A.getValue();
                return new L2216691091636065972(b1029012102904255937 != null ? b1029012102904255937.O(0L) : 9205357640488583168L);
        }
    }
}
