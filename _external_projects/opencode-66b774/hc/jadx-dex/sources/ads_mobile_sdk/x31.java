package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class x31 implements dev.epro.r0.P190945702497543440 {
    public final java.util.concurrent.ExecutorService a;
    public final ads_mobile_sdk.vi3 b;

    public x31(java.util.concurrent.ExecutorService executorService, ads_mobile_sdk.vi3 vi3Var) {
        this.a = executorService;
        this.b = vi3Var;
    }

    public final dev.epro.r0.H8027516537527559298 a() {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_GET_STATIC_PROGRAM_METADATA;
        dev.epro.r0.L7743116545240101509 l7743116545240101509X = dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.S4524717722777659713((byte) 1), this.a);
        this.b.a(yk0Var, l7743116545240101509X);
        return l7743116545240101509X;
    }

    public final dev.epro.r0.H8027516537527559298 b() {
        return d();
    }

    public final dev.epro.r0.B6805403844224311194 c() {
        return dev.epro.r0.M9216324016624295870.J(java.lang.Boolean.TRUE);
    }

    public final dev.epro.r0.H8027516537527559298 d() {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_GET_STATIC_PROGRAM_BYTECODE;
        dev.epro.r0.L7743116545240101509 l7743116545240101509X = dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.S4524717722777659713((byte) 2), this.a);
        this.b.a(yk0Var, l7743116545240101509X);
        return l7743116545240101509X;
    }

    public final dev.epro.r0.D16915945238461757356 a(ads_mobile_sdk.rm2 rm2Var, byte[] bArr) {
        return dev.epro.r0.B6805403844224311194.b;
    }

    public final dev.epro.r0.D16915945238461757356 a(ads_mobile_sdk.rm2 rm2Var, byte[] bArr, byte[] bArr2) {
        return dev.epro.r0.B6805403844224311194.b;
    }
}
