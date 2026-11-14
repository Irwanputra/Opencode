package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class a62 extends android.os.AsyncTask {
    public ads_mobile_sdk.r6 a;
    public final ads_mobile_sdk.ii b;

    public a62(ads_mobile_sdk.ii iiVar) {
        this.b = iiVar;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.String str) {
        ads_mobile_sdk.r6 r6Var = this.a;
        if (r6Var != null) {
            r6Var.c = null;
            ads_mobile_sdk.a62 a62Var = (ads_mobile_sdk.a62) ((java.util.ArrayDeque) r6Var.b).poll();
            r6Var.c = a62Var;
            if (a62Var != null) {
                a62Var.executeOnExecutor((java.util.concurrent.ThreadPoolExecutor) r6Var.a, new java.lang.Object[0]);
            }
        }
    }
}
