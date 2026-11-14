package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xb3 extends ads_mobile_sdk.cc3 {
    public final android.content.Context d;
    public final ads_mobile_sdk.di0 e;
    public final ads_mobile_sdk.jr0 f;
    public final ads_mobile_sdk.rw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb3(android.content.Context context, ads_mobile_sdk.di0 di0Var, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.rw0 rw0Var) {
        super(ads_mobile_sdk.wv0.CUI_NAME_SDKINIT_INIT_DEVICE_SIGNAL, 2);
        context.getClass();
        di0Var.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        this.d = context;
        this.e = di0Var;
        this.f = jr0Var;
        this.g = rw0Var;
    }

    public final ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.STATIC_DEVICE;
    }

    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        int i;
        boolean z2;
        java.lang.String str3 = android.os.Build.FINGERPRINT;
        ads_mobile_sdk.di0 di0Var = this.e;
        android.content.pm.PackageManager packageManager = di0Var.c.getPackageManager();
        packageManager.getClass();
        boolean z3 = packageManager.resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("geo:0,0?q=donuts")), 65536) != null;
        android.content.pm.PackageManager packageManager2 = di0Var.c.getPackageManager();
        packageManager2.getClass();
        boolean z4 = packageManager2.resolveActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://www.google.com")), 65536) != null;
        java.lang.String country = java.util.Locale.getDefault().getCountry();
        boolean zBooleanValue = ((java.lang.Boolean) di0Var.f.getValue()).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) di0Var.k.getValue()).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) di0Var.h.getValue()).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) di0Var.g.getValue()).booleanValue();
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        dev.epro.r0.G9506192477171422664 g9506192477171422664F = dev.epro.r0.K5751602218013079365.F();
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        localeList.getClass();
        int size = localeList.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.String language2 = localeList.get(i2).getLanguage();
            language2.getClass();
            g9506192477171422664F.add(language2);
        }
        dev.epro.r0.G9506192477171422664 g9506192477171422664V = dev.epro.r0.K5751602218013079365.v(g9506192477171422664F);
        java.lang.String str4 = (java.lang.String) di0Var.j.getValue();
        java.lang.String str5 = (java.lang.String) di0Var.i.getValue();
        long availableBytes = new android.os.StatFs(android.os.Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        boolean zBooleanValue5 = ((java.lang.Boolean) di0Var.m.getValue()).booleanValue();
        ads_mobile_sdk.jr0 jr0Var = this.f;
        jr0Var.getClass();
        boolean zBooleanValue6 = ((java.lang.Boolean) jr0Var.a("gads:add_system_default_locale", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue();
        android.content.Context context = this.d;
        if (zBooleanValue6) {
            this.g.getClass();
            ads_mobile_sdk.qw0 qw0VarA = ads_mobile_sdk.rw0.a(context);
            java.lang.String str6 = qw0VarA.b;
            str2 = qw0VarA.a;
            str = str6;
        } else {
            str = null;
            str2 = null;
        }
        java.lang.String str7 = android.os.Build.MODEL;
        int i3 = android.os.Build.VERSION.SDK_INT;
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        int identifier2 = context.getResources().getIdentifier("Theme.GoogleMobileAds", "style", context.getPackageName());
        if (identifier == 0 && identifier2 == 0) {
            z2 = false;
        } else {
            try {
                z = false;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                e = e;
                z = false;
            }
            try {
                i = context.getPackageManager().getActivityInfo(new android.content.ComponentName(context.getPackageName(), "com.google.android.libraries.ads.mobile.sdk.common.AdActivity"), 0).theme;
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                e = e2;
                ads_mobile_sdk.xv.c("Failed to fetch AdActivity theme: " + e, null);
            }
            z2 = (i == identifier || i == identifier2) ? true : z;
        }
        country.getClass();
        language.getClass();
        str7.getClass();
        str3.getClass();
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.wb3(z3, z4, country, str, zBooleanValue3, zBooleanValue4, language, g9506192477171422664V, str2, str4, availableBytes, zBooleanValue2, str5, zBooleanValue, i3, z2, zBooleanValue5));
    }
}
