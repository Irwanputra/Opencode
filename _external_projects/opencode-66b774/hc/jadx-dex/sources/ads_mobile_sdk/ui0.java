package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ui0 implements dev.epro.r0.Y5459655644324746057 {
    public final dev.epro.r0.A8094652504661216977 a;
    public final ads_mobile_sdk.vi3 b;
    public final dev.epro.r0.O16637889491137121389 c;
    public final long d;

    public ui0(dev.epro.r0.A8094652504661216977 a8094652504661216977, ads_mobile_sdk.vi3 vi3Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, long j) {
        this.a = a8094652504661216977;
        this.b = vi3Var;
        this.c = o16637889491137121389;
        this.d = j;
    }

    public final boolean a(ads_mobile_sdk.rm2 rm2Var) {
        ads_mobile_sdk.vi3 vi3Var = this.b;
        if (rm2Var == null || rm2Var.equals(ads_mobile_sdk.rm2.q())) {
            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_VALIDATOR_UPDATE_METADATA_NOT_FOUND);
            return true;
        }
        if (rm2Var.p() != this.a.get()) {
            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_VALIDATOR_UPDATE_METADATA_ARCH_MISMATCH);
            return true;
        }
        long jQ = rm2Var.r().q() * 1000;
        this.c.getClass();
        boolean z = jQ - java.lang.System.currentTimeMillis() <= this.d;
        if (z) {
            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_VALIDATOR_UPDATE_PROGRAM_ALMOST_EXPIRED);
        }
        return z;
    }

    public final boolean b(ads_mobile_sdk.rm2 rm2Var) {
        ads_mobile_sdk.vi3 vi3Var = this.b;
        if (rm2Var == null || rm2Var.equals(ads_mobile_sdk.rm2.q())) {
            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_VALIDATOR_INIT_METADATA_NOT_FOUND);
            return false;
        }
        if (rm2Var.p() == this.a.get()) {
            return true;
        }
        vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_VALIDATOR_INIT_METADATA_ARCH_MISMATCH);
        return false;
    }
}
