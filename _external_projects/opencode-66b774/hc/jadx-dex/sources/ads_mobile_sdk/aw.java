package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class aw {
    public static final long j;
    public static final /* synthetic */ int k = 0;
    public final ads_mobile_sdk.b41 a;
    public final ads_mobile_sdk.ii b;
    public final dev.epro.r0.F7878618420024429111 c;
    public final dev.epro.r0.F7878618420024429111 d;
    public final ads_mobile_sdk.ii e;
    public final dev.epro.r0.F7878618420024429111 f;
    public final ads_mobile_sdk.ii g;
    public final dev.epro.r0.F7878618420024429111 h;
    public final dev.epro.r0.F7878618420024429111 i;

    static {
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        j = dev.epro.r0.M9216324016624295870.Z(10, dev.epro.r0.N13798149404328803870.e);
    }

    public aw(ads_mobile_sdk.b41 b41Var) {
        b41Var.getClass();
        this.a = b41Var;
        int iMax = java.lang.Math.max(2, java.lang.Math.min(10, java.lang.Runtime.getRuntime().availableProcessors()));
        long j2 = j;
        ads_mobile_sdk.ii iiVarA = ads_mobile_sdk.xv.a("BG", iMax, j2);
        this.b = iiVarA;
        dev.epro.r0.F7878618420024429111 f7878618420024429111 = new dev.epro.r0.F7878618420024429111((java.util.concurrent.ThreadPoolExecutor) iiVarA.a);
        this.c = f7878618420024429111;
        this.d = f7878618420024429111;
        ads_mobile_sdk.ii iiVarA2 = ads_mobile_sdk.xv.a("Load", java.lang.Math.max(2, java.lang.Math.min(5, java.lang.Runtime.getRuntime().availableProcessors())), j2);
        this.e = iiVarA2;
        this.f = new dev.epro.r0.F7878618420024429111((java.util.concurrent.ThreadPoolExecutor) iiVarA2.a);
        ads_mobile_sdk.ii iiVarA3 = ads_mobile_sdk.xv.a("WebViewInit", java.lang.Math.max(2, java.lang.Math.min(5, java.lang.Runtime.getRuntime().availableProcessors())), j2);
        this.g = iiVarA3;
        dev.epro.r0.F7878618420024429111 f78786184200244291112 = new dev.epro.r0.F7878618420024429111((java.util.concurrent.ThreadPoolExecutor) iiVarA3.a);
        this.h = f78786184200244291112;
        this.i = f78786184200244291112;
    }
}
