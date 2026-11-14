package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class p72 implements dev.epro.r0.Q16850748603044648552 {
    public static ads_mobile_sdk.p72 f;
    public float a;
    public ads_mobile_sdk.si0 d;
    public ads_mobile_sdk.n6 e;

    public final void a(boolean z) {
        if (!z) {
            ads_mobile_sdk.tj3.g.getClass();
            android.os.Handler handler = ads_mobile_sdk.tj3.i;
            if (handler != null) {
                handler.removeCallbacks(ads_mobile_sdk.tj3.k);
                ads_mobile_sdk.tj3.i = null;
                return;
            }
            return;
        }
        ads_mobile_sdk.tj3.g.getClass();
        if (ads_mobile_sdk.tj3.i == null) {
            android.os.Handler handler2 = new android.os.Handler(android.os.Looper.getMainLooper());
            ads_mobile_sdk.tj3.i = handler2;
            handler2.post(ads_mobile_sdk.tj3.j);
            ads_mobile_sdk.tj3.i.postDelayed(ads_mobile_sdk.tj3.k, 200L);
        }
    }

    public static ads_mobile_sdk.p72 a() {
        ads_mobile_sdk.p72 p72Var = f;
        if (p72Var != null) {
            return p72Var;
        }
        new dev.epro.r0.P5733283974459951585((byte) 10);
        new dev.epro.r0.P5733283974459951585((byte) 13);
        ads_mobile_sdk.p72 p72Var2 = new ads_mobile_sdk.p72();
        p72Var2.a = 0.0f;
        f = p72Var2;
        return p72Var2;
    }
}
