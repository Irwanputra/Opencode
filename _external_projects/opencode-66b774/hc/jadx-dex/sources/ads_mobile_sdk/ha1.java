package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ha1 implements dev.epro.r0.C8804068735739007381 {
    public static final ads_mobile_sdk.ha1 a = new ads_mobile_sdk.ha1();
    public static final ads_mobile_sdk.ba1 b = ads_mobile_sdk.ba1.p();

    @Override // dev.epro.r0.C8804068735739007381
    public final java.lang.Object getDefaultValue() {
        return b;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final java.lang.Object readFrom(java.io.FileInputStream fileInputStream) {
        try {
            return ads_mobile_sdk.ba1.a(fileInputStream);
        } catch (java.lang.Exception unused) {
            ads_mobile_sdk.xv.c("Stored data has been corrupted", null);
            ads_mobile_sdk.ba1 ba1Var = b;
            ba1Var.getClass();
            return ba1Var;
        }
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final void writeTo(java.lang.Object obj, dev.epro.r0.Z11123542482871484238 z11123542482871484238) {
        ((ads_mobile_sdk.ba1) obj).a((java.io.OutputStream) z11123542482871484238);
    }
}
