package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class B2395259063971314741 implements java.lang.Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ads_mobile_sdk.ot0 b;
    public final /* synthetic */ dev.epro.r0.S15368342082797059271 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ B2395259063971314741(ads_mobile_sdk.ot0 ot0Var, dev.epro.r0.S15368342082797059271 s15368342082797059271, int i, long j, byte b) {
        this.a = b;
        this.b = ot0Var;
        this.c = s15368342082797059271;
        this.d = i;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ads_mobile_sdk.pd pdVar;
        switch (this.a) {
            case 0:
                ads_mobile_sdk.ot0 ot0Var = this.b;
                ot0Var.c.execute(new dev.epro.r0.B2395259063971314741(ot0Var, this.c, this.d, this.e, (byte) 1));
                break;
            default:
                dev.epro.r0.S15368342082797059271 s15368342082797059271 = this.c;
                ads_mobile_sdk.ot0 ot0Var2 = this.b;
                android.content.Context context = ot0Var2.a;
                try {
                    try {
                        pdVar = (ads_mobile_sdk.pd) new ads_mobile_sdk.lt0(context, context.getPackageName(), java.lang.Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode)).d.poll(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                    } catch (java.lang.InterruptedException unused) {
                        pdVar = null;
                    }
                    if (pdVar == null) {
                        dev.epro.r0.V5431423861497278836 v5431423861497278836W = ads_mobile_sdk.pd.w();
                        v5431423861497278836W.c(32768L);
                        pdVar = (ads_mobile_sdk.pd) v5431423861497278836W.a();
                    }
                    if (!pdVar.u() || pdVar.q() != 32768) {
                        s15368342082797059271.k(pdVar);
                    }
                    break;
                } catch (java.lang.Throwable unused2) {
                }
                int i = this.d;
                if (i >= 3) {
                    s15368342082797059271.k((java.lang.Object) null);
                } else {
                    long j = i == 1 ? 100L : 2 * this.e;
                    dev.epro.r0.B2395259063971314741 b2395259063971314741 = new dev.epro.r0.B2395259063971314741(ot0Var2, s15368342082797059271, i + 1, j, (byte) 0);
                    if (j <= 0) {
                        b2395259063971314741.run();
                    } else {
                        ot0Var2.g.a(b2395259063971314741, j);
                    }
                }
                break;
        }
    }
}
