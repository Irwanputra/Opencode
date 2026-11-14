package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class v43 implements dev.epro.r0.C8804068735739007381 {
    public static final ads_mobile_sdk.v43 a = new ads_mobile_sdk.v43();
    public static final ads_mobile_sdk.k43 b = ads_mobile_sdk.k43.o();

    @Override // dev.epro.r0.C8804068735739007381
    public final java.lang.Object getDefaultValue() {
        return b;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final java.lang.Object readFrom(java.io.FileInputStream fileInputStream) {
        try {
            return ads_mobile_sdk.k43.a(fileInputStream);
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.xv.c("Stored shared settings data has been corrupted: " + e, null);
            ads_mobile_sdk.k43 k43Var = b;
            k43Var.getClass();
            return k43Var;
        }
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final void writeTo(java.lang.Object obj, dev.epro.r0.Z11123542482871484238 z11123542482871484238) {
        ((ads_mobile_sdk.k43) obj).a((java.io.OutputStream) z11123542482871484238);
    }
}
