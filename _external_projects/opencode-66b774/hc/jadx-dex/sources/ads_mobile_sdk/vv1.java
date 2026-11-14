package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vv1 {
    public final dev.epro.r0.I16631908410500040363 a;
    public final dev.epro.r0.I16631908410500040363 b;
    public final dev.epro.r0.I16631908410500040363 c;
    public final dev.epro.r0.I16631908410500040363 d;
    public final dev.epro.r0.I16631908410500040363 e;

    public vv1(dev.epro.r0.I16631908410500040363 i16631908410500040363, dev.epro.r0.I16631908410500040363 i166319084105000403632, dev.epro.r0.I16631908410500040363 i166319084105000403633, dev.epro.r0.I16631908410500040363 i166319084105000403634, dev.epro.r0.I16631908410500040363 i166319084105000403635) {
        this.a = i16631908410500040363;
        this.b = i166319084105000403632;
        this.c = i166319084105000403633;
        this.d = i166319084105000403634;
        this.e = i166319084105000403635;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.vv1)) {
            return false;
        }
        ads_mobile_sdk.vv1 vv1Var = (ads_mobile_sdk.vv1) obj;
        return this.a.equals(vv1Var.a) && this.b.equals(vv1Var.b) && this.c.equals(vv1Var.c) && this.d.equals(vv1Var.d) && this.e.equals(vv1Var.e);
    }

    public final int hashCode() {
        return this.e.a.hashCode() + ((this.d.a.hashCode() + ((this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "NativeAdSignals(assetViewsSignal=" + this.a + ", nativeAdViewSignal=" + this.b + ", scrollViewSignal=" + this.c + ", lockScreenSignal=" + this.d + ", adScreenSignal=" + this.e + ")";
    }
}
