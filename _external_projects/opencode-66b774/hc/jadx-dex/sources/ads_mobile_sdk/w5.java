package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class w5 implements dev.epro.r0.R16693852608535438299 {
    public final dev.epro.r0.U4857089234315512256 a;
    public final long b;
    public final dev.epro.r0.P14363171583196137821 f;
    public final boolean g;
    public final ads_mobile_sdk.qw2 h;
    public final byte i;
    public final boolean j;
    public final boolean k;
    public final ads_mobile_sdk.jr0 l;
    public final long m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f120o;

    /* JADX WARN: Multi-variable type inference failed */
    public w5(dev.epro.r0.U4857089234315512256 u4857089234315512256, long j, dev.epro.r0.P14363171583196137821 p14363171583196137821, boolean z, ads_mobile_sdk.qw2 qw2Var, int i, boolean z2, boolean z3, ads_mobile_sdk.jr0 jr0Var, long j2, boolean z4, boolean z5) {
        u4857089234315512256.getClass();
        qw2Var.getClass();
        jr0Var.getClass();
        this.a = u4857089234315512256;
        this.b = j;
        this.f = p14363171583196137821;
        this.g = z;
        this.h = qw2Var;
        this.i = i;
        this.j = z2;
        this.k = z3;
        this.l = jr0Var;
        this.m = j2;
        this.n = z4;
        this.f120o = z5;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        java.lang.String str = this.f.a;
        p3477296814990354048.getClass();
        p3477296814990354048.r = this.b;
        dev.epro.r0.U4857089234315512256 u4857089234315512256 = this.a;
        java.lang.String strE = u4857089234315512256.e();
        java.util.HashSet hashSet = u4857089234315512256.f;
        java.util.HashSet hashSet2 = u4857089234315512256.e;
        java.util.LinkedHashSet linkedHashSet = u4857089234315512256.a;
        p3477296814990354048.o = strE;
        p3477296814990354048.H = u4857089234315512256.b;
        java.util.LinkedHashMap linkedHashMap = u4857089234315512256.c;
        if (!linkedHashMap.isEmpty() || !linkedHashSet.isEmpty()) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.putAll(linkedHashMap);
            if (!linkedHashSet.isEmpty()) {
                linkedHashMap2.put("excl_cat", dev.epro.r0.R9411874267597469228.J0(linkedHashSet, ",", (java.lang.String) null, (java.lang.String) null, 0, (dev.epro.r0.F4096073349764486348) null, 62));
            }
            p3477296814990354048.J = linkedHashMap2;
        }
        p3477296814990354048.o1 = u4857089234315512256.d;
        if (!hashSet2.isEmpty()) {
            p3477296814990354048.s = new java.util.ArrayList(hashSet2);
        }
        if (!hashSet.isEmpty()) {
            p3477296814990354048.I = dev.epro.r0.R9411874267597469228.h1(hashSet);
        }
        p3477296814990354048.G = u4857089234315512256.h;
        p3477296814990354048.K = null;
        p3477296814990354048.B = 0;
        p3477296814990354048.L = 0;
        if (str.length() > 0) {
            p3477296814990354048.M = str;
        }
        p3477296814990354048.E = this.g;
        p3477296814990354048.M1 = java.lang.Integer.valueOf(this.i);
        ads_mobile_sdk.qw2 qw2Var = ads_mobile_sdk.qw2.j;
        ads_mobile_sdk.qw2 qw2Var2 = this.h;
        if (qw2Var2 == qw2Var) {
            p3477296814990354048.p = java.lang.Boolean.TRUE;
        }
        if (qw2Var2 == ads_mobile_sdk.qw2.k) {
            p3477296814990354048.q = java.lang.Boolean.TRUE;
        }
        p3477296814990354048.F = this.j;
        if (this.k) {
            p3477296814990354048.P1 = java.lang.Boolean.TRUE;
        }
        ads_mobile_sdk.jr0 jr0Var = this.l;
        jr0Var.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        if (((java.lang.Boolean) jr0Var.a("gads:enable_time_since_sdk_init:enabled", bool, aoVar)).booleanValue()) {
            p3477296814990354048.a(java.lang.Long.valueOf(this.m));
        }
        if (this.n) {
            p3477296814990354048.b();
        }
        if (this.f120o) {
            dev.epro.r0.B7506245556754967052 b7506245556754967052 = jr0Var.v;
            b7506245556754967052.getClass();
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (((java.lang.Boolean) b7506245556754967052.a("gads:pc:enabled", bool2, aoVar)).booleanValue()) {
                p3477296814990354048.e2 = bool2;
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.w5)) {
            return false;
        }
        ads_mobile_sdk.w5 w5Var = (ads_mobile_sdk.w5) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, w5Var.a) && this.b == w5Var.b && this.f == w5Var.f && this.g == w5Var.g && this.h == w5Var.h && this.i == w5Var.i && this.j == w5Var.j && this.k == w5Var.k && dev.epro.r0.S10823041268949770285.t(this.l, w5Var.l) && this.m == w5Var.m && this.n == w5Var.n && this.f120o == w5Var.f120o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((dev.epro.r0.E10962847735889454927.TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED.hashCode() + ((dev.epro.r0.J8812673740297114457.a.hashCode() + dev.epro.r0.G6547577305291411977.j(this.a.hashCode() * 31, this.b, 31)) * 31)) * 961)) * 31;
        boolean z = this.g;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int iH = dev.epro.r0.U1554499319261669842.h(this.i, (this.h.hashCode() + ((iHashCode + r3) * 31)) * 31);
        boolean z2 = this.j;
        ?? r32 = z2;
        if (z2) {
            r32 = 1;
        }
        int i = (iH + r32) * 31;
        boolean z3 = this.k;
        ?? r33 = z3;
        if (z3) {
            r33 = 1;
        }
        int iJ = dev.epro.r0.G6547577305291411977.j((this.l.hashCode() + ((i + r33) * 31)) * 31, this.m, 31);
        boolean z4 = this.n;
        ?? r34 = z4;
        if (z4) {
            r34 = 1;
        }
        int i2 = (iJ + r34) * 31;
        boolean z5 = this.f120o;
        return i2 + (z5 ? 1 : z5);
    }

    public final java.lang.String toString() {
        return "AdRequestSignal(adRequest=" + this.a + ", timestamp=" + this.b + ", tfcd=" + dev.epro.r0.J8812673740297114457.a + ", tfuac=" + dev.epro.r0.E10962847735889454927.TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED + ", ageRestrictedTreatment=null, maxAdContentRating=" + this.f + ", isTestRequest=" + this.g + ", requestType=" + this.h + ", publisherPrivacyPersonalizationState=" + ((int) this.i) + ", manualImpressionsRequested=" + this.j + ", isPrefetchRequest=" + this.k + ", flags=" + this.l + ", timeSinceSdkInitMs=" + this.m + ", isS2SRecursiveRequest=" + this.n + ", isPersistentCacheFillRequest=" + this.f120o + ")";
    }
}
