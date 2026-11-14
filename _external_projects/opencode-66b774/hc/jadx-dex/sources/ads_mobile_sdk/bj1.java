package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bj1 extends java.util.TimerTask {
    public final /* synthetic */ dev.epro.r0.V7496420559085948492 a;
    public final /* synthetic */ java.util.Timer b;
    public final /* synthetic */ ads_mobile_sdk.dj1 c;

    public bj1(ads_mobile_sdk.dj1 dj1Var, dev.epro.r0.V7496420559085948492 v7496420559085948492, java.util.Timer timer) {
        this.c = dj1Var;
        this.a = v7496420559085948492;
        this.b = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ads_mobile_sdk.ii iiVar = this.c.g;
        androidx.webkit.WebViewCompat.removeWebMessageListener((android.webkit.WebView) iiVar.a, ((dev.epro.r0.A6650193808056408155) iiVar.b).a());
        ads_mobile_sdk.w62 w62Var = this.a.a;
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = w62Var.c;
        dev.epro.r0.N4024785987441166868 n4024785987441166868 = new dev.epro.r0.N4024785987441166868(w62Var, (dev.epro.r0.R4833348786910499294) null, (byte) 17);
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(n4024785987441166868, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        this.b.cancel();
    }
}
