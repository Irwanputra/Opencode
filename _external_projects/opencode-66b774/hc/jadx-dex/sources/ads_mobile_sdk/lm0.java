package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class lm0 implements dev.epro.r0.N1486767233833082383 {
    public final android.content.Context a;
    public final ads_mobile_sdk.mm0 b;

    public lm0(android.content.Context context) {
        if (context == null) {
            dev.epro.r0.S10973172697741180971.j("Application context cannot be null");
            throw null;
        }
        this.a = context;
        this.b = ads_mobile_sdk.mm0.a(context);
    }

    public final void a(ads_mobile_sdk.c7 c7Var) {
        boolean zHasSystemFeature;
        boolean zBooleanValue;
        java.util.Map map;
        ads_mobile_sdk.mm0 mm0Var = this.b;
        if (mm0Var.b != null) {
            zBooleanValue = mm0Var.b.booleanValue();
        } else {
            synchronized (mm0Var) {
                try {
                    if (mm0Var.b != null) {
                        zHasSystemFeature = mm0Var.b.booleanValue();
                    } else {
                        if (!mm0Var.a()) {
                            mm0Var.b = java.lang.Boolean.FALSE;
                            return;
                        }
                        try {
                            android.content.pm.PackageManager packageManager = mm0Var.c.getPackageManager();
                            if (packageManager == null) {
                                mm0Var.b = java.lang.Boolean.FALSE;
                                return;
                            } else {
                                zHasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                mm0Var.b = java.lang.Boolean.valueOf(zHasSystemFeature);
                            }
                        } catch (java.lang.SecurityException unused) {
                            mm0Var.b = java.lang.Boolean.FALSE;
                            return;
                        } catch (java.lang.Exception unused2) {
                            mm0Var.b = java.lang.Boolean.FALSE;
                            return;
                        }
                    }
                    zBooleanValue = zHasSystemFeature;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        if (zBooleanValue && (map = (java.util.Map) c7Var.a) != null) {
            java.lang.String str = (java.lang.String) map.get("verifierurl");
            java.lang.String str2 = (java.lang.String) ((java.util.Map) c7Var.a).get("version");
            if (str2 == null || str2.trim().isEmpty()) {
                str2 = "1.0";
            }
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            try {
                new java.net.URL(str);
                if (!str.startsWith("https://")) {
                    if (!str.startsWith("http://")) {
                        return;
                    }
                }
                if (this.a == null) {
                    return;
                }
                com.amazon.privacypass.PrivacyPass.getInstance(this.a).attest(new com.amazon.privacypass.VerificationContext(java.util.Collections.singletonList(str)), (com.amazon.privacypass.callback.AttestAPICallback) null, str2);
            } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException | java.lang.Exception unused3) {
            }
        }
    }
}
