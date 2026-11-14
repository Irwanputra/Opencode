package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ap3 implements android.app.AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ ads_mobile_sdk.bp3 a;

    public ap3(ads_mobile_sdk.bp3 bp3Var) {
        this.a = bp3Var;
    }

    public final void onOpActiveChanged(java.lang.String str, int i, java.lang.String str2, boolean z) {
        synchronized (this.a) {
            ads_mobile_sdk.bp3 bp3Var = this.a;
            dev.epro.r0.O16637889491137121389 o16637889491137121389 = bp3Var.a;
            try {
                if (z) {
                    o16637889491137121389.getClass();
                    bp3Var.d = java.lang.System.currentTimeMillis();
                    this.a.g = true;
                } else {
                    o16637889491137121389.getClass();
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    ads_mobile_sdk.bp3 bp3Var2 = this.a;
                    long j = bp3Var2.e;
                    if (j > 0 && jCurrentTimeMillis >= j) {
                        bp3Var2.f = jCurrentTimeMillis - j;
                    }
                    bp3Var2.g = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
