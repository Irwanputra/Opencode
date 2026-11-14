package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class di extends ads_mobile_sdk.cc3 {
    public final android.content.Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(android.content.Context context) {
        super(ads_mobile_sdk.wv0.CUI_NAME_SDKINIT_INIT_APP_PERMISSIONS, 2);
        context.getClass();
        this.d = context;
    }

    public final ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.APP_PERMISSIONS;
    }

    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.util.ArrayList arrayList;
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        android.content.Context context = this.d;
        context.getClass();
        java.lang.String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        if (strArr != null) {
            java.util.List listU0 = dev.epro.r0.O5378677881740157249.U0(strArr);
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listU0) {
                java.lang.String str = (java.lang.String) obj;
                dev.epro.r0.P5733283974459951585 p57332839744599515852 = ads_mobile_sdk.rw0.f;
                str.getClass();
                if (dev.epro.r0.P5733283974459951585.e(context, str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = dev.epro.r0.O2161699089510411363.a;
        }
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.ci(arrayList));
    }
}
