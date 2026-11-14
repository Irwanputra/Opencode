package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zf0 implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.String a;
    public final boolean b;

    public zf0(java.lang.String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        java.lang.String str = this.a;
        if (str.length() > 0) {
            p3477296814990354048.n0 = str;
        }
        if (this.b) {
            p3477296814990354048.o0 = "1";
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.zf0)) {
            return false;
        }
        ads_mobile_sdk.zf0 zf0Var = (ads_mobile_sdk.zf0) obj;
        return this.a.equals(zf0Var.a) && this.b == zf0Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final java.lang.String toString() {
        return "DebugSignal(creativePreviewToken=" + this.a + ", isTroubleshooting=" + this.b + ")";
    }
}
