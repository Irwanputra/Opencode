package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tl2 {
    public static final ads_mobile_sdk.d62 c = new ads_mobile_sdk.d62();
    public static final android.content.Intent d = new android.content.Intent("com.google.android.play.core.prewarm.BIND_PREWARM_SERVICE").setPackage("com.android.vending");
    public final ads_mobile_sdk.k33 a;
    public final java.lang.String b;

    public tl2(android.content.Context context) {
        int i;
        boolean z;
        java.lang.String strEncodeToString;
        ads_mobile_sdk.d62 d62Var = ads_mobile_sdk.jf2.a;
        try {
            z = context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled;
            if (!z) {
                d62Var.getClass();
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            d62Var.getClass();
        }
        if (z) {
            try {
                android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || signatureArr.length == 0) {
                    d62Var.getClass();
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (android.content.pm.Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = android.util.Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (java.security.NoSuchAlgorithmException unused2) {
                            strEncodeToString = "";
                        }
                        arrayList.add(strEncodeToString);
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                            java.lang.String str = android.os.Build.TAGS;
                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                            }
                        }
                        this.a = new ads_mobile_sdk.k33(context.getApplicationContext(), c, d, new dev.epro.r0.W4415201450379021245());
                        break;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.util.Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((java.lang.CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            } else {
                                sb.append((java.lang.CharSequence) ", ");
                            }
                        }
                    }
                    d62Var.getClass();
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                d62Var.getClass();
            }
            this.a = null;
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }
}
