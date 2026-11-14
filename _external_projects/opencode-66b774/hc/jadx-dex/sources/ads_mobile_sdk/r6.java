package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class r6 {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;

    public /* synthetic */ r6(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public void a(android.view.View view) {
        if (((dev.epro.r0.N831923027797546281) this.b) == null) {
            this.b = new dev.epro.r0.N831923027797546281();
            view.getViewTreeObserver().addOnWindowFocusChangeListener((dev.epro.r0.N831923027797546281) this.b);
            if (view.hasWindowFocus()) {
                ads_mobile_sdk.p72.a();
                ads_mobile_sdk.i6 i6Var = ads_mobile_sdk.i6.d;
                boolean zA = i6Var.a();
                if (i6Var.b != zA) {
                    i6Var.b = zA;
                    if (i6Var.a) {
                        i6Var.a(zA);
                        dev.epro.r0.Q16850748603044648552 q16850748603044648552 = i6Var.c;
                        if (q16850748603044648552 != null) {
                            q16850748603044648552.a(zA);
                        }
                    }
                }
            }
        }
    }

    public void a(ads_mobile_sdk.a62 a62Var) {
        a62Var.a = this;
        java.util.ArrayDeque arrayDeque = (java.util.ArrayDeque) this.b;
        arrayDeque.add(a62Var);
        if (((ads_mobile_sdk.a62) this.c) == null) {
            ads_mobile_sdk.a62 a62Var2 = (ads_mobile_sdk.a62) arrayDeque.poll();
            this.c = a62Var2;
            if (a62Var2 != null) {
                a62Var2.executeOnExecutor((java.util.concurrent.ThreadPoolExecutor) this.a, new java.lang.Object[0]);
            }
        }
    }
}
