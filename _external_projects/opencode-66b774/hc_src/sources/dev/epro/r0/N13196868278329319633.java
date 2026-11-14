package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N13196868278329319633 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f381o;
    public boolean p;
    public N13196868278329319633 q;

    public N13196868278329319633(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.f381o = z3;
        this.p = z3;
    }

    public final void a() {
        N13196868278329319633 n13196868278329319633 = this.q;
        if (n13196868278329319633 == null) {
            this.f381o = true;
            this.p = true;
        } else if (n13196868278329319633 != null) {
            n13196868278329319633.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        return arrayList == null ? O2161699089510411363.a : arrayList;
    }

    public final boolean c() {
        N13196868278329319633 n13196868278329319633 = this.q;
        return n13196868278329319633 != null ? n13196868278329319633.c() : this.f381o || this.p;
    }

    public final String toString() {
        String N = G16660188620551127941.N(this.a);
        String h = L2216691091636065972.h(this.c);
        String h2 = L2216691091636065972.h(this.g);
        boolean c = c();
        String a = O12393276431214249727.a(this.i);
        List b = b();
        String h3 = L2216691091636065972.h(this.j);
        String h4 = L2216691091636065972.h(this.l);
        StringBuilder h5 = X2485016533998461232.h("PointerInputChange(id=", N, ", uptimeMillis=", this.b);
        h5.append(", position=");
        h5.append(h);
        h5.append(", pressed=");
        h5.append(this.d);
        h5.append(", pressure=");
        h5.append(this.e);
        h5.append(", previousUptimeMillis=");
        h5.append(this.f);
        h5.append(", previousPosition=");
        h5.append(h2);
        h5.append(", previousPressed=");
        h5.append(this.h);
        h5.append(", isConsumed=");
        h5.append(c);
        h5.append(", type=");
        h5.append(a);
        h5.append(", historical=");
        h5.append(b);
        h5.append(", scrollDelta=");
        h5.append(h3);
        h5.append(", scaleFactor=");
        h5.append(this.k);
        return G6547577305291411977.v(h5, ", panOffset=", h4, ")");
    }

    public N13196868278329319633(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
