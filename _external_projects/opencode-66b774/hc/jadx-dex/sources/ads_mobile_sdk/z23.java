package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class z23 {
    public final java.util.ArrayList a;
    public final ads_mobile_sdk.hv b;
    public final java.util.ArrayList c;
    public dev.epro.r0.I16631908410500040363 d;

    public z23(java.util.ArrayList arrayList, ads_mobile_sdk.hv hvVar, java.util.ArrayList arrayList2) {
        this.a = arrayList;
        this.b = hvVar;
        this.c = arrayList2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.z23)) {
            return false;
        }
        ads_mobile_sdk.z23 z23Var = (ads_mobile_sdk.z23) obj;
        return this.a.equals(z23Var.a) && this.b.equals(z23Var.b) && this.c.equals(z23Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "ServerResponse(adConfigurations=" + this.a + ", commonConfiguration=" + this.b + ", actions=" + this.c + ")";
    }
}
