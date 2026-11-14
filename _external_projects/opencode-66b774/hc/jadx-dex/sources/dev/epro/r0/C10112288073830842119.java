package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class C10112288073830842119 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ C10112288073830842119(java.lang.Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                ads_mobile_sdk.rf0 rf0Var = (ads_mobile_sdk.rf0) obj;
                rf0Var.getClass();
                rf0Var.k.set(false);
                return;
            case 1:
                ads_mobile_sdk.rf0 rf0Var2 = (ads_mobile_sdk.rf0) obj;
                rf0Var2.getClass();
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = rf0Var2.b;
                ads_mobile_sdk.df0 df0Var = new ads_mobile_sdk.df0(rf0Var2, null, (byte) 1);
                w5797197595347441198.getClass();
                dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(df0Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                return;
            case 2:
                ads_mobile_sdk.rf0 rf0Var3 = (ads_mobile_sdk.rf0) obj;
                ads_mobile_sdk.rw0 rw0Var = rf0Var3.g;
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", ads_mobile_sdk.rf0.q);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                java.lang.String str = rf0Var3.p;
                if (str == null) {
                    dev.epro.r0.S10823041268949770285.b0("packageName");
                    throw null;
                }
                bundle.putString("com.android.browser.application_id", str);
                intent.putExtras(bundle);
                rw0Var.a(intent);
                return;
            case 3:
                ads_mobile_sdk.rf0 rf0Var4 = (ads_mobile_sdk.rf0) obj;
                rf0Var4.getClass();
                rf0Var4.k.set(false);
                return;
            default:
                ((java.util.concurrent.atomic.AtomicInteger) obj).set(i);
                return;
        }
    }
}
