package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class gr implements dev.epro.r0.Y4798753258822141670 {
    public final android.content.Context a;

    public gr(android.content.Context context) {
        context.getClass();
        this.a = context;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        int i = android.os.Build.VERSION.SDK_INT;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (i >= 30) {
            ads_mobile_sdk.zi3.a(6, "CanOpenAppGmsgHandler not enabled on R+ devices.", null);
            return o9245300239821758723;
        }
        java.lang.String str = (java.lang.String) map.get("package_name");
        if (str == null || str.length() == 0) {
            ads_mobile_sdk.zi3.a(6, "Package name missing in canOpenApp GMSG.", null);
            return o9245300239821758723;
        }
        android.content.pm.PackageManager packageManager = this.a.getPackageManager();
        boolean z = (packageManager != null ? packageManager.getLaunchIntentForPackage(str) : null) != null;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        i16631908410500040363.r(str, java.lang.Boolean.valueOf(z));
        java.lang.Object objA = tx0Var.a(i16631908410500040363, "openableApp", r4833348786910499294);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : o9245300239821758723;
    }

    public final int b() {
        return 34;
    }
}
