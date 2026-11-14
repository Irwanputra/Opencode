package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class lt0 implements dev.epro.r0.I8344119817086563006, dev.epro.r0.Z5019126814379845930 {
    public final ads_mobile_sdk.rt0 a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.concurrent.LinkedBlockingQueue d;
    public final android.os.HandlerThread e;

    public lt0(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.b = str;
        this.c = str2;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        ads_mobile_sdk.rt0 rt0Var = new ads_mobile_sdk.rt0(9200000, context, handlerThread.getLooper(), this, this);
        this.a = rt0Var;
        this.d = new java.util.concurrent.LinkedBlockingQueue();
        rt0Var.checkAvailabilityAndConnect();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConnected() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lt0.onConnected():void");
    }

    public final void onConnectionFailed(dev.epro.r0.B6867906687934285025 b6867906687934285025) {
        try {
            java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.d;
            dev.epro.r0.V5431423861497278836 v5431423861497278836W = ads_mobile_sdk.pd.w();
            v5431423861497278836W.c(32768L);
            linkedBlockingQueue.put((ads_mobile_sdk.pd) v5431423861497278836W.a());
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.d;
            dev.epro.r0.V5431423861497278836 v5431423861497278836W = ads_mobile_sdk.pd.w();
            v5431423861497278836W.c(32768L);
            linkedBlockingQueue.put((ads_mobile_sdk.pd) v5431423861497278836W.a());
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
