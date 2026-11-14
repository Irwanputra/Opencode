package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ei1 implements dev.epro.r0.Y4798753258822141670 {
    public final ads_mobile_sdk.et0 a;

    public ei1(ads_mobile_sdk.et0 et0Var) {
        et0Var.getClass();
        this.a = et0Var;
    }

    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.T17336508261397230716 t17336508261397230716;
        android.view.Window window;
        java.lang.Integer numG;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        java.lang.String str = (java.lang.String) map.get("blurRadius");
        int iIntValue = (str == null || (numG = dev.epro.r0.Z13168519540281190457.G(10, str)) == null) ? 0 : numG.intValue();
        ads_mobile_sdk.et0 et0Var = this.a;
        android.widget.RelativeLayout relativeLayout = et0Var.p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(zEquals ? 0 : -16777216);
        }
        et0Var.v = zEquals;
        et0Var.z = iIntValue;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            ads_mobile_sdk.jr0 jr0Var = et0Var.e;
            jr0Var.getClass();
            if (((java.lang.Boolean) jr0Var.a("gads:enable_blur_transparent_background", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue() && (t17336508261397230716 = et0Var.l) != null && (window = t17336508261397230716.getWindow()) != null) {
                dev.epro.r0.R10617406068291706632.s(window, iIntValue);
            }
        }
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final int b() {
        return 15;
    }
}
