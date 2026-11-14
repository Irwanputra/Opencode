package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E4057283238781867196 {
    public static final dev.epro.r0.W929662112881511578 a = new dev.epro.r0.W929662112881511578(0);
    public static java.util.Locale b;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            android.content.Context context2 = dev.epro.r0.G8478591149424363700.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return android.text.TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static java.lang.String b(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String strA = a(context);
        if (i == 1) {
            return resources.getString(2131820764, strA);
        }
        if (i == 2) {
            return dev.epro.r0.Y582199805280922215.G(context) ? resources.getString(2131820774) : resources.getString(2131820771, strA);
        }
        if (i == 3) {
            return resources.getString(2131820761, strA);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", strA);
        }
        if (i == 9) {
            return resources.getString(2131820769, strA);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(2131820773, strA);
            default:
                return resources.getString(2131820768, strA);
        }
    }

    public static java.lang.String c(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(2131820765);
            case 2:
                return resources.getString(2131820772);
            case 3:
                return resources.getString(2131820762);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                return e(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                return null;
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static java.lang.String d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(2131820768);
        }
        return java.lang.String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static java.lang.String e(android.content.Context context, java.lang.String str) {
        android.content.res.Resources resourcesForApplication;
        dev.epro.r0.W929662112881511578 w929662112881511578 = a;
        synchronized (w929662112881511578) {
            try {
                java.util.Locale localeB = new dev.epro.r0.J10695037395247619504(new dev.epro.r0.Z13811601408893342202(context.getResources().getConfiguration().getLocales())).b(0);
                if (!localeB.equals(b)) {
                    w929662112881511578.clear();
                    b = localeB;
                }
                java.lang.String str2 = (java.lang.String) w929662112881511578.get(str);
                if (str2 != null) {
                    return str2;
                }
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = dev.epro.r0.Y2177079631878275493.a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier != 0) {
                        java.lang.String string = resourcesForApplication.getString(identifier);
                        if (!android.text.TextUtils.isEmpty(string)) {
                            a.put(str, string);
                            return string;
                        }
                        if (str.length() != 0) {
                            "Got empty resource: ".concat(str);
                        }
                    } else if (str.length() != 0) {
                        "Missing resource: ".concat(str);
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
