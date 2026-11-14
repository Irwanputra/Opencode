package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ww2 implements java.io.Closeable {
    public final byte[] a;

    public ww2(byte[] bArr) {
        this.a = bArr;
    }

    public static java.lang.String a(ads_mobile_sdk.ww2 ww2Var) {
        java.nio.charset.Charset charset = dev.epro.r0.F16059529287866721367.a;
        ww2Var.getClass();
        charset.getClass();
        return new java.lang.String(ww2Var.a, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
