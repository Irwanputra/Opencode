package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hv {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final dev.epro.r0.I16631908410500040363 e;
    public final dev.epro.r0.I16631908410500040363 f;
    public final ads_mobile_sdk.mp g;
    public final java.lang.String h;
    public final dev.epro.r0.I16631908410500040363 i;
    public final boolean j;
    public final long k;
    public final int l;
    public final java.util.ArrayList m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f51o;
    public final int p;
    public final dev.epro.r0.I16631908410500040363 q;
    public final java.lang.String r;
    public final boolean s;
    public final dev.epro.r0.I16631908410500040363 t;
    public final boolean u;

    public hv(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, dev.epro.r0.I16631908410500040363 i16631908410500040363, dev.epro.r0.I16631908410500040363 i166319084105000403632, ads_mobile_sdk.mp mpVar, java.lang.String str5, dev.epro.r0.I16631908410500040363 i166319084105000403633, boolean z, long j, int i, java.util.ArrayList arrayList, long j2, long j3, int i2, dev.epro.r0.I16631908410500040363 i166319084105000403634, java.lang.String str6, boolean z2, dev.epro.r0.I16631908410500040363 i166319084105000403635, boolean z3) {
        i16631908410500040363.getClass();
        i166319084105000403632.getClass();
        i166319084105000403633.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i16631908410500040363;
        this.f = i166319084105000403632;
        this.g = mpVar;
        this.h = str5;
        this.i = i166319084105000403633;
        this.j = z;
        this.k = j;
        this.l = i;
        this.m = arrayList;
        this.n = j2;
        this.f51o = j3;
        this.p = i2;
        this.q = i166319084105000403634;
        this.r = str6;
        this.s = z2;
        this.t = i166319084105000403635;
        this.u = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.hv)) {
            return false;
        }
        ads_mobile_sdk.hv hvVar = (ads_mobile_sdk.hv) obj;
        return this.a.equals(hvVar.a) && this.b.equals(hvVar.b) && this.c.equals(hvVar.c) && this.d.equals(hvVar.d) && dev.epro.r0.S10823041268949770285.t(this.e, hvVar.e) && dev.epro.r0.S10823041268949770285.t(this.f, hvVar.f) && dev.epro.r0.S10823041268949770285.t(this.g, hvVar.g) && this.h.equals(hvVar.h) && dev.epro.r0.S10823041268949770285.t(this.i, hvVar.i) && this.j == hvVar.j && this.k == hvVar.k && this.l == hvVar.l && this.m.equals(hvVar.m) && dev.epro.r0.E17093345031926825464.d(this.n, hvVar.n) && dev.epro.r0.E17093345031926825464.d(this.f51o, hvVar.f51o) && this.p == hvVar.p && this.q.equals(hvVar.q) && this.r.equals(hvVar.r) && this.s == hvVar.s && dev.epro.r0.S10823041268949770285.t(this.t, hvVar.t) && this.u == hvVar.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    public final int hashCode() {
        int iHashCode = (this.f.a.hashCode() + ((this.e.a.hashCode() + dev.epro.r0.E12098517352909843120.h(dev.epro.r0.E12098517352909843120.h(dev.epro.r0.E12098517352909843120.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31;
        ads_mobile_sdk.mp mpVar = this.g;
        int iHashCode2 = (this.i.a.hashCode() + dev.epro.r0.E12098517352909843120.h((iHashCode + (mpVar == null ? 0 : mpVar.hashCode())) * 31, 31, this.h)) * 31;
        boolean z = this.j;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        int iK = dev.epro.r0.G6547577305291411977.k(this.m, dev.epro.r0.U1554499319261669842.h(this.l, dev.epro.r0.G6547577305291411977.j((iHashCode2 + r4) * 31, this.k, 31)), 31);
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        int iH = dev.epro.r0.E12098517352909843120.h((this.q.a.hashCode() + dev.epro.r0.U1554499319261669842.h(this.p, dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(iK, this.n, 31), this.f51o, 31))) * 31, 31, this.r);
        boolean z2 = this.s;
        ?? r42 = z2;
        if (z2) {
            r42 = 1;
        }
        int i = (iH + r42) * 31;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.t;
        int iHashCode3 = (i + (i16631908410500040363 != null ? i16631908410500040363.a.hashCode() : 0)) * 31;
        boolean z3 = this.u;
        return iHashCode3 + (z3 ? 1 : z3);
    }

    public final java.lang.String toString() {
        java.lang.String strL = dev.epro.r0.E17093345031926825464.l(this.n);
        java.lang.String strL2 = dev.epro.r0.E17093345031926825464.l(this.f51o);
        java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("CommonConfiguration(adapterResponseReplacementKey=", this.a, ", adRequestPostBody=", this.b, ", adRequestUrl=");
        dev.epro.r0.G6547577305291411977.B(sbY, this.c, ", adResponseBody=", this.d, ", adResponseHeaders=");
        sbY.append(this.e);
        sbY.append(", biddingData=");
        sbY.append(this.f);
        sbY.append(", bowResponseError=");
        sbY.append(this.g);
        sbY.append(", gwsQueryId=");
        sbY.append(this.h);
        sbY.append(", inspectorExtras=");
        sbY.append(this.i);
        sbY.append(", isIdless=");
        sbY.append(this.j);
        sbY.append(", latency=");
        sbY.append(this.k);
        sbY.append(", maxParallelRenderers=");
        sbY.append(this.l);
        sbY.append(", noFillUrls=");
        sbY.append(this.m);
        sbY.append(", refreshInterval=");
        sbY.append(strL);
        sbY.append(", proactiveRefreshLoadDelayInterval=");
        sbY.append(strL2);
        sbY.append(", responseCode=");
        sbY.append(this.p);
        sbY.append(", responseInfoExtras=");
        sbY.append(this.q);
        sbY.append(", scionQueryEventId=");
        sbY.append(this.r);
        sbY.append(", isPersistentAdEnabled=");
        sbY.append(this.s);
        sbY.append(", throttleConfiguration=");
        sbY.append(this.t);
        sbY.append(", isCrossProcessAdEnabled=");
        sbY.append(this.u);
        sbY.append(")");
        return sbY.toString();
    }
}
