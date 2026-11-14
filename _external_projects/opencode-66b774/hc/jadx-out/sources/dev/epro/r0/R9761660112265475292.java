package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R9761660112265475292 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public R9761660112265475292(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R9761660112265475292)) {
            return false;
        }
        R9761660112265475292 r9761660112265475292 = (R9761660112265475292) obj;
        return G16660188620551127941.y(this.a, r9761660112265475292.a) && this.b == r9761660112265475292.b && L2216691091636065972.b(this.c, r9761660112265475292.c) && L2216691091636065972.b(this.d, r9761660112265475292.d) && this.e == r9761660112265475292.e && Float.compare(this.f, r9761660112265475292.f) == 0 && this.g == r9761660112265475292.g && this.h == r9761660112265475292.h && this.i.equals(r9761660112265475292.i) && L2216691091636065972.b(this.j, r9761660112265475292.j) && Float.compare(this.k, r9761660112265475292.k) == 0 && L2216691091636065972.b(this.l, r9761660112265475292.l) && L2216691091636065972.b(this.m, r9761660112265475292.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + G6547577305291411977.j(E12098517352909843120.e(this.k, G6547577305291411977.j(G6547577305291411977.k(this.i, G6547577305291411977.i(X2485016533998461232.f(this.g, E12098517352909843120.e(this.f, G6547577305291411977.i(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31), 31), 31, this.h), 31), this.j, 31), 31), this.l, 31);
    }

    public final String toString() {
        String strN = G16660188620551127941.N(this.a);
        String strH = L2216691091636065972.h(this.c);
        String strH2 = L2216691091636065972.h(this.d);
        String strA = O12393276431214249727.a(this.g);
        String strH3 = L2216691091636065972.h(this.j);
        String strH4 = L2216691091636065972.h(this.l);
        String strH5 = L2216691091636065972.h(this.m);
        StringBuilder sbH = X2485016533998461232.h("PointerInputEventData(id=", strN, ", uptime=", this.b);
        G6547577305291411977.B(sbH, ", positionOnScreen=", strH, ", position=", strH2);
        sbH.append(", down=");
        sbH.append(this.e);
        sbH.append(", pressure=");
        sbH.append(this.f);
        sbH.append(", type=");
        sbH.append(strA);
        sbH.append(", activeHover=");
        sbH.append(this.h);
        sbH.append(", historical=");
        sbH.append(this.i);
        sbH.append(", scrollDelta=");
        sbH.append(strH3);
        sbH.append(", scaleGestureFactor=");
        sbH.append(this.k);
        sbH.append(", panGestureOffset=");
        sbH.append(strH4);
        return G6547577305291411977.v(sbH, ", originalEventPosition=", strH5, ")");
    }
}
