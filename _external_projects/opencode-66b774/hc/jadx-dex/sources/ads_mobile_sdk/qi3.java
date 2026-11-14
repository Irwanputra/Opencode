package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qi3 {
    public final java.util.UUID a;
    public final ads_mobile_sdk.cc2[] b;

    public qi3(java.util.UUID uuid, ads_mobile_sdk.cc2[] cc2VarArr) {
        cc2VarArr.getClass();
        this.a = uuid;
        this.b = cc2VarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.qi3)) {
            return false;
        }
        ads_mobile_sdk.qi3 qi3Var = (ads_mobile_sdk.qi3) obj;
        return this.a.equals(qi3Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, qi3Var.b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "TraceSnapshot(rootTraceId=" + this.a + ", perTraceMeta=" + java.util.Arrays.toString(this.b) + ")";
    }
}
