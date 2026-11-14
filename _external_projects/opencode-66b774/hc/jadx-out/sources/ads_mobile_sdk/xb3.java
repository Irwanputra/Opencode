package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import dev.epro.r0.G9506192477171422664;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.R4833348786910499294;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class xb3 extends cc3 {
    public final Context d;
    public final di0 e;
    public final jr0 f;
    public final rw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb3(Context context, di0 di0Var, jr0 jr0Var, rw0 rw0Var) {
        super(wv0.CUI_NAME_SDKINIT_INIT_DEVICE_SIGNAL, 2);
        context.getClass();
        di0Var.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        this.d = context;
        this.e = di0Var;
        this.f = jr0Var;
        this.g = rw0Var;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* JADX INFO: renamed from: a */
    public final cw0 mo19a() {
        return cw0.STATIC_DEVICE;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        String str;
        String str2;
        boolean z;
        int i;
        boolean z2;
        String str3 = Build.FINGERPRINT;
        di0 di0Var = this.e;
        PackageManager packageManager = di0Var.c.getPackageManager();
        packageManager.getClass();
        boolean z3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536) != null;
        PackageManager packageManager2 = di0Var.c.getPackageManager();
        packageManager2.getClass();
        boolean z4 = packageManager2.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536) != null;
        String country = Locale.getDefault().getCountry();
        boolean zBooleanValue = ((Boolean) di0Var.f.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) di0Var.k.getValue()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) di0Var.h.getValue()).booleanValue();
        boolean zBooleanValue4 = ((Boolean) di0Var.g.getValue()).booleanValue();
        String language = Locale.getDefault().getLanguage();
        G9506192477171422664 g9506192477171422664F = K5751602218013079365.F();
        LocaleList localeList = LocaleList.getDefault();
        localeList.getClass();
        int size = localeList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String language2 = localeList.get(i2).getLanguage();
            language2.getClass();
            g9506192477171422664F.add(language2);
        }
        G9506192477171422664 g9506192477171422664V = K5751602218013079365.v(g9506192477171422664F);
        String str4 = (String) di0Var.j.getValue();
        String str5 = (String) di0Var.i.getValue();
        long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        boolean zBooleanValue5 = ((Boolean) di0Var.m.getValue()).booleanValue();
        jr0 jr0Var = this.f;
        jr0Var.getClass();
        boolean zBooleanValue6 = ((Boolean) jr0Var.a("gads:add_system_default_locale", Boolean.FALSE, ao.a$11)).booleanValue();
        Context context = this.d;
        if (zBooleanValue6) {
            this.g.getClass();
            qw0 qw0VarA = rw0.a(context);
            String str6 = qw0VarA.b;
            str2 = qw0VarA.a;
            str = str6;
        } else {
            str = null;
            str2 = null;
        }
        String str7 = Build.MODEL;
        int i3 = Build.VERSION.SDK_INT;
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        int identifier2 = context.getResources().getIdentifier("Theme.GoogleMobileAds", "style", context.getPackageName());
        if (identifier == 0 && identifier2 == 0) {
            z2 = false;
        } else {
            try {
                z = false;
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                z = false;
            }
            try {
                i = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.libraries.ads.mobile.sdk.common.AdActivity"), 0).theme;
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                xv.c("Failed to fetch AdActivity theme: " + e, null);
            }
            z2 = (i == identifier || i == identifier2) ? true : z;
        }
        country.getClass();
        language.getClass();
        str7.getClass();
        str3.getClass();
        return new xu0(new wb3(z3, z4, country, str, zBooleanValue3, zBooleanValue4, language, g9506192477171422664V, str2, str4, availableBytes, zBooleanValue2, str5, zBooleanValue, i3, z2, zBooleanValue5));
    }
}
