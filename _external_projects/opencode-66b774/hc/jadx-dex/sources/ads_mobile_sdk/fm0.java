package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class fm0 {
    public final java.io.File a;
    public final java.util.concurrent.ExecutorService b;
    public final dev.epro.r0.T10029384717875810847 c;
    public final dev.epro.r0.W6764693637816104089 d;

    public fm0(java.io.File file, java.util.concurrent.ExecutorService executorService, dev.epro.r0.T10029384717875810847 t10029384717875810847, dev.epro.r0.W6764693637816104089 w6764693637816104089) {
        this.a = file;
        this.b = executorService;
        this.c = t10029384717875810847;
        this.d = w6764693637816104089;
    }

    public final dev.epro.r0.H8027516537527559298 a(java.lang.Object obj) {
        return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.E9507284769322407406(this, obj, (byte) 2), this.b);
    }
}
