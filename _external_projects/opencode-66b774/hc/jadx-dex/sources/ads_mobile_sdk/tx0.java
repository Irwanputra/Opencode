package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tx0 extends android.webkit.WebView {
    public final dev.epro.r0.G8001132634698687269 a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final dev.epro.r0.W5797197595347441198 c;
    public final ads_mobile_sdk.x60 d;
    public final ads_mobile_sdk.ci3 e;
    public final ads_mobile_sdk.k8 f;
    public final ads_mobile_sdk.op3 g;
    public final ads_mobile_sdk.p01 h;
    public final ads_mobile_sdk.jr0 i;
    public final ads_mobile_sdk.xj j;
    public final java.util.concurrent.atomic.AtomicBoolean k;
    public final java.util.concurrent.atomic.AtomicBoolean l;
    public final java.util.concurrent.atomic.AtomicBoolean m;
    public final java.util.concurrent.atomic.AtomicBoolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ads_mobile_sdk.et0 f113o;
    public volatile dev.epro.r0.G16864365537574524285 p;
    public ads_mobile_sdk.sy0 q;
    public ads_mobile_sdk.fs3 r;
    public int s;
    public dev.epro.r0.L4980660535418402690 t;
    public final ads_mobile_sdk.kh3 u;
    public ads_mobile_sdk.kh3 v;
    public final android.util.DisplayMetrics w;
    public dev.epro.r0.C9731525580007922156 x;
    public ads_mobile_sdk.iy0 y;
    public final java.util.concurrent.ConcurrentLinkedQueue z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx0(dev.epro.r0.G8001132634698687269 g8001132634698687269, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.W5797197595347441198 w57971975953474411982, ads_mobile_sdk.x60 x60Var, ads_mobile_sdk.ci3 ci3Var, ads_mobile_sdk.k8 k8Var, android.content.Context context, java.lang.String str, ads_mobile_sdk.fs3 fs3Var, ads_mobile_sdk.op3 op3Var, ads_mobile_sdk.p01 p01Var, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.xj xjVar) {
        super(context);
        g8001132634698687269.getClass();
        w5797197595347441198.getClass();
        w57971975953474411982.getClass();
        ci3Var.getClass();
        k8Var.getClass();
        context.getClass();
        str.getClass();
        fs3Var.getClass();
        op3Var.getClass();
        p01Var.getClass();
        jr0Var.getClass();
        xjVar.getClass();
        this.a = g8001132634698687269;
        this.b = w5797197595347441198;
        this.c = w57971975953474411982;
        this.d = x60Var;
        this.e = ci3Var;
        this.f = k8Var;
        this.g = op3Var;
        this.h = p01Var;
        this.i = jr0Var;
        this.j = xjVar;
        this.k = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.l = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.n = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.r = fs3Var;
        this.s = -1;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        this.u = (ads_mobile_sdk.kh3) dev.epro.r0.J8045362843799184672.r0(dev.epro.r0.I3826119971291161142.a, new ads_mobile_sdk.bx0(this, r4833348786910499294, (byte) 7));
        this.w = dev.epro.r0.E10717724117948616506.d(context);
        this.z = new java.util.concurrent.ConcurrentLinkedQueue();
        dev.epro.r0.J8045362843799184672.s0(new ads_mobile_sdk.bx0(this, r4833348786910499294, (byte) 8));
        android.webkit.WebSettings settings = getSettings();
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setMixedContentMode(2);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(100);
        settings.setSupportMultipleWindows(true);
        settings.setSupportZoom(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUserAgentString(str);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        if (((java.lang.Boolean) jr0Var.a("gads:clear_webview_cache:enabled", bool, aoVar)).booleanValue()) {
            clearCache(true);
        }
        setWillNotDraw(false);
        setLayerType(0, null);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        setBackgroundColor(0);
        if (((java.lang.Boolean) jr0Var.a("gads:webview_sound_effects:disabled", java.lang.Boolean.TRUE, aoVar)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01fd, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r4, r5, r7) == r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018b, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r4, r5, r7) == r15) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171 A[Catch: Exception -> 0x0191, all -> 0x0193, PHI: r0 r1 r2 r3
      0x0171: PHI (r0v41 java.lang.Object) = (r0v33 java.lang.Object), (r0v1 java.lang.Object) binds: [B:62:0x016d, B:27:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r1v21 ads_mobile_sdk.tx0) = (r1v12 ads_mobile_sdk.tx0), (r1v34 ads_mobile_sdk.tx0) binds: [B:62:0x016d, B:27:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r2v25 java.io.Closeable) = (r2v20 java.io.Closeable), (r2v33 java.io.Closeable) binds: [B:62:0x016d, B:27:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r3v16 java.io.Closeable) = (r3v11 java.io.Closeable), (r3v23 java.io.Closeable) binds: [B:62:0x016d, B:27:0x0075] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {Exception -> 0x0191, blocks: (B:64:0x0171, B:61:0x015f), top: B:141:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177 A[Catch: all -> 0x0200, TRY_LEAVE, TryCatch #0 {all -> 0x0200, blocks: (B:19:0x0047, B:105:0x0205, B:23:0x0061, B:92:0x01d4, B:94:0x01d8, B:65:0x0173, B:67:0x0177, B:97:0x01e3, B:99:0x01e7, B:86:0x01b7, B:88:0x01bb), top: B:136:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:19:0x0047, B:105:0x0205, B:23:0x0061, B:92:0x01d4, B:94:0x01d8, B:65:0x0173, B:67:0x0177, B:97:0x01e3, B:99:0x01e7, B:86:0x01b7, B:88:0x01bb), top: B:136:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d8 A[Catch: all -> 0x0200, TRY_LEAVE, TryCatch #0 {all -> 0x0200, blocks: (B:19:0x0047, B:105:0x0205, B:23:0x0061, B:92:0x01d4, B:94:0x01d8, B:65:0x0173, B:67:0x0177, B:97:0x01e3, B:99:0x01e7, B:86:0x01b7, B:88:0x01bb), top: B:136:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e7 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:19:0x0047, B:105:0x0205, B:23:0x0061, B:92:0x01d4, B:94:0x01d8, B:65:0x0173, B:67:0x0177, B:97:0x01e3, B:99:0x01e7, B:86:0x01b7, B:88:0x01bb), top: B:136:0x002b }] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, dev.epro.r0.K14749510448791472029 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tx0.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r4, r7, r2) == r11) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0169, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r0, r4, r2) == r11) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019b, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r0, r7, r2) == r11) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b0 A[Catch: all -> 0x01bc, TryCatch #12 {all -> 0x01bc, blocks: (B:102:0x01a9, B:104:0x01b0, B:106:0x01b4, B:108:0x01b8, B:111:0x01bf, B:113:0x01c3, B:115:0x01c7, B:117:0x01cb, B:118:0x01cc, B:119:0x01d1, B:120:0x01d2, B:121:0x01d9, B:122:0x01da, B:123:0x01e1, B:124:0x01e2), top: B:138:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e2 A[Catch: all -> 0x01bc, TRY_LEAVE, TryCatch #12 {all -> 0x01bc, blocks: (B:102:0x01a9, B:104:0x01b0, B:106:0x01b4, B:108:0x01b8, B:111:0x01bf, B:113:0x01c3, B:115:0x01c7, B:117:0x01cb, B:118:0x01cc, B:119:0x01d1, B:120:0x01d2, B:121:0x01d9, B:122:0x01da, B:123:0x01e1, B:124:0x01e2), top: B:138:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114 A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #4 {all -> 0x012b, blocks: (B:58:0x0110, B:60:0x0114, B:77:0x0150, B:79:0x0154), top: B:132:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154 A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #4 {all -> 0x012b, blocks: (B:58:0x0110, B:60:0x0114, B:77:0x0150, B:79:0x0154), top: B:132:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #3 {all -> 0x004a, blocks: (B:18:0x0045, B:98:0x01a3, B:24:0x0062, B:84:0x0170, B:86:0x0175), top: B:132:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0186 A[Catch: all -> 0x019e, TRY_LEAVE, TryCatch #13 {all -> 0x019e, blocks: (B:90:0x0182, B:92:0x0186), top: B:139:0x0182 }] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v9, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [ads_mobile_sdk.tx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12, types: [ads_mobile_sdk.tx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14, types: [ads_mobile_sdk.tx0] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [ads_mobile_sdk.tx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [ads_mobile_sdk.tx0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v26, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ads_mobile_sdk.th3, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tx0.b(java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.rx0
            if (r0 == 0) goto L14
            r0 = r10
            ads_mobile_sdk.rx0 r0 = (ads_mobile_sdk.rx0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ads_mobile_sdk.rx0 r0 = new ads_mobile_sdk.rx0
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.a
            int r0 = r6.c
            r1 = 0
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L2a
            dev.epro.r0.E17665849472693074628.k(r10)
            return r7
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r1
        L30:
            dev.epro.r0.E17665849472693074628.k(r10)
            ads_mobile_sdk.kh3 r10 = r8.u
            if (r10 == 0) goto L60
            ads_mobile_sdk.x60 r8 = r8.d
            if (r8 == 0) goto L60
            r6.c = r2
            java.lang.String r3 = r10.a
            dev.epro.r0.E17149812035295265804 r10 = dev.epro.r0.E17093345031926825464.b
            dev.epro.r0.O16637889491137121389 r10 = r8.c
            r10.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            dev.epro.r0.N13798149404328803870 r10 = dev.epro.r0.N13798149404328803870.d
            long r4 = dev.epro.r0.M9216324016624295870.a0(r0, r10)
            r1 = r8
            r2 = r9
            java.lang.Object r8 = r1.a(r2, r3, r4, r6)
            dev.epro.r0.Z3437138737604933638 r9 = dev.epro.r0.Z3437138737604933638.a
            if (r8 != r9) goto L5b
            goto L5c
        L5b:
            r8 = r7
        L5c:
            if (r8 != r9) goto L5f
            return r9
        L5f:
            return r7
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tx0.c(java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final ads_mobile_sdk.sy0 d() {
        ads_mobile_sdk.sy0 sy0Var;
        synchronized (this) {
            sy0Var = this.q;
        }
        return sy0Var;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        if (!this.l.getAndSet(true)) {
            ads_mobile_sdk.ql1 ql1Var = this.j.a;
            ql1Var.c = ql1Var.b.decrementAndGet();
        }
        this.k.set(true);
        ads_mobile_sdk.x60 x60Var = this.d;
        if (x60Var != null) {
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = x60Var.a;
            dev.epro.r0.N4024785987441166868 n4024785987441166868 = new dev.epro.r0.N4024785987441166868(x60Var, (dev.epro.r0.R4833348786910499294) null, (byte) 21);
            dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(n4024785987441166868, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        super.destroy();
    }

    public final ads_mobile_sdk.fs3 e() {
        ads_mobile_sdk.fs3 fs3Var;
        synchronized (this) {
            fs3Var = this.r;
        }
        return fs3Var;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        float f;
        if (this.k.get()) {
            setMeasuredDimension(0, 0);
            return;
        }
        ads_mobile_sdk.fs3 fs3VarE = e();
        if (isInEditMode() || fs3VarE.a == 1 || this.n.get() || (i3 = fs3VarE.a) == 4) {
            super.onMeasure(i, i2);
            return;
        }
        if (i3 == 5) {
            ads_mobile_sdk.sy0 sy0VarD = d();
            if (sy0VarD != null) {
                synchronized (sy0VarD.f) {
                    f = sy0VarD.h;
                }
            } else {
                f = 0.0f;
            }
            if (f <= 0.0f) {
                super.onMeasure(i, i2);
                return;
            }
            int size = android.view.View.MeasureSpec.getSize(i);
            int size2 = android.view.View.MeasureSpec.getSize(i2);
            int i5 = (int) (size2 * f);
            int i6 = (int) (size / f);
            if (size2 == 0 && i6 != 0) {
                i5 = size;
                size2 = i6;
            } else if (size != 0 || i5 == 0) {
                i5 = size;
                size = i5;
                i6 = size2;
                size2 = i6;
            } else {
                i6 = size2;
                size = i5;
            }
            setMeasuredDimension(java.lang.Math.min(size, i5), java.lang.Math.min(size2, i6));
            return;
        }
        byte b = 2;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        if (fs3VarE.d) {
            ads_mobile_sdk.zi3.a(this.c, new ads_mobile_sdk.bx0(this, r4833348786910499294, b));
            synchronized (this) {
                i4 = this.s;
            }
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), i4 == -1 ? android.view.View.MeasureSpec.getSize(i2) : (int) (i4 * this.w.density));
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size3 = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size4 = android.view.View.MeasureSpec.getSize(i2);
        int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : Integer.MAX_VALUE;
        int i8 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size4 : Integer.MAX_VALUE;
        int i9 = fs3VarE.b;
        if (i9 > i7 || fs3VarE.c > i8) {
            float f2 = this.w.density;
            int i10 = (int) (size3 / f2);
            int i11 = (int) (size4 / f2);
            java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p((int) (i9 / f2), (int) (fs3VarE.c / f2), "Not enough space to show the full ad. Need ", "x", " dp, but only have ");
            sbP.append(i10);
            sbP.append("x");
            sbP.append(i11);
            sbP.append(" dp.");
            java.lang.String string = sbP.toString();
            ads_mobile_sdk.xv.c(string, null);
            if (!this.m.getAndSet(true)) {
                ads_mobile_sdk.zi3.a(this.c, new ads_mobile_sdk.gx0(this, string, r4833348786910499294, b));
            }
        }
        if (getVisibility() != 8) {
            setVisibility(0);
        }
        setMeasuredDimension(fs3VarE.b, fs3VarE.c);
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        super.onPause();
        this.g.getClass();
        try {
            if (dev.epro.r0.Q6344330807969154194.b(androidx.webkit.WebViewFeature.MUTE_AUDIO)) {
                androidx.webkit.WebViewCompat.setAudioMuted(this, true);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        this.g.getClass();
        try {
            if (dev.epro.r0.Q6344330807969154194.b(androidx.webkit.WebViewFeature.MUTE_AUDIO)) {
                androidx.webkit.WebViewCompat.setAudioMuted(this, false);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        dev.epro.r0.L4980660535418402690 l4980660535418402690 = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = null;
        if (l4980660535418402690 != null) {
            ((ads_mobile_sdk.ew1) l4980660535418402690.b).onTouch(null, motionEvent);
            o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        }
        if (o9245300239821758723 == null) {
            ads_mobile_sdk.k8 k8Var = this.f;
            k8Var.getClass();
            ads_mobile_sdk.ga3 ga3Var = ((ads_mobile_sdk.f7) k8Var.b().a).b;
            dev.epro.r0.K17751841687800543607 k17751841687800543607 = (dev.epro.r0.K17751841687800543607) ga3Var.f.get();
            if (k17751841687800543607 == null) {
                ga3Var.e.b(ads_mobile_sdk.yk0.EVENT_ID_EARLY_INPUT_EVENT);
            } else {
                k17751841687800543607.a(motionEvent);
            }
        }
        if (this.k.get()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final dev.epro.r0.C9731525580007922156 c() {
        dev.epro.r0.C9731525580007922156 c9731525580007922156 = this.x;
        if (c9731525580007922156 != null) {
            return c9731525580007922156;
        }
        dev.epro.r0.S10823041268949770285.b0("jsContext");
        throw null;
    }

    public final ads_mobile_sdk.iy0 b() {
        ads_mobile_sdk.iy0 iy0Var = this.y;
        if (iy0Var != null) {
            return iy0Var;
        }
        dev.epro.r0.S10823041268949770285.b0("gmaWebViewClient");
        throw null;
    }

    public final java.lang.Object b(dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object objA = a(str + "(" + i16631908410500040363 + ");", r4833348786910499294);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : dev.epro.r0.O9245300239821758723.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, java.util.UUID r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.cx0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.cx0 r0 = (ads_mobile_sdk.cx0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.cx0 r0 = new ads_mobile_sdk.cx0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.String r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2e:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r5
            r0.d = r2
            java.lang.Object r8 = r4.a(r5, r6, r7, r0)
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r8 != r4) goto L3e
            return r4
        L3e:
            dev.epro.r0.M16184408391440927034 r8 = (dev.epro.r0.M16184408391440927034) r8
            boolean r4 = r8 instanceof ads_mobile_sdk.pu0
            if (r4 == 0) goto L47
            ads_mobile_sdk.pu0 r8 = (ads_mobile_sdk.pu0) r8
            return r8
        L47:
            r8.getClass()
            ads_mobile_sdk.xu0 r8 = (ads_mobile_sdk.xu0) r8
            java.lang.Object r4 = r8.b
            dev.epro.r0.I16631908410500040363 r4 = (dev.epro.r0.I16631908410500040363) r4
            if (r4 != 0) goto L5e
            ads_mobile_sdk.tu0 r4 = new ads_mobile_sdk.tu0
            java.lang.String r6 = "Null response from "
            java.lang.String r5 = dev.epro.r0.G6547577305291411977.C(r6, r5)
            r4.<init>(r5, r2)
            return r4
        L5e:
            ads_mobile_sdk.xu0 r5 = new ads_mobile_sdk.xu0
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tx0.b(java.lang.String, java.lang.String, java.util.UUID, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.R4833348786910499294 r8) {
        /*
            r7 = this;
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            boolean r1 = r8 instanceof ads_mobile_sdk.dx0
            if (r1 == 0) goto L15
            r1 = r8
            ads_mobile_sdk.dx0 r1 = (ads_mobile_sdk.dx0) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            ads_mobile_sdk.dx0 r1 = new ads_mobile_sdk.dx0
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.b
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            int r3 = r1.d
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2e
            ads_mobile_sdk.tx0 r7 = r1.a
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Throwable -> L2c
            return r0
        L2c:
            r8 = move-exception
            goto L68
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L34:
            dev.epro.r0.E17665849472693074628.k(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.k
            boolean r8 = r8.getAndSet(r5)
            if (r8 == 0) goto L40
            goto L67
        L40:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.l
            boolean r8 = r8.getAndSet(r5)
            if (r8 != 0) goto L54
            ads_mobile_sdk.xj r8 = r7.j
            ads_mobile_sdk.ql1 r8 = r8.a
            java.util.concurrent.atomic.AtomicInteger r3 = r8.b
            int r3 = r3.decrementAndGet()
            r8.c = r3
        L54:
            dev.epro.r0.G8001132634698687269 r8 = r7.a     // Catch: java.lang.Throwable -> L2c
            ads_mobile_sdk.ex0 r3 = new ads_mobile_sdk.ex0     // Catch: java.lang.Throwable -> L2c
            r6 = 0
            r3.<init>(r7, r4, r6)     // Catch: java.lang.Throwable -> L2c
            r1.a = r7     // Catch: java.lang.Throwable -> L2c
            r1.d = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = dev.epro.r0.R7033599853981556291.d0(r8, r3, r1)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r2) goto L67
            return r2
        L67:
            return r0
        L68:
            ads_mobile_sdk.ci3 r7 = r7.e
            java.lang.String r1 = "GmaWebView.destroySafe"
            r7.a(r1, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tx0.a(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public final java.lang.Object a(dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object objA = a("(window.AFMA_ReceiveMessage || function() {})('" + str + "', " + i16631908410500040363 + ");", r4833348786910499294);
        return objA == dev.epro.r0.Z3437138737604933638.a ? objA : dev.epro.r0.O9245300239821758723.a;
    }

    public final java.lang.Object a(java.lang.String str, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        boolean z = this.k.get();
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (!z) {
            dev.epro.r0.R4833348786910499294 r48333487869104992942 = null;
            if (android.os.Looper.getMainLooper().isCurrentThread()) {
                evaluateJavascript(str, null);
                return o9245300239821758723;
            }
            java.lang.Object objD0 = dev.epro.r0.R7033599853981556291.d0(this.a, new ads_mobile_sdk.gx0(this, str, r48333487869104992942, (byte) 0), r4833348786910499294);
            if (objD0 == dev.epro.r0.Z3437138737604933638.a) {
                return objD0;
            }
        }
        return o9245300239821758723;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, java.util.UUID r20, dev.epro.r0.K14749510448791472029 r21) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tx0.a(java.lang.String, java.lang.String, java.util.UUID, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object a(ads_mobile_sdk.tx0 tx0Var, java.lang.String str, java.lang.String str2, boolean z, dev.epro.r0.K14749510448791472029 k14749510448791472029, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return tx0Var.a(str, str2, "text/html", "UTF-8", z, k14749510448791472029);
    }

    public final void a(ads_mobile_sdk.fs3 fs3Var) {
        fs3Var.getClass();
        synchronized (this) {
            this.r = fs3Var;
        }
        requestLayout();
    }
}
