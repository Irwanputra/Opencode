package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class jx2 {
    public final ads_mobile_sdk.jr0 a;
    public final ads_mobile_sdk.n42 b;
    public final dev.epro.r0.O16637889491137121389 c;
    public final dev.epro.r0.W5797197595347441198 d;
    public final dev.epro.r0.O12043144740933444288 e;
    public final ads_mobile_sdk.dn3 f;
    public final ads_mobile_sdk.hs g;
    public final ads_mobile_sdk.kz2 h;
    public final ads_mobile_sdk.ci3 i;

    public jx2(ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.n42 n42Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.O12043144740933444288 o12043144740933444288, ads_mobile_sdk.dn3 dn3Var, ads_mobile_sdk.hs hsVar, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.ci3 ci3Var) {
        jr0Var.getClass();
        n42Var.getClass();
        o16637889491137121389.getClass();
        w5797197595347441198.getClass();
        o12043144740933444288.getClass();
        dn3Var.getClass();
        hsVar.getClass();
        kz2Var.getClass();
        ci3Var.getClass();
        this.a = jr0Var;
        this.b = n42Var;
        this.c = o16637889491137121389;
        this.d = w5797197595347441198;
        this.e = o12043144740933444288;
        this.f = dn3Var;
        this.g = hsVar;
        this.h = kz2Var;
        this.i = ci3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136 A[Catch: Exception -> 0x0084, IOException -> 0x0185, TRY_ENTER, TryCatch #9 {IOException -> 0x0185, blocks: (B:47:0x00d3, B:64:0x0136, B:66:0x013a), top: B:127:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r20, ads_mobile_sdk.v22 r21, int r22, long r23, java.lang.String r25, java.util.Map r26, ads_mobile_sdk.y2 r27, ads_mobile_sdk.z1 r28, java.lang.Boolean r29, dev.epro.r0.K14749510448791472029 r30) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jx2.a(android.net.Uri, ads_mobile_sdk.v22, int, long, java.lang.String, java.util.Map, ads_mobile_sdk.y2, ads_mobile_sdk.z1, java.lang.Boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.y2 r9, java.lang.String r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.dx2
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.dx2 r0 = (ads_mobile_sdk.dx2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.dx2 r0 = new ads_mobile_sdk.dx2
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            if (r1 == 0) goto L37
            if (r1 != r3) goto L30
            java.lang.String r10 = r0.b
            ads_mobile_sdk.jx2 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r11)     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            return r4
        L2c:
            r9 = move-exception
            goto L72
        L2e:
            r9 = move-exception
            goto L92
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            r8 = 0
            return r8
        L37:
            dev.epro.r0.E17665849472693074628.k(r11)
            if (r10 == 0) goto Lb2
            int r11 = r10.length()
            if (r11 != 0) goto L43
            goto Lb2
        L43:
            dev.epro.r0.K15572083692188606544 r11 = dev.epro.r0.R7033599853981556291.K(r10)     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            dev.epro.r0.I16631908410500040363 r11 = r11.l()     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            ads_mobile_sdk.o9 r11 = dev.epro.r0.P13747563277035175218.c(r11)     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            dev.epro.r0.S8229747050136740165 r1 = new dev.epro.r0.S8229747050136740165     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            int r5 = r11.c     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            long r6 = r11.b     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            java.lang.String r11 = r11.d     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            r1.<init>(r11, r5, r6)     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            r0.a = r8     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            r0.b = r10     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            r0.e = r3     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.e     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            boolean r11 = r11.getAndSet(r3)     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
            if (r11 == 0) goto L69
            goto L6c
        L69:
            r9.a(r1, r0)     // Catch: java.lang.Exception -> L2c dev.epro.r0.X13554947934760653097 -> L2e
        L6c:
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r8) goto L71
            return r8
        L71:
            return r4
        L72:
            ads_mobile_sdk.tu0 r11 = new ads_mobile_sdk.tu0
            java.lang.String r0 = "Failed while emitting ad paid event for "
            java.lang.String r1 = dev.epro.r0.G6547577305291411977.C(r0, r10)
            r11.<init>(r1, r3)
            ads_mobile_sdk.zi3.a(r11, r2)
            ads_mobile_sdk.ci3 r8 = r8.i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r8.a(r10, r9)
            return r4
        L92:
            ads_mobile_sdk.tu0 r11 = new ads_mobile_sdk.tu0
            java.lang.String r0 = "Failed to parse ad event value from JSON: "
            java.lang.String r1 = dev.epro.r0.G6547577305291411977.C(r0, r10)
            r11.<init>(r1, r3)
            ads_mobile_sdk.zi3.a(r11, r2)
            ads_mobile_sdk.ci3 r8 = r8.i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r8.a(r10, r9)
            return r4
        Lb2:
            ads_mobile_sdk.tu0 r8 = new ads_mobile_sdk.tu0
            java.lang.String r9 = "AdEventValueString is null or empty"
            r8.<init>(r9, r3)
            ads_mobile_sdk.zi3.a(r8, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jx2.a(ads_mobile_sdk.y2, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b5 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #7 {all -> 0x018f, blocks: (B:91:0x017c, B:93:0x0183, B:95:0x0187, B:97:0x018b, B:100:0x0192, B:102:0x0196, B:104:0x019a, B:106:0x019e, B:107:0x019f, B:108:0x01a4, B:109:0x01a5, B:110:0x01ac, B:111:0x01ad, B:112:0x01b4, B:113:0x01b5), top: B:129:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:45:0x00d6, B:47:0x00dd, B:49:0x00e1, B:51:0x00e5, B:54:0x00ec, B:56:0x00f0, B:58:0x00f4, B:60:0x00f8, B:61:0x00f9, B:62:0x00fe, B:63:0x00ff, B:64:0x0106, B:65:0x0107, B:66:0x010e, B:67:0x010f), top: B:125:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #4 {all -> 0x00e9, blocks: (B:45:0x00d6, B:47:0x00dd, B:49:0x00e1, B:51:0x00e5, B:54:0x00ec, B:56:0x00f0, B:58:0x00f4, B:60:0x00f8, B:61:0x00f9, B:62:0x00fe, B:63:0x00ff, B:64:0x0106, B:65:0x0107, B:66:0x010e, B:67:0x010f), top: B:125:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183 A[Catch: all -> 0x018f, TryCatch #7 {all -> 0x018f, blocks: (B:91:0x017c, B:93:0x0183, B:95:0x0187, B:97:0x018b, B:100:0x0192, B:102:0x0196, B:104:0x019a, B:106:0x019e, B:107:0x019f, B:108:0x01a4, B:109:0x01a5, B:110:0x01ac, B:111:0x01ad, B:112:0x01b4, B:113:0x01b5), top: B:129:0x017c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r17, ads_mobile_sdk.xu0 r18, ads_mobile_sdk.y2 r19, dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jx2.a(android.net.Uri, ads_mobile_sdk.xu0, ads_mobile_sdk.y2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final java.lang.String a(android.net.Uri uri, int i) {
        if (((java.lang.Boolean) this.a.a("gads:include_ping_attempts:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            java.lang.String encodedQuery = uri.getEncodedQuery();
            return uri.buildUpon().clearQuery().appendQueryParameter("pa", java.lang.String.valueOf(i)).build() + "&" + encodedQuery;
        }
        java.lang.String string = uri.toString();
        string.getClass();
        return string;
    }

    public final boolean a(android.net.Uri uri) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        ads_mobile_sdk.jr0 jr0Var = this.a;
        if (!((java.lang.Boolean) jr0Var.a("gads:ad_event_value:validate_domain:enabled", bool, aoVar)).booleanValue()) {
            return true;
        }
        java.lang.String host = uri.getHost();
        if (host != null) {
            java.util.List list = (java.util.List) jr0Var.a("gads:ad_event_value:trusted_domains", dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{"doubleclick.net", "google.com", "googleadservices.com"}), ads_mobile_sdk.ao.a$23);
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String strI0 = dev.epro.r0.M8927913404651150384.i0((java.lang.String) it.next(), ".");
                    if (host.equals(strI0) || dev.epro.r0.Z13168519540281190457.z(host, ".".concat(strI0), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a(android.net.Uri uri, ads_mobile_sdk.z1 z1Var, ads_mobile_sdk.hv hvVar, ads_mobile_sdk.y2 y2Var, java.lang.Boolean bool) {
        uri.getClass();
        z1Var.getClass();
        hvVar.getClass();
        ads_mobile_sdk.jr0 jr0Var = this.a;
        jr0Var.getClass();
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        boolean zBooleanValue = ((java.lang.Boolean) jr0Var.a("gads:use_retry_strategy:enabled", bool2, aoVar)).booleanValue();
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
        if (zBooleanValue && z1Var.w0 != null) {
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.V8338995781648207308(this, uri, z1Var, hvVar, y2Var, bool, (dev.epro.r0.R4833348786910499294) null, (byte) 3), 3);
            return;
        }
        if (y2Var != null && dev.epro.r0.S10823041268949770285.t(bool, bool2) && ((java.lang.Boolean) jr0Var.a("gads:ad_events_for_scar:enabled", bool2, aoVar)).booleanValue() && z1Var.A0) {
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.S14769385926647291222(this, uri, y2Var, (dev.epro.r0.R4833348786910499294) null, (byte) 5), 3);
            return;
        }
        java.util.Map mapA = this.g.a(uri);
        ads_mobile_sdk.dn3 dn3Var = this.f;
        dn3Var.getClass();
        dn3Var.e.a(new dev.epro.r0.H9390398899829886498(uri, mapA));
    }

    public static void a(ads_mobile_sdk.jx2 jx2Var, java.util.List list, ads_mobile_sdk.z1 z1Var, ads_mobile_sdk.hv hvVar, ads_mobile_sdk.y2 y2Var, java.lang.Boolean bool, int i) {
        if ((i & 8) != 0) {
            y2Var = null;
        }
        ads_mobile_sdk.y2 y2Var2 = y2Var;
        if ((i & 16) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        java.lang.Boolean bool2 = bool;
        jx2Var.getClass();
        list.getClass();
        z1Var.getClass();
        hvVar.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            jx2Var.a((android.net.Uri) it.next(), z1Var, hvVar, y2Var2, bool2);
        }
    }

    public final void a(java.util.List list) {
        list.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.net.Uri uri = (android.net.Uri) it.next();
            arrayList.add(new dev.epro.r0.H9390398899829886498(uri, this.g.a(uri)));
        }
        ads_mobile_sdk.dn3 dn3Var = this.f;
        dn3Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            dev.epro.r0.H9390398899829886498 h9390398899829886498 = (dev.epro.r0.H9390398899829886498) obj;
            dn3Var.e.a(new dev.epro.r0.H9390398899829886498((android.net.Uri) h9390398899829886498.a, (java.util.Map) h9390398899829886498.b));
        }
    }

    public final void a(android.net.Uri uri, ads_mobile_sdk.v22 v22Var, int i, long j, java.lang.String str, java.util.Map map, ads_mobile_sdk.y2 y2Var, ads_mobile_sdk.z1 z1Var, java.lang.Boolean bool) {
        if (i >= v22Var.a) {
            if (v22Var.c) {
                this.c.getClass();
                ads_mobile_sdk.g42 g42Var = new ads_mobile_sdk.g42(str, a(uri, i + 1), android.os.SystemClock.elapsedRealtime());
                ads_mobile_sdk.n42 n42Var = this.b;
                n42Var.getClass();
                dev.epro.r0.R7033599853981556291.E(n42Var.a, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.I5566604416186847280(n42Var, new dev.epro.r0.H4546125934900659656(n42Var, g42Var, (dev.epro.r0.R4833348786910499294) null, (byte) 7), (dev.epro.r0.R4833348786910499294) null, (byte) 2), 3);
                return;
            }
            return;
        }
        dev.epro.r0.R7033599853981556291.E(this.d, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.ix2(i, j, uri, z1Var, y2Var, v22Var, this, bool, str, map, null), 3);
    }
}
