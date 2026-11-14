package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class di0 extends ads_mobile_sdk.c61 {
    public final android.content.Context c;
    public final ads_mobile_sdk.ci3 d;
    public final android.content.pm.PackageManager e;
    public final dev.epro.r0.O12494175665883759871 f;
    public final dev.epro.r0.O12494175665883759871 g;
    public final dev.epro.r0.O12494175665883759871 h;
    public final dev.epro.r0.O12494175665883759871 i;
    public final dev.epro.r0.O12494175665883759871 j;
    public final dev.epro.r0.O12494175665883759871 k;
    public final dev.epro.r0.O12494175665883759871 l;
    public final dev.epro.r0.O12494175665883759871 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(android.content.Context context, ads_mobile_sdk.ci3 ci3Var) {
        super(ads_mobile_sdk.wv0.CUI_NAME_DEVICE_PROPERTIES_INIT_TASK, 2);
        context.getClass();
        ci3Var.getClass();
        this.c = context;
        this.d = ci3Var;
        this.e = context.getPackageManager();
        this.f = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ai0(this, (byte) 4));
        this.g = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ai0(this, (byte) 0));
        this.h = new dev.epro.r0.O12494175665883759871(ads_mobile_sdk.yh0.a);
        this.i = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ai0(this, (byte) 2));
        this.j = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ai0(this, (byte) 1));
        this.k = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ai0(this, (byte) 5));
        this.l = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ai0(this, (byte) 3));
        this.m = new dev.epro.r0.O12494175665883759871(new ads_mobile_sdk.ai0(this, (byte) 6));
    }

    public final boolean a(android.content.Intent intent) {
        android.content.pm.PackageManager packageManager = this.c.getPackageManager();
        if (packageManager != null) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                java.util.List listG = dev.epro.r0.H6918874287707076857.g(packageManager, intent, dev.epro.r0.H6918874287707076857.d());
                listG.getClass();
                if (!listG.isEmpty()) {
                    return true;
                }
            } else {
                java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                listQueryIntentActivities.getClass();
                if (!listQueryIntentActivities.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (dev.epro.r0.S10823041268949770285.t(android.os.Environment.getExternalStorageState(), "mounted")) {
            return android.os.Build.VERSION.SDK_INT >= 30 || this.c.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        return false;
    }

    @Override // ads_mobile_sdk.c61
    public final java.lang.Object h(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        this.f.getValue();
        this.h.getValue();
        this.g.getValue();
        this.i.getValue();
        this.j.getValue();
        this.k.getValue();
        this.l.getValue();
        this.m.getValue();
        return new ads_mobile_sdk.xu0(dev.epro.r0.O9245300239821758723.a);
    }
}
