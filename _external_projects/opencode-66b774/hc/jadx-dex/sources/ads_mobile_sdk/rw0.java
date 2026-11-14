package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class rw0 {
    public static final dev.epro.r0.P5733283974459951585 f = new dev.epro.r0.P5733283974459951585((byte) 11);
    public static final java.util.concurrent.atomic.AtomicReference g;
    public static final dev.epro.r0.H5336160545165318150 h;
    public static final dev.epro.r0.H5336160545165318150 i;
    public final android.content.Context a;
    public final ads_mobile_sdk.g0 b;
    public final ads_mobile_sdk.jr0 c;
    public final ads_mobile_sdk.l0 d;
    public final java.lang.Class e;

    static {
        dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{"/aclk", "/pcs/click", "/dbm/clk"});
        g = new java.util.concurrent.atomic.AtomicReference(null);
        h = new dev.epro.r0.H5336160545165318150("^(ca-app-pub-[0-9]{16})~([0-9]{10})$");
        i = new dev.epro.r0.H5336160545165318150("^(ca-app-pub-[a-zA-Z0-9\\-]+)/([a-zA-Z0-9_\\-]+)(/.*)?$");
    }

    public rw0(android.content.Context context, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.l0 l0Var, java.lang.Class cls) {
        context.getClass();
        g0Var.getClass();
        jr0Var.getClass();
        l0Var.getClass();
        cls.getClass();
        this.a = context;
        this.b = g0Var;
        this.c = jr0Var;
        this.d = l0Var;
        this.e = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ads_mobile_sdk.qw0 a(android.content.Context r3) {
        /*
            r3.getClass()
            ads_mobile_sdk.qw0 r0 = new ads_mobile_sdk.qw0
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getLanguage()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getCountry()
            r0.<init>(r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L31
            java.lang.Class r1 = dev.epro.r0.H6918874287707076857.f()
            java.lang.Object r3 = r3.getSystemService(r1)
            android.app.LocaleManager r3 = dev.epro.r0.H6918874287707076857.a(r3)
            if (r3 == 0) goto L42
            android.os.LocaleList r3 = dev.epro.r0.H6918874287707076857.m(r3)
            goto L43
        L31:
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L42
            android.content.res.Configuration r3 = r3.getConfiguration()
            if (r3 == 0) goto L42
            android.os.LocaleList r3 = r3.getLocales()
            goto L43
        L42:
            r3 = 0
        L43:
            if (r3 == 0) goto L5d
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L5d
            r0 = 0
            java.util.Locale r3 = r3.get(r0)
            ads_mobile_sdk.qw0 r0 = new ads_mobile_sdk.qw0
            java.lang.String r1 = r3.getLanguage()
            java.lang.String r3 = r3.getCountry()
            r0.<init>(r1, r3)
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rw0.a(android.content.Context):ads_mobile_sdk.qw0");
    }

    public final boolean b(android.net.Uri uri) {
        uri.getClass();
        java.lang.String host = uri.getHost();
        if (host != null) {
            ads_mobile_sdk.jr0 jr0Var = this.c;
            jr0Var.getClass();
            java.util.List list = (java.util.List) jr0Var.a("gads:google_ad_domain_suffixes", dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}), ads_mobile_sdk.ao.a$23);
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (dev.epro.r0.Z13168519540281190457.z(host, (java.lang.String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean c(android.net.Uri uri) {
        uri.getClass();
        if (!b(uri)) {
            return false;
        }
        java.lang.String string = uri.toString();
        ads_mobile_sdk.jr0 jr0Var = this.c;
        jr0Var.getClass();
        java.util.List<java.lang.String> list = (java.util.List) jr0Var.a("gads:impression_url_pattern_match", dev.epro.r0.K5751602218013079365.U("^[^?]*(/adview|/pcs/view).*"), ads_mobile_sdk.ao.a$23);
        if (list.isEmpty()) {
            return false;
        }
        for (java.lang.String str : list) {
            str.getClass();
            java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str);
            patternCompile.getClass();
            string.getClass();
            if (patternCompile.matcher(string).find()) {
                return true;
            }
        }
        return false;
    }

    public final java.util.Map d(android.net.Uri uri) {
        java.lang.String encodedQuery;
        ads_mobile_sdk.jr0 jr0Var = this.c;
        jr0Var.getClass();
        if (!((java.lang.Boolean) jr0Var.a("gads:uri_query_to_map:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            if (uri.isOpaque()) {
                return dev.epro.r0.X9852054718446117252.a;
            }
            java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
            queryParameterNames.getClass();
            dev.epro.r0.E4880248942576735123 e4880248942576735123 = new dev.epro.r0.E4880248942576735123(new dev.epro.r0.V11146580314972738611(queryParameterNames, (byte) 1), true, ads_mobile_sdk.ao.a$9);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            dev.epro.r0.M7968841747429118896 m7968841747429118896 = new dev.epro.r0.M7968841747429118896(e4880248942576735123);
            while (m7968841747429118896.hasNext()) {
                java.lang.Object next = m7968841747429118896.next();
                linkedHashMap.put(next, uri.getQueryParameter((java.lang.String) next));
            }
            return linkedHashMap;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int length = encodedQuery.length();
            int i2 = 0;
            while (true) {
                int iV = dev.epro.r0.M8927913404651150384.V(encodedQuery, '&', i2, 4);
                int i3 = iV != -1 ? iV : length;
                int iV2 = dev.epro.r0.M8927913404651150384.V(encodedQuery, '=', i2, 4);
                if (iV2 > i3 || iV2 == -1) {
                    iV2 = i3;
                }
                java.lang.String strDecode = android.net.Uri.decode(encodedQuery.substring(i2, iV2));
                java.lang.String strDecode2 = iV2 == i3 ? "" : android.net.Uri.decode(encodedQuery.substring(iV2 + 1, i3));
                strDecode.getClass();
                strDecode2.getClass();
                linkedHashMap2.put(strDecode, strDecode2);
                if (iV == -1) {
                    break;
                }
                i2 = iV + 1;
            }
        }
        return linkedHashMap2;
    }

    public final boolean c() {
        int i2 = android.os.Build.VERSION.SDK_INT;
        android.content.Context context = this.a;
        if (i2 >= 26) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return dev.epro.r0.M13159286552657112763.j(packageManager);
            }
            return false;
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public final android.content.Intent a(android.content.Context context, dev.epro.r0.H8032588520594078423 h8032588520594078423) {
        context.getClass();
        h8032588520594078423.getClass();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) this.e);
        android.os.Bundle bundle = new android.os.Bundle();
        ads_mobile_sdk.l0 l0Var = this.d;
        l0Var.getClass();
        int andIncrement = l0Var.c.getAndIncrement();
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = l0Var.a;
        dev.epro.r0.I3566570148522791385 i3566570148522791385 = new dev.epro.r0.I3566570148522791385(l0Var, andIncrement, (dev.epro.r0.R4833348786910499294) null, (byte) 1);
        w5797197595347441198.getClass();
        dev.epro.r0.X7175349259954592591 x7175349259954592591E = dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(i3566570148522791385, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        l0Var.d.put(java.lang.Integer.valueOf(andIncrement), new ads_mobile_sdk.j0(h8032588520594078423, x7175349259954592591E));
        bundle.putInt("ad_activity_delegate", andIncrement);
        intent.putExtra("ad_activity_delegate_bundle", bundle);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public final boolean a(android.net.Uri uri) {
        uri.getClass();
        if (!b(uri)) {
            return false;
        }
        java.lang.String string = uri.toString();
        ads_mobile_sdk.jr0 jr0Var = this.c;
        jr0Var.getClass();
        java.util.List<java.lang.String> list = (java.util.List) jr0Var.a("gads:click_url_pattern_match", dev.epro.r0.K5751602218013079365.U("^[^?]*(/aclk|/pcs/click|/dbm/clk).*"), ads_mobile_sdk.ao.a$23);
        if (list.isEmpty()) {
            return false;
        }
        for (java.lang.String str : list) {
            str.getClass();
            java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str);
            patternCompile.getClass();
            string.getClass();
            if (patternCompile.matcher(string).find()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        android.content.Context contextB = this.b.b();
        if (contextB == null) {
            contextB = this.a;
        }
        if (!(contextB instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        try {
            contextB.startActivity(intent);
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            ads_mobile_sdk.zi3.a(6, "Exception starting Activity: " + e, null);
            return false;
        }
    }
}
