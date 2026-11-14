package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mz2 extends dev.epro.r0.U1864172318023436692 {
    public final ads_mobile_sdk.oz2 a;
    public ads_mobile_sdk.jq b;

    public mz2(ads_mobile_sdk.pz2 pz2Var) {
        super((byte) 2);
        ads_mobile_sdk.oz2 oz2Var = new ads_mobile_sdk.oz2(pz2Var);
        this.a = oz2Var;
        this.b = oz2Var.hasNext() ? new ads_mobile_sdk.jq(oz2Var.next()) : null;
    }

    public final byte a() {
        ads_mobile_sdk.jq jqVar = this.b;
        if (jqVar == null) {
            dev.epro.r0.Z3383101362411723454.u();
            return (byte) 0;
        }
        byte bA = jqVar.a();
        if (!this.b.hasNext()) {
            ads_mobile_sdk.oz2 oz2Var = this.a;
            this.b = oz2Var.hasNext() ? new ads_mobile_sdk.jq(oz2Var.next()) : null;
        }
        return bA;
    }

    public final boolean hasNext() {
        return this.b != null;
    }
}
