package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qj3 implements java.lang.Runnable {
    public final java.lang.Object a;
    public final /* synthetic */ byte b;

    public qj3(ads_mobile_sdk.xu1 xu1Var) {
        this.b = (byte) 2;
        this.a = xu1Var.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        byte b = this.b;
        java.lang.Object obj = this.a;
        switch (b) {
            case 0:
                ads_mobile_sdk.ii iiVar = ((ads_mobile_sdk.tj3) obj).e;
                ((ads_mobile_sdk.r6) iiVar.b).a((ads_mobile_sdk.a62) new dev.epro.r0.I6819901599980491061(iiVar));
                break;
            case 1:
                ads_mobile_sdk.si0 si0Var = (ads_mobile_sdk.si0) obj;
                int streamVolume = si0Var.c.getStreamVolume(3);
                int streamMaxVolume = si0Var.c.getStreamMaxVolume(3);
                if (streamMaxVolume <= 0 || streamVolume <= 0) {
                    f = 0.0f;
                } else {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                si0Var.g.set(false);
                if (((java.lang.Float) si0Var.f.getAndSet(java.lang.Float.valueOf(f))).floatValue() != f) {
                    si0Var.a.post(new ads_mobile_sdk.qi0(this, f));
                }
                break;
            case 2:
                ((android.webkit.WebView) obj).destroy();
                break;
            default:
                try {
                    android.webkit.WebSettings.getDefaultUserAgent((android.content.Context) obj);
                } catch (java.lang.Throwable unused) {
                    return;
                }
                break;
        }
    }

    public /* synthetic */ qj3(java.lang.Object obj, byte b) {
        this.b = b;
        this.a = obj;
    }
}
