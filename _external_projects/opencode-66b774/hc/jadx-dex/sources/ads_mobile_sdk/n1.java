package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class n1 implements dev.epro.r0.C8804068735739007381 {
    public static final ads_mobile_sdk.n1 a = new ads_mobile_sdk.n1();
    public static final ads_mobile_sdk.g1 b = ads_mobile_sdk.g1.q();

    @Override // dev.epro.r0.C8804068735739007381
    public final java.lang.Object getDefaultValue() {
        return b;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final java.lang.Object readFrom(java.io.FileInputStream fileInputStream) {
        ads_mobile_sdk.g1 g1VarA;
        java.util.WeakHashMap weakHashMap = ads_mobile_sdk.ji3.a;
        ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(ads_mobile_sdk.wv0.CUI_NAME_PERSISTENT_CACHE_METADATA_READ, dev.epro.r0.O2161699089510411363.a, true);
        try {
            try {
                g1VarA = ads_mobile_sdk.g1.a(fileInputStream);
            } catch (java.lang.Throwable th) {
                try {
                    th3VarA.b(th);
                    if (th instanceof dev.epro.r0.N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                        th3VarA.a(th);
                    }
                    if (th instanceof dev.epro.r0.P2480554073835519965) {
                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                    }
                    if (th instanceof java.util.concurrent.CancellationException) {
                        throw new ads_mobile_sdk.du0(th);
                    }
                    if (th instanceof ads_mobile_sdk.dv0) {
                        throw th;
                    }
                    throw new ads_mobile_sdk.iu0(th);
                } finally {
                }
            }
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(6, "Stored data has been corrupted: " + e, null);
            ads_mobile_sdk.xv.c("Stored data has been corrupted: " + e, null);
            g1VarA = b;
        }
        th3VarA.close();
        g1VarA.getClass();
        return g1VarA;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final void writeTo(java.lang.Object obj, dev.epro.r0.Z11123542482871484238 z11123542482871484238) {
        ((ads_mobile_sdk.g1) obj).a((java.io.OutputStream) z11123542482871484238);
    }
}
