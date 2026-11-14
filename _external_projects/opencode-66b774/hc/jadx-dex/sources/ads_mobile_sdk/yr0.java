package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class yr0 {
    public final java.util.ArrayList a = new java.util.ArrayList();

    static {
        java.util.regex.Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public final void a(android.view.View view, ads_mobile_sdk.xr0 xr0Var) {
        ads_mobile_sdk.wr0 wr0Var;
        if (view == null) {
            dev.epro.r0.S10973172697741180971.j("FriendlyObstruction is null");
            return;
        }
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                wr0Var = null;
                break;
            }
            java.lang.Object obj = arrayList.get(i);
            i++;
            wr0Var = (ads_mobile_sdk.wr0) obj;
            if (wr0Var.a.get() == view) {
                break;
            }
        }
        if (wr0Var == null) {
            arrayList.add(new ads_mobile_sdk.wr0(view, xr0Var));
        }
    }
}
