package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class hv {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final I16631908410500040363 e;
    public final I16631908410500040363 f;
    public final mp g;
    public final String h;
    public final I16631908410500040363 i;
    public final boolean j;
    public final long k;
    public final int l;
    public final ArrayList m;
    public final long n;

    /* renamed from: o, reason: collision with root package name */
    public final long f51o;
    public final int p;
    public final I16631908410500040363 q;
    public final String r;
    public final boolean s;
    public final I16631908410500040363 t;
    public final boolean u;

    public hv(String str, String str2, String str3, String str4, I16631908410500040363 i16631908410500040363, I16631908410500040363 i166319084105000403632, mp mpVar, String str5, I16631908410500040363 i166319084105000403633, boolean z, long j, int i, ArrayList arrayList, long j2, long j3, int i2, I16631908410500040363 i166319084105000403634, String str6, boolean z2, I16631908410500040363 i166319084105000403635, boolean z3) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv)) {
            return false;
        }
        hv hvVar = (hv) obj;
        return this.a.equals(hvVar.a) && this.b.equals(hvVar.b) && this.c.equals(hvVar.c) && this.d.equals(hvVar.d) && S10823041268949770285.t(this.e, hvVar.e) && S10823041268949770285.t(this.f, hvVar.f) && S10823041268949770285.t(this.g, hvVar.g) && this.h.equals(hvVar.h) && S10823041268949770285.t(this.i, hvVar.i) && this.j == hvVar.j && this.k == hvVar.k && this.l == hvVar.l && this.m.equals(hvVar.m) && E17093345031926825464.d(this.n, hvVar.n) && E17093345031926825464.d(this.f51o, hvVar.f51o) && this.p == hvVar.p && this.q.equals(hvVar.q) && this.r.equals(hvVar.r) && this.s == hvVar.s && S10823041268949770285.t(this.t, hvVar.t) && this.u == hvVar.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f.a.hashCode() + ((this.e.a.hashCode() + E12098517352909843120.h(E12098517352909843120.h(E12098517352909843120.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31;
        mp mpVar = this.g;
        int hashCode2 = (this.i.a.hashCode() + E12098517352909843120.h((hashCode + (mpVar == null ? 0 : mpVar.hashCode())) * 31, 31, this.h)) * 31;
        boolean z = this.j;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int k = G6547577305291411977.k(this.m, U1554499319261669842.h(this.l, G6547577305291411977.j((hashCode2 + i) * 31, this.k, 31)), 31);
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        int h = E12098517352909843120.h((this.q.a.hashCode() + U1554499319261669842.h(this.p, G6547577305291411977.j(G6547577305291411977.j(k, this.n, 31), this.f51o, 31))) * 31, 31, this.r);
        boolean z2 = this.s;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (h + i2) * 31;
        I16631908410500040363 i16631908410500040363 = this.t;
        int hashCode3 = (i3 + (i16631908410500040363 != null ? i16631908410500040363.a.hashCode() : 0)) * 31;
        boolean z3 = this.u;
        return hashCode3 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final String toString() {
        String l = E17093345031926825464.l(this.n);
        String l2 = E17093345031926825464.l(this.f51o);
        StringBuilder y = G6547577305291411977.y("CommonConfiguration(adapterResponseReplacementKey=", this.a, ", adRequestPostBody=", this.b, ", adRequestUrl=");
        G6547577305291411977.B(y, this.c, ", adResponseBody=", this.d, ", adResponseHeaders=");
        y.append(this.e);
        y.append(", biddingData=");
        y.append(this.f);
        y.append(", bowResponseError=");
        y.append(this.g);
        y.append(", gwsQueryId=");
        y.append(this.h);
        y.append(", inspectorExtras=");
        y.append(this.i);
        y.append(", isIdless=");
        y.append(this.j);
        y.append(", latency=");
        y.append(this.k);
        y.append(", maxParallelRenderers=");
        y.append(this.l);
        y.append(", noFillUrls=");
        y.append(this.m);
        y.append(", refreshInterval=");
        y.append(l);
        y.append(", proactiveRefreshLoadDelayInterval=");
        y.append(l2);
        y.append(", responseCode=");
        y.append(this.p);
        y.append(", responseInfoExtras=");
        y.append(this.q);
        y.append(", scionQueryEventId=");
        y.append(this.r);
        y.append(", isPersistentAdEnabled=");
        y.append(this.s);
        y.append(", throttleConfiguration=");
        y.append(this.t);
        y.append(", isCrossProcessAdEnabled=");
        y.append(this.u);
        y.append(")");
        return y.toString();
    }
}
