package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class A394838204219683290 implements dev.epro.r0.R3171298526896875739 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ A394838204219683290(java.lang.Object obj, java.lang.Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final dev.epro.r0.D16915945238461757356 apply(java.lang.Object obj) {
        byte b = this.a;
        java.lang.Object obj2 = this.c;
        java.lang.Object obj3 = this.b;
        switch (b) {
            case 0:
                ads_mobile_sdk.qc3 qc3Var = (ads_mobile_sdk.qc3) obj3;
                ads_mobile_sdk.vi3 vi3Var = qc3Var.d;
                ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_METADATA;
                dev.epro.r0.H8027516537527559298 h8027516537527559298A = qc3Var.a.a((ads_mobile_sdk.rm2) obj2);
                vi3Var.a(yk0Var, (dev.epro.r0.L7743116545240101509) h8027516537527559298A);
                return h8027516537527559298A;
            case 1:
                ads_mobile_sdk.qc3 qc3Var2 = (ads_mobile_sdk.qc3) obj3;
                ads_mobile_sdk.vi3 vi3Var2 = qc3Var2.d;
                ads_mobile_sdk.yk0 yk0Var2 = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_STORAGE_UPDATE_METADATA;
                dev.epro.r0.H8027516537527559298 h8027516537527559298A2 = qc3Var2.a.a((ads_mobile_sdk.rm2) obj2);
                vi3Var2.a(yk0Var2, (dev.epro.r0.L7743116545240101509) h8027516537527559298A2);
                return h8027516537527559298A2;
            default:
                return ((dev.epro.r0.K17751841687800543607) ((ads_mobile_sdk.f7) obj3).b.f.get()).a((android.content.Context) obj2);
        }
    }
}
