package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A7086841046085192465 implements dev.epro.r0.Y4798753258822141670 {
    public final java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.util.Map map, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str = (java.lang.String) map.get("urls");
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (str == null || str.length() == 0) {
            ads_mobile_sdk.xv.c("URLs missing in canOpenURLs GMSG.", null);
            return o9245300239821758723;
        }
        java.util.List<java.lang.String> listP0 = dev.epro.r0.M8927913404651150384.p0(str, new java.lang.String[]{","}, 6);
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        android.content.pm.PackageManager packageManager = tx0Var.getContext().getPackageManager();
        for (java.lang.String str2 : listP0) {
            java.util.List listP02 = dev.epro.r0.M8927913404651150384.p0(str2, new java.lang.String[]{";"}, 2);
            boolean z = false;
            if (packageManager.resolveActivity(new android.content.Intent(listP02.size() > 1 ? dev.epro.r0.M8927913404651150384.D0((java.lang.String) listP02.get(1)).toString() : "android.intent.action.VIEW", android.net.Uri.parse(dev.epro.r0.M8927913404651150384.D0((java.lang.String) listP02.get(0)).toString())), 65536) != null) {
                z = true;
            }
            i16631908410500040363.r(str2, java.lang.Boolean.valueOf(z));
        }
        java.lang.String str3 = (java.lang.String) map.get("ad_mid");
        if (str3 != null && !dev.epro.r0.M8927913404651150384.Y(str3)) {
            i16631908410500040363.t("ad_mid", str3);
        }
        java.lang.Object objA = tx0Var.a(i16631908410500040363, "openableURLs", r4833348786910499294);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : o9245300239821758723;
    }

    public final int b() {
        return 22;
    }
}
