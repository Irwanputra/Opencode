package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class p01 {
    public static final java.util.regex.Pattern c;
    public static final java.util.regex.Pattern d;
    public static final java.util.regex.Pattern e;
    public static final java.util.regex.Pattern f;
    public final ads_mobile_sdk.jr0 a;
    public final java.lang.String b;

    static {
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
        patternCompile.getClass();
        c = patternCompile;
        java.util.regex.Pattern patternCompile2 = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
        patternCompile2.getClass();
        d = patternCompile2;
        java.util.regex.Pattern patternCompile3 = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>[.\\s]*<\\s*html[^>]*>", 2);
        patternCompile3.getClass();
        e = patternCompile3;
        java.util.regex.Pattern patternCompile4 = java.util.regex.Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>[.\\s]*<\\s*html[^>]*>[.\\s]*<\\s*head[^>]*>", 2);
        patternCompile4.getClass();
        f = patternCompile4;
    }

    public p01(ads_mobile_sdk.jr0 jr0Var, java.lang.String str) {
        jr0Var.getClass();
        str.getClass();
        this.a = jr0Var;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[PHI: r0
      0x0057: PHI (r0v4 java.lang.Integer) = (r0v3 java.lang.Integer), (r0v10 java.lang.Integer), (r0v17 java.lang.Integer) binds: [B:7:0x001e, B:13:0x003a, B:19:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r4, java.util.List r5) {
        /*
            r4.getClass()
            java.util.regex.Pattern r0 = ads_mobile_sdk.p01.f
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r0.getClass()
            boolean r1 = r0.find()
            r2 = 0
            if (r1 == 0) goto L1c
            int r0 = r0.end()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r1 = 0
            if (r0 == 0) goto L21
            goto L57
        L21:
            java.util.regex.Pattern r0 = ads_mobile_sdk.p01.e
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r0.getClass()
            boolean r3 = r0.find()
            if (r3 == 0) goto L39
            int r0 = r0.end()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 == 0) goto L3d
            goto L57
        L3d:
            java.util.regex.Pattern r0 = ads_mobile_sdk.p01.d
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r0.getClass()
            boolean r3 = r0.find()
            if (r3 == 0) goto L54
            int r0 = r0.end()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L54:
            if (r2 == 0) goto L5c
            r0 = r2
        L57:
            int r0 = r0.intValue()
            goto L6a
        L5c:
            java.util.regex.Pattern r0 = ads_mobile_sdk.p01.c
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.find()
            if (r0 == 0) goto L69
            return r4
        L69:
            r0 = r1
        L6a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = r4.substring(r1, r0)
            r2.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L77:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            goto L77
        L87:
            java.lang.String r4 = r4.substring(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p01.a(java.lang.String, java.util.List):java.lang.String");
    }

    public final java.lang.String a(ads_mobile_sdk.z1 z1Var) {
        ads_mobile_sdk.d00 d00Var;
        z1Var.getClass();
        ads_mobile_sdk.jr0 jr0Var = this.a;
        jr0Var.getClass();
        if (!((java.lang.Boolean) jr0Var.a("gads:omid_javascript_session_service:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue() || !z1Var.O) {
            return null;
        }
        ads_mobile_sdk.q82 q82Var = z1Var.S;
        if (!q82Var.c) {
            return null;
        }
        if (q82Var.a == 1) {
            d00Var = ads_mobile_sdk.d00.e;
        } else {
            d00Var = ads_mobile_sdk.d00.c;
        }
        return a("GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV", new dev.epro.r0.F14240031463097426304().g(dev.epro.r0.E4951175994894594588.v0(new dev.epro.r0.H9390398899829886498("creativeType", d00Var.a), new dev.epro.r0.H9390398899829886498("contentUrl", z1Var.x))));
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return dev.epro.r0.M8927913404651150384.D0("\n      <script>Object.defineProperty(window,'" + str + "',{get:function(){return " + str2 + "}});</script>\n    ").toString();
    }
}
